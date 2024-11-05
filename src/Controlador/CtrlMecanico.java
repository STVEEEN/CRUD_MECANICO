/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista
        .frmMecanico;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import modelo.Vehiculos;

/**
 *
 * @author Estudiante
 */
public class CtrlMecanico implements MouseListener, KeyListener {
 
    private Vehiculos modelo;
    private frmMecanico Vista
            ;

    //////////////////////////3- Constructor de la clase
    public CtrlMecanico(Vehiculos modelo, frmMecanico Vista
    ) {
        this.modelo = modelo;
        this.Vista
                = Vista
                ;

        //Siempre poner todos los botones que vamos a detectar
        Vista
                .btnGuardar.addMouseListener(this);
        Vista
                .btnEliminar.addMouseListener(this);
        Vista
                .btnActualizar.addMouseListener(this);
        Vista
                .btnLimpiar.addMouseListener(this);
        Vista
                .txtBuscar.addKeyListener(this);
        Vista
                .jtbMenu.addMouseListener(this);

        modelo.Mostrar(Vista
                .jtbMenu);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == Vista
                .btnGuardar) {
            if (Vista
                    .txtDueño.getText().isEmpty() || Vista
                            .txtTelefono_cliente.getText().isEmpty() || Vista
                                    .txtMarca_vehiculo.getText().isEmpty() || Vista
                                            .txtModelo_vehiculo.getText().isEmpty() || Vista
                                                    .txtProblema_vehiculo.getText().isEmpty() || Vista
                                                            .txtEstado_problema.getText().isEmpty()) {
                JOptionPane.showMessageDialog(Vista
                        , "Debes llenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    //Asignar lo de la Vista al modelo
                    modelo.setNombre_cliente(Vista.txtDueño.getText());
                    modelo.setTelefono_cliente(Integer.parseInt(Vista.txtTelefono_cliente.getText()));
                    modelo.setMarca_vehiculo(Vista.txtMarca_vehiculo.getText());
                    modelo.setModelo_vehiculo(Vista.txtModelo_vehiculo.getText());
                    modelo.setProblema_vehiculo(Vista .txtProblema_vehiculo.getText());
                    modelo.setEstado_problema(Vista.txtEstado_problema.getText());
                    //Ejecutar el metodo 
                    modelo.Guardar();
                    modelo.Mostrar(Vista
                            .jtbMenu);
                    modelo.limpiar(Vista
                    );
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(Vista
                            , "El telefono debe ser un número", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        
        if (e.getSource() == Vista
                .btnEliminar) {
            if (Vista
                    .txtDueño.getText().isEmpty() || Vista
                            .txtTelefono_cliente.getText().isEmpty() || Vista
                                    .txtMarca_vehiculo.getText().isEmpty() || Vista
                                            .txtModelo_vehiculo.getText().isEmpty() || Vista
                                                    .txtProblema_vehiculo.getText().isEmpty() || Vista
                                                            .txtEstado_problema.getText().isEmpty()) {
                JOptionPane.showMessageDialog(Vista
                        , "Debes seleccionar un registro para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                modelo.Eliminar(Vista
                        .jtbMenu);
                modelo.Mostrar(Vista
                        .jtbMenu);
                modelo.limpiar(Vista
                );
            }
        }
        
        if (e.getSource() == Vista
                .btnActualizar) {
            if (Vista
                    .txtDueño.getText().isEmpty() || Vista
                            .txtTelefono_cliente.getText().isEmpty() || Vista
                                    .txtMarca_vehiculo.getText().isEmpty() || Vista
                                            .txtModelo_vehiculo.getText().isEmpty() || Vista
                                                    .txtProblema_vehiculo.getText().isEmpty() || Vista
                                                         .txtEstado_problema.getText().isEmpty()) {
                JOptionPane.showMessageDialog(Vista
                        , "Debes seleccionar un registro para actualizar", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    //Asignar lo de la vista al modelo al momento de darle clic a actualizar
                    modelo.setNombre_cliente(Vista
                            .txtDueño.getText());
                    modelo.setTelefono_cliente(Integer.parseInt(Vista
                            .txtTelefono_cliente.getText()));
                    modelo.setMarca_vehiculo(Vista
                            .txtMarca_vehiculo.getText());
                    modelo.setModelo_vehiculo(Vista
                            .txtModelo_vehiculo.getText());
                    modelo.setProblema_vehiculo(Vista
                            .txtProblema_vehiculo.getText());
                    modelo.setEstado_problema(Vista
                            .txtEstado_problema.getText());

                    //Ejecutar el método    
                    modelo.Actualizar(Vista
                            .jtbMenu);
                    modelo.Mostrar(Vista
                            .jtbMenu);
                    modelo.limpiar(Vista
                    );
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(Vista
                            , "La edad debe ser un número", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        }

        if (e.getSource() == Vista
                .btnLimpiar) {
            modelo.limpiar(Vista
            );
        }

        if (e.getSource() == Vista
                .jtbMenu) {
            modelo.cargarDatosTabla(Vista
            );
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    
    
}
