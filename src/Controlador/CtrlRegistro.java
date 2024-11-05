/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.frmRegistro;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author Estudiante
 */
public class CtrlRegistro implements MouseListener{
    
    Usuario modelo;
    frmRegistro vista;
    
    //2-Constructor 
    public CtrlRegistro(Usuario Modelo, frmRegistro Vista){
        this.modelo = Modelo;
        this.vista = Vista;
        
        vista.btnRegistrarse.addMouseListener(this);
        vista.btnIrALogin.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
         if(e.getSource() == vista.btnRegistrarse){
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setApellido(vista.txtApellido.getText());
            modelo.setCorreo(vista.txtCorreo.getText());
            modelo.setContraseña(modelo.convertirSHA256(vista.txtContraseña.getText()));
            modelo.setEdad(vista.txtEdad.getText());
            
            modelo.GuardarUsuario();
            
            //Muestro una alerta que el usuario se ha guardado
            JOptionPane.showMessageDialog(vista, "Usuario Guardado");
        }
        
         //Clic al botón de Ir Al Login
        if(e.getSource() == vista.btnIrALogin){
            Vista.frmLogin.initFrmLogin();
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
