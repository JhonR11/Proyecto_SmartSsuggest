package Logica;

import Logica.Menu_Sugerencia;
import entidades.Board;
import entidades.Fuente;
import entidades.Procesador;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Board_Procesador_Fuente_Menu extends javax.swing.JFrame {
    
    ArrayList<Fuente> fuentes;
    ArrayList<Board> boards;
    ArrayList<Procesador>procesadores;
    
    Fuente fuente;
    Procesador procesador;
    Board board;
    
    TableRowSorter trsProcesadores;
    TableRowSorter trsFuentes;
    TableRowSorter trsBoards;
    
    DefaultTableModel mdtFuentes = new DefaultTableModel();
    DefaultTableModel mdtBoards = new DefaultTableModel();
    DefaultTableModel mdtProcesadores = new DefaultTableModel();

    public Board_Procesador_Fuente_Menu() {
        initComponents();
        fuentes = new ArrayList();
        boards = new ArrayList();
        procesadores = new ArrayList();
        
        board = new Board();
        fuente = new Fuente();
        procesador = new Procesador();
        
        board.catalogoBoards();
        fuente.catalogoFuentes();
        procesador.catalogoProcesador();
        
        boards.add(board);
        fuentes.add(fuente);
        procesadores.add(procesador);
        
        boards = board.listaBoards();
        fuentes = fuente.listaFuentes();
        procesadores = procesador.listaProcesador();
        
        int id = 0;
        
    mdtFuentes.addColumn("Capacidad");
    for(int i = 0; i < fuentes.size(); i++){
        Object[] fila = new Object[100];
        fila[0] = fuentes.get(i).getCapacidad();
        mdtFuentes.addRow(fila);
    }
    
    mdtBoards.addColumn("Tipo");
    mdtBoards.addColumn("Puerto");
    for(int i = 0; i < boards.size(); i++){
        Object[] fila = new Object[100];
        fila[0] = boards.get(i).getTipo();
        fila[1] = boards.get(i).getPuerto();
        mdtBoards.addRow(fila);
    }
    
    mdtProcesadores.addColumn("Generación");
    mdtProcesadores.addColumn("Serie");
    mdtProcesadores.addColumn("Referencia");
    for(int i = 0; i < procesadores.size(); i++){
        Object[] fila = new Object[100];
        fila[0] = procesadores.get(i).getGeneracion();
        fila[1] = procesadores.get(i).getSerie();
        fila[2] = procesadores.get(i).getReferencia();
        mdtProcesadores.addRow(fila);
    }
    
    jt_Fuentes.setModel(mdtFuentes);
    jt_Boards.setModel(mdtBoards);
    jt_Procesadores.setModel(mdtProcesadores);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTable = new javax.swing.JTabbedPane();
        jp_Boards = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_Boards = new javax.swing.JTable();
        jp_Fuentes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_Fuentes = new javax.swing.JTable();
        jp_Procesadores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Procesadores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtf_Boards = new javax.swing.JTextField();
        jtf_Fuentes = new javax.swing.JTextField();
        jtf_Procesadores = new javax.swing.JTextField();
        Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jt_Boards.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jt_Boards);

        javax.swing.GroupLayout jp_BoardsLayout = new javax.swing.GroupLayout(jp_Boards);
        jp_Boards.setLayout(jp_BoardsLayout);
        jp_BoardsLayout.setHorizontalGroup(
            jp_BoardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        jp_BoardsLayout.setVerticalGroup(
            jp_BoardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );

        JTable.addTab("Boards", jp_Boards);

        jt_Fuentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jt_Fuentes);

        javax.swing.GroupLayout jp_FuentesLayout = new javax.swing.GroupLayout(jp_Fuentes);
        jp_Fuentes.setLayout(jp_FuentesLayout);
        jp_FuentesLayout.setHorizontalGroup(
            jp_FuentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        jp_FuentesLayout.setVerticalGroup(
            jp_FuentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );

        JTable.addTab("Fuentes", jp_Fuentes);

        jt_Procesadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jt_Procesadores);

        javax.swing.GroupLayout jp_ProcesadoresLayout = new javax.swing.GroupLayout(jp_Procesadores);
        jp_Procesadores.setLayout(jp_ProcesadoresLayout);
        jp_ProcesadoresLayout.setHorizontalGroup(
            jp_ProcesadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        jp_ProcesadoresLayout.setVerticalGroup(
            jp_ProcesadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );

        JTable.addTab("Procesadores", jp_Procesadores);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Procesadores");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fuentes");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Boards");

        jtf_Boards.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf_Boards.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_BoardsKeyTyped(evt);
            }
        });

        jtf_Fuentes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf_Fuentes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_FuentesKeyTyped(evt);
            }
        });

        jtf_Procesadores.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtf_Procesadores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_ProcesadoresKeyTyped(evt);
            }
        });

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_Procesadores)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(jtf_Fuentes)
                    .addComponent(jtf_Boards, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTable, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTable)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_Boards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_Fuentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_Procesadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(Regresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_ProcesadoresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_ProcesadoresKeyTyped
        // TODO add your handling code here:
        jtf_Procesadores.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent ke){
                trsProcesadores.setRowFilter(RowFilter.regexFilter("(?i)" + jtf_Procesadores.getText(), 1));
            }
        });
        
        trsProcesadores = new TableRowSorter(mdtProcesadores);
        jt_Procesadores.setRowSorter(trsProcesadores);
    }//GEN-LAST:event_jtf_ProcesadoresKeyTyped

    private void jtf_FuentesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_FuentesKeyTyped
        // TODO add your handling code here:
        jtf_Fuentes.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent ke){
                trsFuentes.setRowFilter(RowFilter.regexFilter(jtf_Fuentes.getText(), 0));
            }
        });
        
        trsFuentes = new TableRowSorter(mdtFuentes);
        jt_Fuentes.setRowSorter(trsFuentes);
    }//GEN-LAST:event_jtf_FuentesKeyTyped

    private void jtf_BoardsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_BoardsKeyTyped
        // TODO add your handling code here:
        jtf_Boards.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent ke){
                trsBoards.setRowFilter(RowFilter.regexFilter("(?i)" + jtf_Boards.getText(), 0));
            }
        });
        
        trsBoards = new TableRowSorter(mdtBoards);
        jt_Boards.setRowSorter(trsBoards);
    }//GEN-LAST:event_jtf_BoardsKeyTyped

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        this.setVisible(false);
        Menu_Sugerencia sug=new Menu_Sugerencia();
        sug.setVisible(true);
    }//GEN-LAST:event_RegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Board_Procesador_Fuente_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board_Procesador_Fuente_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board_Procesador_Fuente_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board_Procesador_Fuente_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Board_Procesador_Fuente_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTable;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jp_Boards;
    private javax.swing.JPanel jp_Fuentes;
    private javax.swing.JPanel jp_Procesadores;
    private javax.swing.JTable jt_Boards;
    private javax.swing.JTable jt_Fuentes;
    private javax.swing.JTable jt_Procesadores;
    private javax.swing.JTextField jtf_Boards;
    private javax.swing.JTextField jtf_Fuentes;
    private javax.swing.JTextField jtf_Procesadores;
    // End of variables declaration//GEN-END:variables
}
