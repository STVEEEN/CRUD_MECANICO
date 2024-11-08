/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.CtrlMecanico;
import modelo.Vehiculos;

/**
 *
 * @author Estudiante
 */
public class frmMecanico extends javax.swing.JFrame {

    public static void initfrmMecanico() {
        Vehiculos modelo = new Vehiculos();
        frmMecanico vista = new frmMecanico();
        CtrlMecanico controlador = new CtrlMecanico(modelo, vista);

        vista.setVisible(true);
    }

    /**
     * Creates new form frmMecanico
     */
    public frmMecanico() {
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbMenu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMarca_vehiculo = new javax.swing.JTextField();
        txtModelo_vehiculo = new javax.swing.JTextField();
        txtProblema_vehiculo = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtEstado_problema = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDueño = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelefono_cliente = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("TALLER DE MECANICO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jtbMenu.setBackground(new java.awt.Color(235, 235, 250));
        jtbMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtbMenu);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 720, 310));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Autos en nomina:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("Marca del vehiculo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setText("Modelo del vehiculo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Problema presentado:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Estado del problema:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        txtMarca_vehiculo.setBackground(new java.awt.Color(235, 235, 250));
        txtMarca_vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarca_vehiculoActionPerformed(evt);
            }
        });
        jPanel1.add(txtMarca_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 330, -1));

        txtModelo_vehiculo.setBackground(new java.awt.Color(235, 235, 250));
        txtModelo_vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelo_vehiculoActionPerformed(evt);
            }
        });
        jPanel1.add(txtModelo_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 330, -1));

        txtProblema_vehiculo.setBackground(new java.awt.Color(235, 235, 250));
        jPanel1.add(txtProblema_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 330, -1));

        txtBuscar.setBackground(new java.awt.Color(235, 235, 250));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 310, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setText("Ingresa los datos del vehiculo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 102, 204));
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setText("Buscar:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 102, 204));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 130, 40));

        btnEliminar.setBackground(new java.awt.Color(0, 102, 204));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 130, 40));

        btnActualizar.setBackground(new java.awt.Color(0, 102, 204));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 130, 40));

        btnLimpiar.setBackground(new java.awt.Color(0, 102, 204));
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 130, 40));

        txtEstado_problema.setBackground(new java.awt.Color(235, 235, 250));
        jPanel1.add(txtEstado_problema, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 240, -1));

        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setText("Dueño del vehiculo:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtDueño.setBackground(new java.awt.Color(235, 235, 250));
        jPanel1.add(txtDueño, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 330, -1));

        jLabel10.setForeground(new java.awt.Color(0, 102, 204));
        jLabel10.setText("telefono del dueño:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txtTelefono_cliente.setBackground(new java.awt.Color(235, 235, 250));
        jPanel1.add(txtTelefono_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 330, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 630, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMarca_vehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarca_vehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarca_vehiculoActionPerformed

    private void txtModelo_vehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelo_vehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelo_vehiculoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(frmMecanico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMecanico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMecanico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMecanico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMecanico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable jtbMenu;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtDueño;
    public javax.swing.JTextField txtEstado_problema;
    public javax.swing.JTextField txtMarca_vehiculo;
    public javax.swing.JTextField txtModelo_vehiculo;
    public javax.swing.JTextField txtProblema_vehiculo;
    public javax.swing.JTextField txtTelefono_cliente;
    // End of variables declaration//GEN-END:variables
}
