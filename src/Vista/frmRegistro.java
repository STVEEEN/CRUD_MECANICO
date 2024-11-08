/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.CtrlRegistro;
import static Vista.frmLogin.initFrmLogin;
import modelo.Usuario;

/**
 *
 * @author Estudiante
 */
public class frmRegistro extends javax.swing.JFrame {

    public static void initFrmRegistro() {
        Usuario modelo = new Usuario();
        frmRegistro vista = new frmRegistro();
        CtrlRegistro controlador = new CtrlRegistro(modelo, vista);
        
        vista.setVisible(true);
    }

    /**
     * Creates new form Registro
     */
    public frmRegistro() {
        initComponents();
        this.setLocationRelativeTo(this);

    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        btnRegistrarse = new javax.swing.JButton();
        jlbInicia = new javax.swing.JLabel();
        btnIrALogin = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista.img/logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel7)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 500, 680));

        jLabel1.setBackground(new java.awt.Color(0, 102, 204));
        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("REGISTRATE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel4.setText("Correo electronico:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 20));

        jLabel5.setText("Contraseña:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel6.setText("Edad:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        txtNombre.setBackground(new java.awt.Color(235, 235, 250));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 92, 370, 30));

        txtCorreo.setBackground(new java.awt.Color(235, 235, 250));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 212, 370, 30));

        txtApellido.setBackground(new java.awt.Color(235, 235, 250));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 152, 370, 30));

        txtContraseña.setBackground(new java.awt.Color(235, 235, 250));
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 370, 30));

        txtEdad.setBackground(new java.awt.Color(235, 235, 250));
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 370, 30));

        btnRegistrarse.setBackground(new java.awt.Color(0, 102, 204));
        btnRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("REGISTRARSE");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 130, 40));

        jlbInicia.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jlbInicia.setText("¿Ya tienes una cuenta? ");
        jPanel1.add(jlbInicia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, -1, -1));

        btnIrALogin.setBackground(new java.awt.Color(0, 102, 204));
        btnIrALogin.setForeground(new java.awt.Color(255, 255, 255));
        btnIrALogin.setText("Inicia sesion");
        jPanel1.add(btnIrALogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista.img/Vector 1.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               initFrmLogin();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnIrALogin;
    public javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel jlbInicia;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtContraseña;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtEdad;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
