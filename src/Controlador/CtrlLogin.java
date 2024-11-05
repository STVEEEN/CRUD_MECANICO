/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.frmLogin;
import Vista.frmMecanico;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Estudiante
 */
public class CtrlLogin implements MouseListener{
    
    Usuario modelo;
    frmLogin vista;

    //2-Constructor 
    public CtrlLogin(Usuario modelo, frmLogin Vista) {
        this.modelo = modelo;
        this.vista = Vista;

        vista.btnIngresar.addMouseListener(this);
        vista.btnIrARegistro.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.btnIngresar) {
            modelo.setCorreo(vista.txtCorreo.getText());
            modelo.setContraseña(modelo.convertirSHA256(vista.txtContraseña.getText()));

            //Creo una variable llamada "comprobar" 
            //que guardará el resultado de ejecutar el metodo iniciarSesion()            
            boolean comprobar = modelo.iniciarSesion();

            //Si la variable es "true" significa que si existe el usuario ingresado    
            if (comprobar == true) {
                JOptionPane.showMessageDialog(vista,"¡Bienvenido!");
                vista.dispose();
                frmMecanico.initfrmMecanico();
            } else {
                JOptionPane.showMessageDialog(vista, "Usuario no encontrado");

            } 
            

        }
        
        //Clic al botón de Ir Al Registro
        if(e.getSource() == vista.btnIrARegistro){
            Vista.frmRegistro.initFrmRegistro();
             vista.dispose();
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
    
}
