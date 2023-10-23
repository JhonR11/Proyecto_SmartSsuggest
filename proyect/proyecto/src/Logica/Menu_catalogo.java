/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Logica;

import Persistencia.Catalogo;

import javax.swing.JOptionPane;
import vista.Menu;

/**
 *
 * @author SirArthur
 */
public class Menu_catalogo extends javax.swing.JFrame {

  Catalogo catalogo;
  

    public Menu_catalogo() {
        
        initComponents();
        catalogo = new Catalogo();
        catalogo.CrearCatalogo();
        
       

      
        
        

    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgregarTarjeta = new javax.swing.JButton();
        Catalogo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_imprimir = new javax.swing.JTextArea();
        Modificar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AgregarTarjeta.setText("Agregar tarjeta");
        AgregarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarTarjetaActionPerformed(evt);
            }
        });

        Catalogo.setText("Ver catalogo");
        Catalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatalogoActionPerformed(evt);
            }
        });

        jta_imprimir.setColumns(20);
        jta_imprimir.setRows(5);
        jScrollPane1.setViewportView(jta_imprimir);

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AgregarTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Catalogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Modificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(AgregarTarjeta)
                .addGap(18, 18, 18)
                .addComponent(Catalogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Borrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regresar)
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarTarjetaActionPerformed
        
        
        //ingreso de una grafica o varias
     try{   
        catalogo.InsertarTarjeta(catalogo.CrearTarjeta());
     }catch(Exception e){
         System.out.println("Se cancela la agregada");
     }
    }//GEN-LAST:event_AgregarTarjetaActionPerformed

    private void CatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatalogoActionPerformed
        //catalogo
      
        
        jta_imprimir.setText(" "); 
        
        jta_imprimir.setText(catalogo.Imprimir());
        
        
    }//GEN-LAST:event_CatalogoActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
    try{
        int id=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la id de la tarjeta a modificar :D"));
        if(catalogo.modificartarjeta(catalogo.CrearTarjeta(),id)){
            JOptionPane.showMessageDialog(null, "se registro con exito :D");
        }    else{
            JOptionPane.showMessageDialog(null, "No se encontro verifique el id :C");
            } 
    }catch(Exception e){
        System.out.println("se cancela la modificada");
    }    
    }//GEN-LAST:event_ModificarActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
    //Regresar al Menu principal
    this.setVisible(false);
    Menu catamenu=new Menu();
    catamenu.setVisible(true);      
    }//GEN-LAST:event_regresarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
    //SE PIDE LA ID DE LA TARJETA A ELIMINAR Y SE LLAMA A LA OPCION ELIMINAR
    try{    
        int id=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la id de la tarjeta a eliminar :D"));
        if(catalogo.eliminartarjeta(id)){
            JOptionPane.showMessageDialog(null, "se elimino con exito :D");
        }    else{
            JOptionPane.showMessageDialog(null, "No se encontro verifique el id :C");
            }
    }catch(Exception e){
        System.out.println("Se cancela la borrada compae");
    }
    }//GEN-LAST:event_BorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_catalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_catalogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarTarjeta;
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Catalogo;
    private javax.swing.JButton Modificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jta_imprimir;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
