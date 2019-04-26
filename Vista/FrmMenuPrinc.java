/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.BaseDatos;
import com.sun.org.apache.bcel.internal.generic.IMUL;
import fondo.Fondo;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.plaf.DesktopPaneUI;

/**
 *
 * @author Cristian Lopez
 */
public class FrmMenuPrinc extends javax.swing.JFrame {
    private InputStream fondo1=this.getClass().getResourceAsStream("/Vista/rtvcañas.jpg");
    ;
    /**
     * Creates new form FrmMenuPrinc
     */
    public void cargarImagen(javax.swing.JDesktopPane jDeskp, InputStream imagen){
        try {
            BufferedImage image= ImageIO.read(imagen);
            jDeskp.setBorder(new Fondo(image));
            
        } catch (IOException ex) {
            Logger.getLogger(FrmMenuPrinc.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    public FrmMenuPrinc() {
        initComponents();
       cargarImagen(escritorio, fondo1);
        this.setExtendedState(MAXIMIZED_BOTH);
        BaseDatos bd = new BaseDatos();
        bd.setRuta("C:\\Users\\juan_\\Desktop\\RiteveBDyArchSegundProyect.1.1\\conexion.ini");
        if (bd.comprobarConexion()==true) {
            JOptionPane.showMessageDialog(null, "Servidor conectado");
        }else{
        FrmConexion conexion=new FrmConexion();
            this.escritorio.add(conexion);
        conexion.show();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemUsuPrinc = new javax.swing.JMenuItem();
        itemMenuVehiculo = new javax.swing.JMenuItem();
        menurevisiones = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 291, Short.MAX_VALUE)
        );

        jMenu1.setText("MENU");

        itemUsuPrinc.setText("Usuarios");
        itemUsuPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUsuPrincActionPerformed(evt);
            }
        });
        jMenu1.add(itemUsuPrinc);

        itemMenuVehiculo.setText("Vehiculos");
        itemMenuVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVehiculoActionPerformed(evt);
            }
        });
        jMenu1.add(itemMenuVehiculo);

        menurevisiones.setText("Revisiones");
        menurevisiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menurevisionesActionPerformed(evt);
            }
        });
        jMenu1.add(menurevisiones);

        jMenuItem5.setText("Generar citas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Informacion");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVehiculoActionPerformed
    MenuVehiculos mv = new MenuVehiculos();
        escritorio.add(mv);
        mv.show();
    }//GEN-LAST:event_itemMenuVehiculoActionPerformed

    private void itemUsuPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUsuPrincActionPerformed
        MenuUsuarios mn = new MenuUsuarios();
        escritorio.add(mn);
        mn.show();
    }//GEN-LAST:event_itemUsuPrincActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        MenuCitas mn = new MenuCitas();
        escritorio.add(mn);
        mn.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void menurevisionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menurevisionesActionPerformed
       IFRevicion mn = new IFRevicion() ;
        escritorio.add(mn);
        mn.show();
    }//GEN-LAST:event_menurevisionesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenuPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrinc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itemMenuVehiculo;
    private javax.swing.JMenuItem itemUsuPrinc;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem menurevisiones;
    // End of variables declaration//GEN-END:variables
}