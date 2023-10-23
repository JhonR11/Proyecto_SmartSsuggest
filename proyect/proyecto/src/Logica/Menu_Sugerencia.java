package Logica;

import Persistencia.Catalogo;
import vista.Menu;

public class Menu_Sugerencia extends javax.swing.JFrame {
    Catalogo catalogo = new Catalogo();
    private int fuente;
    
    
    
    public Menu_Sugerencia() {
        initComponents();
        catalogo = new Catalogo();
        catalogo.CrearCatalogo();
       
       
        
       
        
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Ir_BPFM = new javax.swing.JButton();
        FuenteC = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        BoardC = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Procesador_SerieC = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Text_Area_SugerenciaC = new javax.swing.JTextArea();
        Referencia_ProcesadorC = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        TipoBoardC = new javax.swing.JComboBox<>();
        SugerenciaC = new javax.swing.JButton();
        RegresarC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Ir_BPFM.setText("Ver Procesadores, Boards y Fuentes");
        Ir_BPFM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ir_BPFMActionPerformed(evt);
            }
        });

        FuenteC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "200", "300", "500", "600", "700", "750", "800", "850", "900", "1000" }));
        FuenteC.setSelectedIndex(-1);
        FuenteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuenteCActionPerformed(evt);
            }
        });

        jLabel2.setText("Capcidad de la fuente:");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BoardC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoardCActionPerformed(evt);
            }
        });

        jLabel3.setText("Referencia Board:");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Serie del Procador");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Procesador_SerieC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Procesador_SerieCActionPerformed(evt);
            }
        });

        jLabel5.setText("Generacion:");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Text_Area_SugerenciaC.setColumns(20);
        Text_Area_SugerenciaC.setRows(5);
        jScrollPane2.setViewportView(Text_Area_SugerenciaC);

        Referencia_ProcesadorC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Referencia_ProcesadorCActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo de Board:");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TipoBoardC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AMD", "INTEL" }));
        TipoBoardC.setSelectedIndex(-1);
        TipoBoardC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoBoardCActionPerformed(evt);
            }
        });

        SugerenciaC.setText("!SUGERENCIA!");
        SugerenciaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SugerenciaCActionPerformed(evt);
            }
        });

        RegresarC.setText("REGRESAR");
        RegresarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FuenteC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BoardC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Procesador_SerieC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Referencia_ProcesadorC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TipoBoardC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52))
                    .addComponent(RegresarC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SugerenciaC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ir_BPFM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FuenteC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TipoBoardC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(BoardC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Procesador_SerieC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Referencia_ProcesadorC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(70, 70, 70)
                        .addComponent(SugerenciaC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(RegresarC)
                        .addGap(74, 74, 74))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Ir_BPFM)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Ir_BPFMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ir_BPFMActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Board_Procesador_Fuente_Menu bpf = new Board_Procesador_Fuente_Menu();
        bpf.setVisible(true);
        
    }//GEN-LAST:event_Ir_BPFMActionPerformed

    private void FuenteCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuenteCActionPerformed
        if(FuenteC.getSelectedItem().equals("200")){
            fuente=200;
        }else if(FuenteC.getSelectedItem().equals("300")){
            fuente=300;
        }
        else if(FuenteC.getSelectedItem().equals("500")){
            fuente=500;
        }else if(FuenteC.getSelectedItem().equals("600")){
            fuente=600;
        }else if(FuenteC.getSelectedItem().equals("750")){
            fuente=750;
        }else if(FuenteC.getSelectedItem().equals("800")){
            fuente=800;
        }else if(FuenteC.getSelectedItem().equals("850")){
            fuente=850;
        }else if(FuenteC.getSelectedItem().equals("900")){
            fuente=900;
        }else if(FuenteC.getSelectedItem().equals("1000")){
            fuente=1000;
        }
        
    }//GEN-LAST:event_FuenteCActionPerformed

    private void BoardCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoardCActionPerformed
       //FILTRADO DE BOARD 
        try{
        //AMD
           if(BoardC.getSelectedItem().equals("AM3+")){
                Procesador_SerieC.removeAllItems();              
                Procesador_SerieC.addItem("FX-Series");
                Procesador_SerieC.setSelectedItem(null);
           }else if(BoardC.getSelectedItem().equals("FM2+")){
                Procesador_SerieC.removeAllItems();              
                Procesador_SerieC.addItem("ATHLON X4");
                Procesador_SerieC.addItem("A4-SERIES");
                Procesador_SerieC.addItem("A6-SERIES");
                Procesador_SerieC.addItem("A8-SERIES");
                Procesador_SerieC.addItem("A10-SERIES");
                Procesador_SerieC.addItem("FX-SERIES");
                Procesador_SerieC.setSelectedItem(null);
           }else if(BoardC.getSelectedItem().equals("FM2")){
                Procesador_SerieC.removeAllItems();               
                Procesador_SerieC.addItem("SEMPRON X2");
                Procesador_SerieC.addItem("ATHLON X2");
                Procesador_SerieC.addItem("ATHLON X4");
                Procesador_SerieC.addItem("FIRE-PRO");
                Procesador_SerieC.addItem("A4-SERIES");
                Procesador_SerieC.addItem("A6-SERIES");
                Procesador_SerieC.addItem("A8-SERIES");
                Procesador_SerieC.addItem("A10-SERIES");
                Procesador_SerieC.addItem("FX-SERIES");
                Procesador_SerieC.setSelectedItem(null);
           }else if(BoardC.getSelectedItem().equals("AM1")){
                Procesador_SerieC.removeAllItems();               
                Procesador_SerieC.addItem("ATHLON X4");
                Procesador_SerieC.addItem("SEMPRON");
                Procesador_SerieC.addItem("ATHLON"); 
                Procesador_SerieC.setSelectedItem(null);
           }else if(BoardC.getSelectedItem().equals("AM4")){
                Procesador_SerieC.removeAllItems();               
                Procesador_SerieC.addItem("ATHLON X4");
                Procesador_SerieC.addItem("ATHLON");
                Procesador_SerieC.addItem("RYZEN-3");
                Procesador_SerieC.addItem("RYZEN-5");
                Procesador_SerieC.addItem("RYZEN-7");
                Procesador_SerieC.addItem("RYZEN-9");
                Procesador_SerieC.addItem("A6-SERIES");
                Procesador_SerieC.addItem("A8-SERIES");
                Procesador_SerieC.addItem("A10-SERIES");
                Procesador_SerieC.addItem("A12-SERIES");
                Procesador_SerieC.setSelectedItem(null);
           }
           //INTEL
           else if(BoardC.getSelectedItem().equals("LGA-1150")){
                Procesador_SerieC.removeAllItems(); 
                Procesador_SerieC.addItem("PENTIUM");
                Procesador_SerieC.addItem("I3-SERIES");
                Procesador_SerieC.addItem("I5-SERIES");
                Procesador_SerieC.addItem("I7-SERIES");
                Procesador_SerieC.setSelectedItem(null);
           }else if(BoardC.getSelectedItem().equals("LGA-1151")){
                Procesador_SerieC.removeAllItems();                
                Procesador_SerieC.addItem("CELERON");
                Procesador_SerieC.addItem("I3-SERIES");
                Procesador_SerieC.addItem("I5-SERIES");
                Procesador_SerieC.addItem("I7-SERIES"); 
                Procesador_SerieC.setSelectedItem(null);
           }else if(BoardC.getSelectedItem().equals("LGA-2011")){
                Procesador_SerieC.removeAllItems();                
                Procesador_SerieC.addItem("I7-SERIES"); 
                Procesador_SerieC.setSelectedItem(null);
           }else if(BoardC.getSelectedItem().equals("LGA-1200")){
                Procesador_SerieC.removeAllItems();                
                Procesador_SerieC.addItem("PENTIUM");
                Procesador_SerieC.addItem("I3-SERIES");
                Procesador_SerieC.addItem("I5-SERIES");
                Procesador_SerieC.addItem("I7-SERIES");
                Procesador_SerieC.setSelectedItem(null);
           } 
       }
        catch(Exception e){
           System.out.println(e);
        }
    }//GEN-LAST:event_BoardCActionPerformed

    private void Procesador_SerieCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Procesador_SerieCActionPerformed
    //FILTRADO POR BOARD y FAMILIA DE PROCESADOR
    try{    
        //AM3
        if(Procesador_SerieC.getSelectedItem().equals("FX-Series")&&(BoardC.getSelectedItem().equals("AM3+"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("FX-4000");
            Referencia_ProcesadorC.addItem("FX-6000");
            Referencia_ProcesadorC.addItem("FX-8000");
            Referencia_ProcesadorC.addItem("FX-9000");
            Referencia_ProcesadorC.setSelectedItem(null);
        //FM2+
        }else if(Procesador_SerieC.getSelectedItem().equals("ATHLON X4")&&(BoardC.getSelectedItem().equals("FM2+"))){
            Referencia_ProcesadorC.removeAllItems();           
            Referencia_ProcesadorC.addItem("AX4-800");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("A6-SERIES")&&(BoardC.getSelectedItem().equals("FM2+"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("A6-7000");
            Referencia_ProcesadorC.addItem("A6-8000");
            Referencia_ProcesadorC.setSelectedItem(null);
            
        }else if(Procesador_SerieC.getSelectedItem().equals("A8-SERIES")&&(BoardC.getSelectedItem().equals("FM2+"))){
            Referencia_ProcesadorC.removeAllItems();           
            Referencia_ProcesadorC.addItem("A8-7000");
            Referencia_ProcesadorC.addItem("A8-8000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("A10-SERIES")&&(BoardC.getSelectedItem().equals("FM2+"))){
            Referencia_ProcesadorC.removeAllItems();            
            Referencia_ProcesadorC.addItem("A10-7000");
            Referencia_ProcesadorC.addItem("A10-8000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("FX-SERIES")&&(BoardC.getSelectedItem().equals("FM2+"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("FX-700");
            Referencia_ProcesadorC.addItem("FX-800");
            Referencia_ProcesadorC.setSelectedItem(null);
        //FM2    
        }else if(Procesador_SerieC.getSelectedItem().equals("SEMPRON X2")&&(BoardC.getSelectedItem().equals("FM2"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("SX2-200");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("ATHLON X2")&&(BoardC.getSelectedItem().equals("FM2"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("AX2-300");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("ATHLON X4")&&(BoardC.getSelectedItem().equals("FM2"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("AX4-700");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("FIRE-PRO")&&(BoardC.getSelectedItem().equals("FM2"))){
            Referencia_ProcesadorC.removeAllItems();           
            Referencia_ProcesadorC.addItem("FP-A300");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("A4-SERIES")&&(BoardC.getSelectedItem().equals("FM2"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("A4-4000");
            Referencia_ProcesadorC.addItem("A4-5000");
            Referencia_ProcesadorC.addItem("A4-6000");
            Referencia_ProcesadorC.addItem("A4-7000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("A6-SERIES")&&(BoardC.getSelectedItem().equals("FM2"))){
            Referencia_ProcesadorC.removeAllItems();     
            Referencia_ProcesadorC.addItem("A6-5000");
            Referencia_ProcesadorC.addItem("A6-6000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("A8-SERIES")&&(BoardC.getSelectedItem().equals("FM2"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("A8-5000");
            Referencia_ProcesadorC.addItem("A8-6000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("A10-SERIES")&&(BoardC.getSelectedItem().equals("FM2"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("A10-5000");
            Referencia_ProcesadorC.addItem("A10-6000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("FX-SERIES")&&(BoardC.getSelectedItem().equals("FM2"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("FX-600");
            Referencia_ProcesadorC.setSelectedItem(null);
        }
        //AM1
        else if(Procesador_SerieC.getSelectedItem().equals("ATHLON X4")&&(BoardC.getSelectedItem().equals("AM1"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("AX4-500");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("SEMPRON")&&(BoardC.getSelectedItem().equals("AM1"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("S-2000");
            Referencia_ProcesadorC.addItem("S-3000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("ATHLON")&&(BoardC.getSelectedItem().equals("AM1"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("A-5000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }
        //AM4
        else if(Procesador_SerieC.getSelectedItem().equals("ATHLON")&&(BoardC.getSelectedItem().equals("AM4"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("A-200GE");
            Referencia_ProcesadorC.addItem("A-300GE");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("ATHLON X4")&&(BoardC.getSelectedItem().equals("AM4"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("AX4-900");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("RYZEN-3")&&(BoardC.getSelectedItem().equals("AM4"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("R3-1000");
            Referencia_ProcesadorC.addItem("R3-2000");
            Referencia_ProcesadorC.addItem("R3-3000");
            Referencia_ProcesadorC.addItem("R3-4000");
            Referencia_ProcesadorC.addItem("R3-5000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("RYZEN-5")&&(BoardC.getSelectedItem().equals("AM4"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("R5-1000");
            Referencia_ProcesadorC.addItem("R5-2000");
            Referencia_ProcesadorC.addItem("R5-3000");
            Referencia_ProcesadorC.addItem("R5-4000");
            Referencia_ProcesadorC.addItem("R5-5000");
            Referencia_ProcesadorC.setSelectedItem(null);            
        }
        else if(Procesador_SerieC.getSelectedItem().equals("RYZEN-7")&&(BoardC.getSelectedItem().equals("AM4"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("R7-1000");
            Referencia_ProcesadorC.addItem("R7-2000");
            Referencia_ProcesadorC.addItem("R7-3000");
            Referencia_ProcesadorC.addItem("R7-4000");
            Referencia_ProcesadorC.addItem("R7-5000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }
        else if(Procesador_SerieC.getSelectedItem().equals("RYZEN-9")&&(BoardC.getSelectedItem().equals("AM4"))){
            Referencia_ProcesadorC.removeAllItems(); 
            Referencia_ProcesadorC.addItem("R9-1000");
            Referencia_ProcesadorC.addItem("R9-2000");
            Referencia_ProcesadorC.addItem("R9-3000");
            Referencia_ProcesadorC.addItem("R9-4000");
            Referencia_ProcesadorC.addItem("R9-5000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }
        else if(Procesador_SerieC.getSelectedItem().equals("A6-SERIES")&&(BoardC.getSelectedItem().equals("AM4"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("A6-9000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("A8-SERIES")&&(BoardC.getSelectedItem().equals("AM4"))){
            Referencia_ProcesadorC.removeAllItems();         
            Referencia_ProcesadorC.addItem("A8-9000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("A10-SERIES")&&(BoardC.getSelectedItem().equals("AM4"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("A10-9000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }
        //INTEL
        //LGA-1150
        else if(Procesador_SerieC.getSelectedItem().equals("PENTIUM")&&(BoardC.getSelectedItem().equals("LGA-1150"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("P-G3000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("I3-SERIES")&&(BoardC.getSelectedItem().equals("LGA-1150"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("I3-4000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }
        else if(Procesador_SerieC.getSelectedItem().equals("I5-SERIES")&&(BoardC.getSelectedItem().equals("LGA-1150"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("I5-4000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("I7-SERIES")&&(BoardC.getSelectedItem().equals("LGA-1150"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("I7-4000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }
        //LGA-1151
        else if(Procesador_SerieC.getSelectedItem().equals("CELERON")&&(BoardC.getSelectedItem().equals("LGA-1151"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("C-3000");
            Referencia_ProcesadorC.addItem("C-4000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("I3-SERIES")&&(BoardC.getSelectedItem().equals("LGA-1151"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("I3-6000");
            Referencia_ProcesadorC.addItem("I3-7000");
            Referencia_ProcesadorC.addItem("I3-8000");
            Referencia_ProcesadorC.addItem("I3-9000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }
        else if(Procesador_SerieC.getSelectedItem().equals("I5-SERIES")&&(BoardC.getSelectedItem().equals("LGA-1151"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("I5-6000");
            Referencia_ProcesadorC.addItem("I5-7000");
            Referencia_ProcesadorC.addItem("I5-8000");
            Referencia_ProcesadorC.addItem("I5-9000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("I7-SERIES")&&(BoardC.getSelectedItem().equals("LGA-1151"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("I7-6000");
            Referencia_ProcesadorC.addItem("I7-7000");
            Referencia_ProcesadorC.addItem("I7-8000");
            Referencia_ProcesadorC.addItem("I7-9000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }
        //LGA-2011
        else if(Procesador_SerieC.getSelectedItem().equals("I7-SERIES")&&(BoardC.getSelectedItem().equals("LGA-2011"))){
            Referencia_ProcesadorC.removeAllItems();     
            Referencia_ProcesadorC.addItem("I7-3000");
            Referencia_ProcesadorC.addItem("I7-4000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }
        //LGA-1200
        else if(Procesador_SerieC.getSelectedItem().equals("CELERON")&&(BoardC.getSelectedItem().equals("LGA-1200"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("C-5000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }else if(Procesador_SerieC.getSelectedItem().equals("I3-SERIES")&&(BoardC.getSelectedItem().equals("LGA-1200"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("I3-10000");
            Referencia_ProcesadorC.addItem("I3-11000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }
        else if(Procesador_SerieC.getSelectedItem().equals("I5-SERIES")&&(BoardC.getSelectedItem().equals("LGA-1200"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("I5-10000");
            Referencia_ProcesadorC.addItem("I5-11000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }
        else if(Procesador_SerieC.getSelectedItem().equals("I7-SERIES")&&(BoardC.getSelectedItem().equals("LGA-1200"))){
            Referencia_ProcesadorC.removeAllItems();
            Referencia_ProcesadorC.addItem("I7-10000");
            Referencia_ProcesadorC.addItem("I7-11000");
            Referencia_ProcesadorC.setSelectedItem(null);
        }
     }catch(Exception e){
         System.out.println("e");
   }    
    }//GEN-LAST:event_Procesador_SerieCActionPerformed

    private void Referencia_ProcesadorCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Referencia_ProcesadorCActionPerformed
    /*try{
        if(Referencia_ProcesadorC.getSelectedItem().equals("FX-4000")&&(BoardC.getSelectedItem().equals("AM3+"))&&(Procesador_SerieC.getSelectedItem().equals("FX-Series"))){
                   Generacion_ProcesadorC.removeAllItems();
                   Generacion_ProcesadorC.addItem("1ra");
                   Generacion_ProcesadorC.addItem("2da");
                   Generacion_ProcesadorC.addItem("3ra");
                   Generacion_ProcesadorC.addItem("4ta");
              }else if(Referencia_ProcesadorC.getSelectedItem().equals("FX-6000")&&(BoardC.getSelectedItem().equals("AM3+"))){
                   Generacion_ProcesadorC.removeAllItems();
                   Generacion_ProcesadorC.addItem("1ra");
                   Generacion_ProcesadorC.addItem("2da");
                   Generacion_ProcesadorC.addItem("3ra");        
              }else if(Referencia_ProcesadorC.getSelectedItem().equals("FX-8000")&&(BoardC.getSelectedItem().equals("AM3+"))){
                   Generacion_ProcesadorC.removeAllItems();
                   Generacion_ProcesadorC.addItem("1ra");
                   Generacion_ProcesadorC.addItem("2da");
                   Generacion_ProcesadorC.addItem("3ra");        
              }else if(Referencia_ProcesadorC.getSelectedItem().equals("800")&&(BoardC.getSelectedItem().equals("FM2+"))){
                   Generacion_ProcesadorC.removeAllItems();
                   Generacion_ProcesadorC.addItem("1ra");
                   Generacion_ProcesadorC.addItem("2da");
                   Generacion_ProcesadorC.addItem("3ra");
                   Generacion_ProcesadorC.addItem("4ta"); 
                   Generacion_ProcesadorC.addItem("5ta"); 
              }else if(Referencia_ProcesadorC.getSelectedItem().equals("")&&(BoardC.getSelectedItem().equals("FM2+"))){
                   Generacion_ProcesadorC.removeAllItems();
                   Generacion_ProcesadorC.addItem("1ra");
                   Generacion_ProcesadorC.addItem("2da");
                   Generacion_ProcesadorC.addItem("3ra");
                   Generacion_ProcesadorC.addItem("4ta"); 
                   Generacion_ProcesadorC.addItem("5ta");
              }
    }catch(Exception e){
        System.out.println(e);
    }   */ 
    }//GEN-LAST:event_Referencia_ProcesadorCActionPerformed

    private void TipoBoardCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoBoardCActionPerformed
   //FILTRADO POR TIPO DE BOARD
        try{
            if(TipoBoardC.getSelectedItem().equals("AMD")){
                  BoardC.removeAllItems();
                  BoardC.addItem("AM3+");
                  BoardC.addItem("FM2");
                  BoardC.addItem("FM2+");
                  BoardC.addItem("AM1"); 
                  BoardC.addItem("AM4");
                  BoardC.setSelectedItem(null);

            }else if(TipoBoardC.getSelectedItem().equals("INTEL")){
                  BoardC.removeAllItems();
                  BoardC.addItem("LGA-1150");
                  BoardC.addItem("LGA-1151");
                  BoardC.addItem("LGA-2011");
                  BoardC.addItem("LGA-1200"); 
                  BoardC.setSelectedItem(null); 
            }
        }catch(Exception e){
            System.out.println(e);
        }  
    }//GEN-LAST:event_TipoBoardCActionPerformed

    private void SugerenciaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SugerenciaCActionPerformed
     try{
        //PROCESA LA SUGERENCIA
        String sugerencia="Tu fuente de poder es deficiente para implementarle una tarjeta grafica";
        //AMD
             //AM3+
        if(Referencia_ProcesadorC.getSelectedItem().equals("FX-4000")&&(fuente>=300)){
            sugerencia="GTX 780";  
        }else if(Referencia_ProcesadorC.getSelectedItem().equals("FX-6000")&&(fuente>=300)){
            sugerencia="GTX 780Ti"; 
        }else if(Referencia_ProcesadorC.getSelectedItem().equals("FX-8000")&&(fuente>=300)){
            sugerencia="GTX 1050"; 
        }else if(Referencia_ProcesadorC.getSelectedItem().equals("FX-8000")&&(fuente>=400)){
            sugerencia="GTX 1050 Y GTX 1650";
             //AM1    
        }else if(Referencia_ProcesadorC.getSelectedItem().equals("A-5000")&&(fuente>=300)){
            sugerencia="GT 710 Y GT 720"; 
        }else if(Referencia_ProcesadorC.getSelectedItem().equals("S-2000")&&(fuente>=300)){
            sugerencia="GT 710 Y GT 720"; 
        }else if(Referencia_ProcesadorC.getSelectedItem().equals("S-3000")&&(fuente>=300)){
            sugerencia="GT 710 Y GT 720"; 
        }else if(Referencia_ProcesadorC.getSelectedItem().equals("AX4-3000")&&(fuente>=300)){
            sugerencia="GT 720"; 
             //FM2   
                 //SEMPRON X2
        }else if(Referencia_ProcesadorC.getSelectedItem().equals("S-200")&&(fuente>=300)){
            sugerencia="GT 730 Y GT 740"; 
        }       //ATHLON X4
        else if(Referencia_ProcesadorC.getSelectedItem().equals("AX4-700")&&(fuente>=300)){
            sugerencia="GT 730"; 
                 //FIRE-PRO
        }else if(Referencia_ProcesadorC.getSelectedItem().equals("FP-A300")&&(fuente>=300)){
            sugerencia="GT 740";
                 //A4-SERIES
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("A4-4000"))||(Referencia_ProcesadorC.getSelectedItem().equals("A4-5000"))&&(fuente>=400)){
            sugerencia="GTX 750"; 
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("A4-4000"))||(Referencia_ProcesadorC.getSelectedItem().equals("A4-5000"))&&(fuente>=300||fuente<400)){
            sugerencia="GTX 740"; 
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("A4-6000"))||(Referencia_ProcesadorC.getSelectedItem().equals("A4-7000"))&&(fuente>=400)){
            sugerencia="GTX 750Ti Y GTX 760";
                 //A6-SERIES
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("A6-6000"))||(Referencia_ProcesadorC.getSelectedItem().equals("A6-5000"))&&(fuente>=400)){
            sugerencia="GTX 750Ti Y GTX 760";
                 //A8-SERIES
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("A8-6000"))||(Referencia_ProcesadorC.getSelectedItem().equals("A8-5000"))&&(fuente>=400)){
            sugerencia="GTX 750Ti Y GTX 760";
                 //A10-SERIES
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("A8-6000"))||(Referencia_ProcesadorC.getSelectedItem().equals("A8-5000"))&&(fuente>=400)){
            sugerencia="GTX 750Ti Y GTX 760";
                 //FX-SERIES
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("FX-600"))&&(fuente>=400)){
            sugerencia="GTX 750Ti";    
             //FM2+
                 //ATHLON X4
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("AX4-800"))&&(fuente>=400)){
            sugerencia="GTX 750Ti Y GTX 780Ti";
                 //A4-SERIES
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("A4-800"))&&(fuente>=400)){
            sugerencia="GTX 750Ti Y GTX 780Ti";
                 //A6-SERIES
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("A6-7000"))||(Referencia_ProcesadorC.getSelectedItem().equals("A6-8000"))&&(fuente>=400)){
            sugerencia="GTX 1050";
                 //A8-SERIES
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("A8-7000"))||(Referencia_ProcesadorC.getSelectedItem().equals("A8-8000"))&&(fuente>=400)){
            sugerencia="GTX 1050";
                 //FX-SERIES
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("FX-700"))||(Referencia_ProcesadorC.getSelectedItem().equals("FX-800"))&&(fuente>=400)){
            sugerencia="GTX 780Ti";
             //AM4
                 //ATHLON
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("A-200GE"))||(Referencia_ProcesadorC.getSelectedItem().equals("A-300GE"))&&(fuente>=600)){
            sugerencia="GTX 1070";
                 //ATHLON X4
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("AX4-900")&&(fuente>=500))){
            sugerencia="GTX 1050Ti";
                 //RYZEN-3
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("R3-2000"))||(Referencia_ProcesadorC.getSelectedItem().equals("R3-1000"))&&(fuente>=600)){
            sugerencia="GTX 1650";
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("R3-3000")&&(fuente>=600))){
            sugerencia="GTX 1660Ti";
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("R3-4000"))||(Referencia_ProcesadorC.getSelectedItem().equals("R3-5000"))&&(fuente>=700)){
            sugerencia="GTX 1080";
                 //RYZEN-5  
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("R5-2000"))||(Referencia_ProcesadorC.getSelectedItem().equals("R5-1000"))&&(fuente>=700)){
            sugerencia="GTX 1080";
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("R5-3000")&&(fuente>=700))){
            sugerencia="GTX 1080Ti";
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("R5-4000"))||(Referencia_ProcesadorC.getSelectedItem().equals("R5-5000"))&&(fuente>=700)){
            sugerencia="GTX 1080Ti";
                 //RYZEN-7  
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("R7-2000"))||(Referencia_ProcesadorC.getSelectedItem().equals("R7-1000"))&&(fuente>=600)){
            sugerencia="GTX 1660 SUPER";
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("R7-3000")&&(fuente>=700))){
            sugerencia="GTX 1660Ti";
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("R7-4000"))||(Referencia_ProcesadorC.getSelectedItem().equals("R7-5000"))&&(fuente>=850)){
            sugerencia="RTX 2060 SUPER";
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("R7-4000"))||(Referencia_ProcesadorC.getSelectedItem().equals("R7-5000"))&&(fuente<850||fuente>=600)){
            sugerencia="RTX 2060";
                  //RYZEN-9  
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("R9-2000"))||(Referencia_ProcesadorC.getSelectedItem().equals("R9-1000"))&&(fuente>=600&&fuente<650)){
            sugerencia="GTX 1080Ti";
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("R9-2000"))||(Referencia_ProcesadorC.getSelectedItem().equals("R9-1000"))&&(fuente>=650)){
            sugerencia="RTX 2060";
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("R9-3000")&&(fuente>=850))){
            sugerencia="RTX 2060 SUPER Y RTX 2070 SUPER";
        }else if(((Referencia_ProcesadorC.getSelectedItem().equals("R9-4000"))||(Referencia_ProcesadorC.getSelectedItem().equals("R9-5000")))&&(fuente>=900)){
            sugerencia="RTX 3070,RTX 3080 Y RTX 3090";
        //INTEL
             //LGA-1150
                 //PENTIUM
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("P-G3000")&&(fuente>=300))){
            sugerencia="GT 710 Y GT 720";
                  //I3-SERIES  
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("I3-4000")&&(fuente>=400))){
            sugerencia="GTX 750Ti Y GTX 750";
                  //I5-SERIES  
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("I5-4000")&&(fuente>=400))){
            sugerencia="GTX 760Ti Y GTX 760";
                  //I7-SERIES  
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("I7-4000")&&(fuente>=400&&fuente<500))){
            sugerencia="GTX 780"; 
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("I7-4000")&&(fuente>=500))){
            sugerencia="GTX 1050";
             //LGA-1151
                  //CELERON
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("C-4000")&&(fuente>=400))){
            sugerencia="GTX 750Ti";
                  //I3-SERIES  
        }else if(((Referencia_ProcesadorC.getSelectedItem().equals("I3-6000"))||(Referencia_ProcesadorC.getSelectedItem().equals("I3-7000"))||(Referencia_ProcesadorC.getSelectedItem().equals("I3-8000")))&&(fuente>=400)){
            sugerencia="GTX 1050";
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("I3-9000")&&(fuente>=400))){
            sugerencia="GTX 1050Ti";
                 //I5-SERIES
        }else if(((Referencia_ProcesadorC.getSelectedItem().equals("I5-6000"))||(Referencia_ProcesadorC.getSelectedItem().equals("7000"))||(Referencia_ProcesadorC.getSelectedItem().equals("I5-8000")))&&(fuente>=400)){
            sugerencia="GTX 1050";
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("I5-9000")&&(fuente>=600))){
            sugerencia="GTX 1080";
                 //I7-SERIES
        }else if(((Referencia_ProcesadorC.getSelectedItem().equals("I7-6000"))||(Referencia_ProcesadorC.getSelectedItem().equals("I7-7000"))||(Referencia_ProcesadorC.getSelectedItem().equals("I7-8000")))&&(fuente>=600)){
            sugerencia="GTX 1650 SUPER";
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("I7-9000")&&(fuente>=850))){
            sugerencia="RTX 2060 SUPER Y RTX 2060";
             //LGA-2011
                 //I7-SERIES
        }else if(((Referencia_ProcesadorC.getSelectedItem().equals("I7-3000"))||(Referencia_ProcesadorC.getSelectedItem().equals("I7-4000")))&&(fuente>=600)){
            sugerencia="GTX 1080";
             //LGA-1200
                 //CELERON
        }else if((Referencia_ProcesadorC.getSelectedItem().equals("C-5000")&&(fuente>=500))){
            sugerencia="GTX 1650 SUPER";  
                 //I3-SERIES
        }else if(((Referencia_ProcesadorC.getSelectedItem().equals("I3-10000"))||(Referencia_ProcesadorC.getSelectedItem().equals("I3-11000")))&&(fuente>=500)){
            sugerencia="GTX 1660 SUPER";
                 //I5-SERIES
        }else if(((Referencia_ProcesadorC.getSelectedItem().equals("I5-10000"))||(Referencia_ProcesadorC.getSelectedItem().equals("I5-11000")))&&(fuente>=850)){
            sugerencia="RTX 2060";
        }else if(((Referencia_ProcesadorC.getSelectedItem().equals("I5-10000"))||(Referencia_ProcesadorC.getSelectedItem().equals("I5-11000")))&&(fuente>=600&&fuente<850)){
            sugerencia="GTX 1080Ti";
                 //I7-SERIES
        }else if(((Referencia_ProcesadorC.getSelectedItem().equals("I7-10000"))||(Referencia_ProcesadorC.getSelectedItem().equals("I7-11000")))&&(fuente>=900)){
            sugerencia="RTX 3070 Y RTX 3080";
        }else if(((Referencia_ProcesadorC.getSelectedItem().equals("I7-10000"))||(Referencia_ProcesadorC.getSelectedItem().equals("I7-11000")))&&(fuente>=800&&fuente<900)){
            sugerencia="RTX 2080 SUPER";
        }//IMPRIME LA SUGERENCIA
        Text_Area_SugerenciaC.setText(" ");
        Text_Area_SugerenciaC.append(sugerencia);
     }catch(Exception o){
         System.out.println(o);
     }    
                  
        
    }//GEN-LAST:event_SugerenciaCActionPerformed

    private void RegresarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarCActionPerformed
    //Regresar al Menu principal
    this.setVisible(false);
    Menu catamenu=new Menu();
    catamenu.setVisible(true);   
    }//GEN-LAST:event_RegresarCActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Sugerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Sugerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Sugerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Sugerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            @Override
            public void run() {
                new Menu_Sugerencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoardC;
    private javax.swing.JComboBox<String> FuenteC;
    private javax.swing.JButton Ir_BPFM;
    private javax.swing.JComboBox<String> Procesador_SerieC;
    private javax.swing.JComboBox<String> Referencia_ProcesadorC;
    private javax.swing.JButton RegresarC;
    private javax.swing.JButton SugerenciaC;
    private javax.swing.JTextArea Text_Area_SugerenciaC;
    private javax.swing.JComboBox<String> TipoBoardC;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
