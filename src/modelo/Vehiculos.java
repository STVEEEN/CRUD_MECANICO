/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Vista.frmMecanico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Estudiante
 */
public class Vehiculos {
    private String nombre_cliente;
    private int telefono_cliente;
    private String marca_vehiculo;
    private String modelo_vehiculo;
    private String problema_vehiculo;
    private String estado_problema;

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public int getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(int telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getMarca_vehiculo() {
        return marca_vehiculo;
    }

    public void setMarca_vehiculo(String marca_vehiculo) {
        this.marca_vehiculo = marca_vehiculo;
    }

    public String getModelo_vehiculo() {
        return modelo_vehiculo;
    }

    public void setModelo_vehiculo(String modelo_vehiculo) {
        this.modelo_vehiculo = modelo_vehiculo;
    }

    public String getProblema_vehiculo() {
        return problema_vehiculo;
    }

    public void setProblema_vehiculo(String problema_vehiculo) {
        this.problema_vehiculo = problema_vehiculo;
    }

    public String getEstado_problema() {
        return estado_problema;
    }

    public void setEstado_problema(String estado_problema) {
        this.estado_problema = estado_problema;
    }
    
    public void Mostrar(JTable tabla) {
        //Creamos una variable de la clase de conexion
        Connection conexion = ClaseConexion.getConexion();
        //Definimos el modelo de la tabla
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"UUID_Vehiculo", "Nombre_cliente", "telefono_cliente", "marca_vehiculo", "modelo_vehiculo", "problema_vehiculo", "estado_problema"});
        try {
            //Consulta a ejecutar
            String query = "SELECT * FROM tbMecanico";
            //Creamos un Statement
            Statement statement = conexion.createStatement();
            //Ejecutamos el Statement con la consulta y lo asignamos a una variable de tipo ResultSet
            ResultSet rs = statement.executeQuery(query);
            //Recorremos el ResultSet
            while (rs.next()) {
                //Llenamos el modelo por cada vez que recorremos el resultSet
                modelo.addRow(new Object[]{rs.getString("UUID_Vehiculo"), 
                    rs.getString("nombre_cliente"), 
                    rs.getInt("telefono_cliente"), 
                    rs.getString("marca_vehiculo"), 
                    rs.getString("modelo_vehiculo"),
                    rs.getString("problema_vehiculo"),
                    rs.getString("estado_problema")});
            }
            //Asignamos el nuevo modelo lleno a la tabla
            tabla.setModel(modelo);
            tabla.getColumnModel().getColumn(0).setMinWidth(0);
            tabla.getColumnModel().getColumn(0).setMaxWidth(0);
            tabla.getColumnModel().getColumn(0).setWidth(0);
        } catch (Exception e) {
            System.out.println("Este es el error en el modelo, metodo mostrar " + e);
        }
    }
    
    public void Actualizar(JTable tabla) {
        //Creamos una variable igual a ejecutar el método de la clase de conexión
        Connection conexion = ClaseConexion.getConexion();

        //obtenemos que fila seleccionó el usuario
        int filaSeleccionada = tabla.getSelectedRow();

        if (filaSeleccionada != -1) {
            //Obtenemos el id de la fila seleccionada
            String miUUId = tabla.getValueAt(filaSeleccionada, 0).toString();

            try {
                //Ejecutamos la Query
                String sql = "update tbMecanico set nombre_cliente= ?, telefono_cliente = ?, marca_vehiculo = ?, modelo_vehiculo = ?, problema_vehiculo = ?, estado_problema = ? where UUID_Vehiculo = ?";
                PreparedStatement updateUser = conexion.prepareStatement(sql);

                updateUser.setString(1, getNombre_cliente());
                updateUser.setInt(2, getTelefono_cliente());
                updateUser.setString(3, getMarca_vehiculo());
                updateUser.setString(4, getModelo_vehiculo());
                updateUser.setString(5, getProblema_vehiculo());
                updateUser.setString(6, getEstado_problema());
                updateUser.setString(7, miUUId);
                updateUser.executeUpdate();

            } catch (Exception e) {
                System.out.println("este es el error en el metodo de actualizar" + e);
            }
        } else {
            System.out.println("no");
        }
    }
    
    public void Guardar() {
        //Creamos una variable igual a ejecutar el método de la clase de conexión
        Connection conexion = ClaseConexion.getConexion();
        try {
            //Variable que contiene la Query a ejecutar
            String sql = "INSERT INTO tbMecanico(UUID_Vehiculo, nombre_cliente, telefono_cliente, marca_vehiculo, modelo_vehiculo, problema_vehiculo, estado_problema) VALUES (?, ?, ?, ?, ?, ?, ?)";
            //Creamos el PreparedStatement que ejecutará la Query
            PreparedStatement pstmt = conexion.prepareStatement(sql);
            //Establecer valores de la consulta SQL
            pstmt.setString(1, UUID.randomUUID().toString());
            pstmt.setString(2, getNombre_cliente());
            pstmt.setInt(3, getTelefono_cliente());
            pstmt.setString(4, getMarca_vehiculo());
            pstmt.setString(5, getModelo_vehiculo());
            pstmt.setString(6, getProblema_vehiculo());
            pstmt.setString(7, getEstado_problema());

            //Ejecutar la consulta
            pstmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("este es el error en el modelo:metodo guardar " + ex);
        }
    }
    
    public void Eliminar(JTable tabla) {
        //Creamos una variable igual a ejecutar el método de la clase de conexión
        Connection conexion = ClaseConexion.getConexion();

        //obtenemos que fila seleccionó el usuario
        int filaSeleccionada = tabla.getSelectedRow();
        //Obtenemos el id de la fila seleccionada

        String miId = tabla.getValueAt(filaSeleccionada, 0).toString();
        //borramos 
        try {
            String sql = "delete from tbMecanico where UUID_Vehiculo = ?";
            PreparedStatement deleteEstudiante = conexion.prepareStatement(sql);
            deleteEstudiante.setString(1, miId);
            deleteEstudiante.executeUpdate();
        } catch (Exception e) {
            System.out.println("este es el error metodo de eliminar" + e);
        }
        
    }
    
    public void Buscar(JTable tabla, JTextField miTextField) {
        //Creamos una variable igual a ejecutar el método de la clase de conexión
        Connection conexion = ClaseConexion.getConexion();

        //Definimos el modelo de la tabla
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"UUID_Vehiculo", "nombre_vehiculo", "telefono_vehiculo", "marca_vehiculo", "modelo_vehiculo", "problema_vehiculo", "estado_vehiculo"});
        try {
            String sql = "SELECT * FROM tbMecanico WHERE nombre_vehiculo LIKE ? || '%'";
            PreparedStatement deleteMecanico = conexion.prepareStatement(sql);
            deleteMecanico.setString(1, miTextField.getText());
            ResultSet rs = deleteMecanico.executeQuery();

            while (rs.next()) {
                //Llenamos el modelo por cada vez que recorremos el resultSet
                modelo.addRow(new Object[]{rs.getString("UUID_vehiculo"), rs.getString("nombre_cliente"), rs.getInt("telefono_cliente"), rs.getString("marca_vehiculo"), rs.getString("modelo_vehiculo"), rs.getString("problema_vehiculo"), rs.getString("estado_vehiculo")});
            }

            
            //Asignamos el nuevo modelo lleno a la tabla
            tabla.setModel(modelo);
            tabla.getColumnModel().getColumn(0).setMinWidth(0);
            tabla.getColumnModel().getColumn(0).setMaxWidth(0);
            tabla.getColumnModel().getColumn(0).setWidth(0);
        } catch (Exception e) {
            System.out.println("Este es el error en el modelo, metodo de buscar " + e);
        }
    }
    
    public void limpiar(frmMecanico Vista) {
        Vista.txtDueño.setText("");
        Vista.txtTelefono_cliente.setText("");
        Vista.txtMarca_vehiculo.setText("");
        Vista.txtModelo_vehiculo.setText("");
        Vista.txtProblema_vehiculo.setText("");
        Vista.txtEstado_problema.setText("");
    }
    
    public void cargarDatosTabla(frmMecanico Vista) {
        // Obtén la fila seleccionada 
        int filaSeleccionada = Vista.jtbMenu.getSelectedRow();

        // Debemos asegurarnos que haya una fila seleccionada antes de acceder a sus valores
        if (filaSeleccionada != -1) {
            String UUIDDeTb = Vista.jtbMenu.getValueAt(filaSeleccionada, 0).toString();
            String NombreDeTB = Vista.jtbMenu.getValueAt(filaSeleccionada, 1).toString();
            String TelefonoDeTb = Vista.jtbMenu.getValueAt(filaSeleccionada, 2).toString();
            String Marca_vehiculoDeTB = Vista.jtbMenu.getValueAt(filaSeleccionada, 3).toString();
            String Modelo_vehiculoDeTB = Vista.jtbMenu.getValueAt(filaSeleccionada, 4).toString();
            String Problema_vehiculoDeTB = Vista.jtbMenu.getValueAt(filaSeleccionada, 5).toString();
            String Estado_problemaDeTB = Vista.jtbMenu.getValueAt(filaSeleccionada, 6).toString();

            // Establece los valores en los campos de texto
            Vista.txtDueño.setText(NombreDeTB);
            Vista.txtTelefono_cliente.setText(TelefonoDeTb);
            Vista.txtMarca_vehiculo.setText(Marca_vehiculoDeTB);
            Vista.txtModelo_vehiculo.setText(Modelo_vehiculoDeTB);
            Vista.txtProblema_vehiculo.setText(Problema_vehiculoDeTB);
            Vista.txtEstado_problema.setText(Estado_problemaDeTB);
            
        }
    }

    
    
    
}
