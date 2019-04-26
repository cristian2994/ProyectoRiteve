/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_Usuario;
import com.toedter.calendar.JDateChooser;
import java.sql.Date;
import javax.swing.JTextField;

/**
 *
 * @author Cristian Lopez
 */
public class IFAcutalizarUsuario extends javax.swing.JInternalFrame {
private Controlador_Usuario controlUsu;
    /**
     * Creates new form IFAcutalizarUsuario
     */
    public IFAcutalizarUsuario() {
        initComponents();
        controlUsu= new Controlador_Usuario();
    }

    public JDateChooser getTxtFecha() {
        return txtFecha;
    }

    public JTextField getTxtNombreUsu() {
        return txtNombreUsu;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public JTextField getTxtcedula() {
        return txtcedula;
    }

    public JTextField getTxtcontraseña() {
        return txtcontraseña;
    }

    public JTextField getTxtcorreo() {
        return txtcorreo;
    }

    public JTextField getTxtnombreUsuario() {
        return txtnombreUsuario;
    }

    public JTextField getTxtsalario() {
        return txtsalario;
    }

    public void setTxtFecha(Date txtFecha) {
        this.txtFecha.setDate(txtFecha);
    }

    public void setTxtNombreUsu(String txtNombreUsu) {
        this.txtNombreUsu.setText(txtNombreUsu);
    }

    public void setTxtTelefono(String txtTelefono) {
        this.txtTelefono.setText(txtTelefono);
    }

    public void setTxtcedula(String txtcedula) {
        this.txtcedula.setText(txtcedula);
    }

    public void setTxtcontraseña(String txtcontraseña) {
        this.txtcontraseña.setText(txtcontraseña);
    }

    public void setTxtcorreo(String txtcorreo) {
        this.txtcorreo.setText(txtcorreo);
    }

    public void setTxtnombreUsuario(String txtnombreUsuario) {
        this.txtnombreUsuario.setText(txtnombreUsuario);
    }

    public void setTxtsalario(Double txtsalario) {
        this.txtsalario.setText(String.valueOf(txtsalario));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel10 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtnombreUsuario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        txtTelefono = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        radTecn = new javax.swing.JRadioButton();
        radSecret = new javax.swing.JRadioButton();
        txtNombreUsu = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtsalario = new javax.swing.JTextField();
        lblSalario = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel10.setText("Cedula");

        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });

        jLabel11.setText("Nombre del usuario");

        txtnombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreUsuarioActionPerformed(evt);
            }
        });
        txtnombreUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreUsuarioKeyTyped(evt);
            }
        });

        jLabel12.setText("Telefono de lacalizacion");

        jLabel13.setText("Fecha de nacimiento");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel14.setText("Correo Electronio");

        jLabel15.setText("Ocupacion");

        buttonGroup1.add(radTecn);
        radTecn.setText("Tecnico");
        radTecn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radTecnActionPerformed(evt);
            }
        });

        buttonGroup1.add(radSecret);
        radSecret.setText("Secretaria");
        radSecret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radSecretActionPerformed(evt);
            }
        });

        txtNombreUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreUsuKeyTyped(evt);
            }
        });

        jLabel16.setText("Nombre de usuario");

        jLabel17.setText("Contraseña");

        txtsalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsalarioKeyTyped(evt);
            }
        });

        lblSalario.setText("Salario");

        jButton4.setText("Actualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(166, 166, 166))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtsalario)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 9, Short.MAX_VALUE)))
                            .addGap(270, 270, 270))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtnombreUsuario))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTelefono)))
                            .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(133, 133, 133)
                                    .addComponent(jLabel11))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtNombreUsu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                            .addComponent(txtcorreo, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(jLabel16))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel17)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(radTecn)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(radSecret))
                                        .addComponent(txtcontraseña))))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(69, 69, 69)
                .addComponent(jLabel15)
                .addGap(148, 148, 148)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtcedula, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(txtnombreUsuario))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel13)
                    .addGap(26, 26, 26)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel14)
                    .addGap(1, 1, 1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(radTecn)
                        .addComponent(radSecret))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(jLabel16))
                    .addGap(3, 3, 3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(lblSalario)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        char character=evt.getKeyChar();
         int cantcaracter=10;
        if (((character>='A')&&(character<='Z'))||((character>='a')&&(character<='z'))){
            evt.consume();
        }
        if(this.txtcedula.getText().length()==cantcaracter){
       evt.consume();
        }
       
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtnombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreUsuarioActionPerformed

    private void txtnombreUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreUsuarioKeyTyped
        char character=evt.getKeyChar();
        if ((character>='0')&&(character<='9')){
            evt.consume();
        }
    }//GEN-LAST:event_txtnombreUsuarioKeyTyped

    private void radTecnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radTecnActionPerformed
        if(this.isSelected){//tecnico

            txtsalario.setVisible(true);
            lblSalario.setVisible(true);

        }
    }//GEN-LAST:event_radTecnActionPerformed

    private void radSecretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radSecretActionPerformed
        if(this.isSelected){//secretaria
            txtsalario.setVisible(false);
            lblSalario.setVisible(false);

        }
    }//GEN-LAST:event_radSecretActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      if (radTecn.isSelected()) {
            controlUsu.actualizartecnico(this);
        }
        if(radSecret.isSelected()){
            controlUsu.actualizarsecretaria(this);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtcedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyReleased
     
          if (radTecn.isSelected()) {
            controlUsu.buscartecnico(this);
        }
        if(radSecret.isSelected()){
           controlUsu.buscarsecretaria(this);  
        }
    }//GEN-LAST:event_txtcedulaKeyReleased

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char character=evt.getKeyChar();
         int cantcaracter=8;
        if (((character>='A')&&(character<='Z'))||((character>='a')&&(character<='z'))){
            evt.consume();
        }
        if(this.txtTelefono.getText().length()==cantcaracter){
       evt.consume();
        } 
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtsalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsalarioKeyTyped
       char character=evt.getKeyChar();
        if (((character>='A')&&(character<='Z'))||((character>='a')&&(character<='z'))){
            evt.consume();
        }
    }//GEN-LAST:event_txtsalarioKeyTyped

    private void txtNombreUsuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreUsuKeyTyped
        char character=evt.getKeyChar();
        if ((character>='0')&&(character<='9')){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreUsuKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JRadioButton radSecret;
    private javax.swing.JRadioButton radTecn;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtNombreUsu;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcontraseña;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombreUsuario;
    private javax.swing.JTextField txtsalario;
    // End of variables declaration//GEN-END:variables
}