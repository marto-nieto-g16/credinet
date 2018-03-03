/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditnet_v2.mvc.vistas.prestamos;


import creditnet_v2.mvc.controller.prestamo.Controller_Vista_Solicitar_Prestamo;
import creditnet_v2.mvc.model.Prestamos;
import creditnet_v2.mvc.vistas.cliente.Nuevo_Cliente;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author SERVIDOR
 */
public class Solicitar_Prestamo extends javax.swing.JFrame {

    public static Prestamos prestamoss = new Prestamos();
    /**
     * Creates new form Solicitar_Prestamo
     */
    public Solicitar_Prestamo() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/creditnet_v2/mvc/vistas/imagenes/icon_prestamo.png"));
        setIconImage(icon);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2_datos_clientes = new javax.swing.JPanel();
        icon_nombre2 = new javax.swing.JLabel();
        campo_nombres2 = new javax.swing.JTextField();
        jLabel_apellido = new javax.swing.JLabel();
        campo_apellido2 = new javax.swing.JTextField();
        jLabel_dir = new javax.swing.JLabel();
        campo_direccion2 = new javax.swing.JTextField();
        jDateChooser_inicial = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campo_monto_Prestar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campo_monto_pagar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campo_interes = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDateChoose_final = new com.toedter.calendar.JDateChooser();

        setTitle("Solicitar Prestamo");
        setLocation(new java.awt.Point(200, 70));
        setResizable(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Solicitar Prestamo"));

        jPanel2_datos_clientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales del Cliente"));

        icon_nombre2.setText("Nombres");

        campo_nombres2.setEditable(false);
        campo_nombres2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombres2ActionPerformed(evt);
            }
        });
        campo_nombres2.setText(Nuevo_Cliente.campo_nombres.getText());

        jLabel_apellido.setText("Apellidos");

        campo_apellido2.setEditable(false);
        campo_apellido2.setText(Nuevo_Cliente.campo_apellido.getText());

        jLabel_dir.setText("Direccion");

        campo_direccion2.setEditable(false);
        campo_direccion2.setText(Nuevo_Cliente.campo_direccion.getText());

        javax.swing.GroupLayout jPanel2_datos_clientesLayout = new javax.swing.GroupLayout(jPanel2_datos_clientes);
        jPanel2_datos_clientes.setLayout(jPanel2_datos_clientesLayout);
        jPanel2_datos_clientesLayout.setHorizontalGroup(
            jPanel2_datos_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_datos_clientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2_datos_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icon_nombre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_dir))
                .addGap(18, 18, 18)
                .addGroup(jPanel2_datos_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_direccion2, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(campo_apellido2)
                    .addComponent(campo_nombres2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2_datos_clientesLayout.setVerticalGroup(
            jPanel2_datos_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2_datos_clientesLayout.createSequentialGroup()
                .addGroup(jPanel2_datos_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_nombres2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icon_nombre2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2_datos_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_apellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2_datos_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_direccion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_dir))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel1.setText("Fecha Inicial del Prestamo");

        jLabel8.setText("Monto a Prestar: $");

        campo_monto_Prestar.setText("0");
        campo_monto_Prestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                campo_monto_PrestarMouseEntered(evt);
            }
        });
        campo_monto_Prestar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campo_monto_PrestarKeyPressed(evt);
            }
        });

        jLabel9.setText("Monto a Pagar: $");

        campo_monto_pagar.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Bodoni MT", 1, 20)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/creditnet_v2/mvc/vistas/imagenes/icon_prestamo.png"))); // NOI18N
        jLabel10.setText("Solicitar Prestamo");

        jLabel11.setText("Interes a Prestar");

        campo_interes.setText("0");
        campo_interes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campo_interesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                campo_interesMouseEntered(evt);
            }
        });
        campo_interes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campo_interesKeyPressed(evt);
            }
        });

        jLabel12.setText("%");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/creditnet_v2/mvc/vistas/imagenes/solicitud_prestamo.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/creditnet_v2/mvc/vistas/imagenes/cancelar.png"))); // NOI18N

        jLabel2.setText("Fecha Final del Prestamo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(campo_monto_pagar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_monto_Prestar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addComponent(jPanel2_datos_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(62, 62, 62))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_interes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChoose_final, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addComponent(jDateChooser_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jDateChoose_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanel2_datos_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campo_monto_Prestar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(campo_interes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(campo_monto_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel13))
                    .addComponent(jLabel14))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_nombres2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombres2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombres2ActionPerformed

    private void campo_monto_PrestarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_monto_PrestarMouseEntered
        campo_monto_pagar.setText(""+Controller_Vista_Solicitar_Prestamo.Valor_Pagar(Controller_Vista_Solicitar_Prestamo.Prestamo(campo_monto_Prestar.getText()), Controller_Vista_Solicitar_Prestamo.Interes(campo_interes.getText()))); 
        
    }//GEN-LAST:event_campo_monto_PrestarMouseEntered

    private void campo_monto_PrestarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_monto_PrestarKeyPressed
       campo_monto_pagar.setText(""+Controller_Vista_Solicitar_Prestamo.Valor_Pagar(Controller_Vista_Solicitar_Prestamo.Prestamo(campo_monto_Prestar.getText()), Controller_Vista_Solicitar_Prestamo.Interes(campo_interes.getText()))); 
    }//GEN-LAST:event_campo_monto_PrestarKeyPressed

    private void campo_interesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_interesMouseEntered
         campo_monto_pagar.setText(""+Controller_Vista_Solicitar_Prestamo.Valor_Pagar(Controller_Vista_Solicitar_Prestamo.Prestamo(campo_monto_Prestar.getText()), Controller_Vista_Solicitar_Prestamo.Interes(campo_interes.getText()))); 
    }//GEN-LAST:event_campo_interesMouseEntered

    private void campo_interesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_interesMouseClicked
       campo_monto_pagar.setText(""+Controller_Vista_Solicitar_Prestamo.Valor_Pagar(Controller_Vista_Solicitar_Prestamo.Prestamo(campo_monto_Prestar.getText()), Controller_Vista_Solicitar_Prestamo.Interes(campo_interes.getText()))); 
    }//GEN-LAST:event_campo_interesMouseClicked

    private void campo_interesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_interesKeyPressed
     campo_monto_pagar.setText(""+Controller_Vista_Solicitar_Prestamo.Valor_Pagar(Controller_Vista_Solicitar_Prestamo.Prestamo(campo_monto_Prestar.getText()), Controller_Vista_Solicitar_Prestamo.Interes(campo_interes.getText()))); 
    }//GEN-LAST:event_campo_interesKeyPressed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        try {
            if(Controller_Vista_Solicitar_Prestamo.Buscar(Nuevo_Cliente.campo_identificacion.getText()) != null){
                prestamoss.setCedula(Nuevo_Cliente.campo_identificacion.getText());
                prestamoss.setFecha_inicial(jDateChooser_inicial.getDateFormatString());
                prestamoss.setFecha_final(jDateChoose_final.getDateFormatString());
                prestamoss.setMonto_prestado(Integer.parseInt(campo_monto_Prestar.getText()));
                prestamoss.setMonto_a_pagar(Integer.parseInt(campo_monto_pagar.getText()));
                prestamoss.setInteres(Integer.parseInt(campo_interes.getText()));
                prestamoss.setEstado("Deuda");
                Controller_Vista_Solicitar_Prestamo.Solicitar_PrestamoNuevo(prestamoss);             
            }
        } catch (SQLException ex) {
            Logger.getLogger(Solicitar_Prestamo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Solicitar_Prestamo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel13MouseClicked
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
            java.util.logging.Logger.getLogger(Solicitar_Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Solicitar_Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Solicitar_Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Solicitar_Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Solicitar_Prestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo_apellido2;
    private javax.swing.JTextField campo_direccion2;
    private javax.swing.JTextField campo_interes;
    private javax.swing.JTextField campo_monto_Prestar;
    private javax.swing.JTextField campo_monto_pagar;
    private javax.swing.JTextField campo_nombres2;
    private javax.swing.JLabel icon_nombre2;
    private com.toedter.calendar.JDateChooser jDateChoose_final;
    private com.toedter.calendar.JDateChooser jDateChooser_inicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_apellido;
    private javax.swing.JLabel jLabel_dir;
    private javax.swing.JPanel jPanel2_datos_clientes;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}