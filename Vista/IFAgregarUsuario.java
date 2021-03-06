/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_Usuario;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;

/**
 *
 * @author Cristian Lopez
 */
public class IFAgregarUsuario extends javax.swing.JInternalFrame {
    private Controlador_Usuario controlUsu;
    /**
     * Creates new form IFAgregarUsuario
     */
    public IFAgregarUsuario() {
        initComponents();
        controlUsu= new Controlador_Usuario();
        this.lblSalario.setVisible(false);
        this.txtsalario.setVisible(false);
    }
  public JTextField getTxtNombreUsu() {
        return txtNombreUsu;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
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

    public JTextField getTxtcedula() {
        return txtcedula;
    }

    public JTextField getTxtsalario() {
        return txtsalario;
    }

    public JDateChooser getTxtFecha() {
        return txtFecha;
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
        jLabel1 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombreUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        radSecret = new javax.swing.JRadioButton();
        radTecn = new javax.swing.JRadioButton();
        txtNombreUsu = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtsalario = new javax.swing.JTextField();
        lblSalario = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);

        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });

        jLabel2.setText("Cedula");

        jLabel3.setText("Nombre del usuario");

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

        jLabel4.setText("Fecha de nacimiento");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel5.setText("Telefono de lacalizacion");

        jLabel6.setText("Correo Electronio");

        jLabel7.setText("Ocupacion");

        buttonGroup1.add(radSecret);
        radSecret.setText("Secretaria");
        radSecret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radSecretActionPerformed(evt);
            }
        });

        buttonGroup1.add(radTecn);
        radTecn.setText("Tecnico");
        radTecn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radTecnActionPerformed(evt);
            }
        });

        txtNombreUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreUsuKeyTyped(evt);
            }
        });

        jLabel8.setText("Contraseña");

        jLabel9.setText("Nombre de usuario");

        btnGuardar.setBackground(new java.awt.Color(0, 0, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Guardar.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtsalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsalarioKeyTyped(evt);
            }
        });

        lblSalario.setText("Salario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombreUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(133, 133, 133)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 160, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNombreUsu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                        .addComponent(txtcorreo, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcontraseña)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radTecn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radSecret)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsalario)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 55, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcedula, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtnombreUsuario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radTecn)
                    .addComponent(radSecret))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(txtsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar)))
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (radTecn.isSelected()) {
            controlUsu.guardarTecnico(this);
        }
        if(radSecret.isSelected()){
        controlUsu.guardarSecretaria(this);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void radSecretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radSecretActionPerformed
        if(this.isSelected){//secretaria
            txtsalario.setVisible(false);
            lblSalario.setVisible(false);

        }
    }//GEN-LAST:event_radSecretActionPerformed

    private void radTecnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radTecnActionPerformed
        if(this.isSelected){//tecnico

            txtsalario.setVisible(true);
            lblSalario.setVisible(true);

        }
    }//GEN-LAST:event_radTecnActionPerformed

    private void txtnombreUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreUsuarioKeyTyped
        char characters=evt.getKeyChar();
        if ((characters>='0')&&(characters<='9')){
            evt.consume();}
//        }char[] caracteres = this.txtnombreUsuario.getText().toCharArray();
//        caracteres[0] = Character.toUpperCase(caracteres[0]);
//         for (int i = 0; i < this.txtnombreUsuario.getText().length()- 2; i++){ 
//    // Es 'palabra'
//    if (caracteres[i] == ' ' || caracteres[i] == '.' || caracteres[i] == ',')
//      // Reemplazamos
//      caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);}
    }//GEN-LAST:event_txtnombreUsuarioKeyTyped

    private void txtnombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreUsuarioActionPerformed

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

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
         char character=evt.getKeyChar();
         int cantcaracter=10;
        if (((character>='A')&&(character<='Z'))||((character>='a')&&(character<='z'))){
            evt.consume();
        }
        if(this.txtTelefono.getText().length()==cantcaracter){
       evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreUsuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreUsuKeyTyped
         char character=evt.getKeyChar();
        if ((character>='0')&&(character<='9')){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreUsuKeyTyped

    private void txtsalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsalarioKeyTyped
        char character=evt.getKeyChar();
        if (((character>='A')&&(character<='Z'))||((character>='a')&&(character<='z'))){
            evt.consume();
        }
    }//GEN-LAST:event_txtsalarioKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    public static javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
