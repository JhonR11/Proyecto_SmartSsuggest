/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import entidades.TarjetaGrafica;
import entidades.TarjetaGrafica;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author SirArthur
 */
public class Catalogo {
    public ArrayList<TarjetaGrafica>tarjetas;

    public Catalogo() {
    }
    
    
    public Catalogo(ArrayList<TarjetaGrafica> tarjetas) {
        this.tarjetas = tarjetas;
    }

    
 
    public ArrayList CrearCatalogo (){
        //ARRY LIST DE TARJETAS
        tarjetas= new ArrayList();
        InsertarTarjeta(new TarjetaGrafica("Nvidia","GT 710","2/1 ","DDR3",19,false,"ninguno","PCI 2.0 x8",192,"baja"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia","GT 710","2/1 ","DDR3",19,false,"ninguno","PCI 2.0 x8",192,"baja"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia","GT 710","2/1 ","DDR3",19,false,"ninguno","PCI 2.0 x8",192,"baja"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia","GT 720","1/2","DDR3/GDDR5",23,false,"ninguno","PCI 2.0 x8",192,"baja"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia","GT 730","2","GDDR5",35,false,"ninguno","PCI 2.0 x16",384,"baja"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia","GT 740","1/2","GDDR5/DDR3",64,true,"0/1x6","PCI 3.0 x16",384,"baja"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia","GTX 750","2","GDDR5",55,false,"ninguno","PCI 3.0 x16",512,"baja"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia","GTX 750 ti","2","GDDR5",60,false,"ninguno","PCI 3.0 x16",640,"baja"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia","GTX 760","2","GDDR5",170,true,"2x16","PCI 3.0 x16",1152,"baja"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia","GTX 770","2","GDDR5",230,true,"1x6/1x8","CPCI 3.0 x16",1536,"baja"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia","GTX 780","2","GDDR5",250,true,"1x6/1x8","PCI 3.0 x16",2304,"baja-media"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia","GTX 780 ti","2","GDDR5",250,true,"1x6/1x8","PCI 3.0 x16",2880,"baja-media"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia","GTX TITAN","2","GDDR5",250,true,"1x6/1x8","PCI 3.0 x16",2688,"baja-alta"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia","GTX TITAN BLACK","2","GDDR5",250,true,"1x6/1x8","PCI 3.0 x16",2880,"baja-alta"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia","GT TITAN Z","2","GDDR5",250,true,"1x6/1x8","PCI 3.0 x16",5780,"baja-alta"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia", "GTX 1050Ti", "4", "GDDR5", 75, false, "ninguno", "PCI Express 3.0 x 16", 3000, "baja"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia", "GTX 1050", "3", "GDDR5", 75, false, "ninguno", "PCI Express 3.0 x 16", 3001, "baja"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia", "GTX 1650", "4", "GDDR6", 75, false, "ninguno", "PCI Express 3.0 x 16", 3002, "baja/media"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia", "GTC 1660 SUPER", "6", "GDDR6", 125, false, "ninguno", "PCI Express 3.0 x 16", 3003, "media"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia", "GTX 1650 SUPER", "4", "GDDR6", 100, false, "ninguno", "PCI Express 3.0 x 16", 3004, "media"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia", "GTX 1660", "4", "GDDR6", 120, false, "ninguno", "PCI Express 3.0 x 16", 3005, "media"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia", "GTX 1660 TI", "6", "GDDR6", 120, false, "ninguno", "PCI Express 3.0 x 16", 3006, "media"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia", "GTX 1070", "8", "GDDR5", 180, false, "ninguno", "PCI Express 3.0 x 16", 3007, "media"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia", "GTX 1070 TI", "8", "GDDR5", 150, false, "ninguno", "PCI Express 3.0 x 16", 3008, "media"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia", "GTX 1080", "8", "GDDR5", 180, false, "ninguno", "PCI Express 3.0 x 16", 3009, "media"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia", "GTX 1080 TI", "11", "GDDR5", 250, false, "ninguno", "PCI Express 3.0 x 16", 3010, "media-Alta"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia", "RTX 2060", "6", "GDDR6", 160, false, "ninguno", "PCI Express 3.0 x 16", 3011, "media-Alta"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia", "RTX 2070", "8", "GDDR6", 175, false, "ninguno", "PCI Express 3.0 x 16", 3012, "media-Alta"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia", "RTX 2080", "8", "GDDR6", 215, false, "ninguno", "PCI Express 3.0 x 16", 3013, "media-Alta"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia", "RTX 2080 TI", "11", "GDDR6", 250, false, "ninguno", "PCI Express 3.0 x 16", 3014, "Alta"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia", "RTX 2060 SUPER", "8", "GDDR6", 175, false, "ninguno", "PCI Express 4.0 x 16", 3015, "Alta"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia", "RTX 2070 SUPER", "8", "GDDR6", 215, true, "1x6/1x8", "PCI Express 4.0 x 16", 3016, "Alta"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia", "RTX 2080 SUPER", "8", "GDDR6", 250, true, "1x6/1x8", "PCI Express 4.0 x 16", 3017, "Alta"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia", "RTX 3070", "8", "GDDR6", 220, true, "1x6/1x8", "PCI Express 4.0 x 16", 3018, "Alta"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia", "RTX 3080", "10", "GDDR6X", 320, true, "1x6/1x8", "PCI Express 4.0 x 16", 3019, "Alta"));
        InsertarTarjeta(new TarjetaGrafica("Nvidia", "RTX 3090", "24", "GDDR6X", 350, true, "1x6/1x8", "PCI Express 4.0 x 16", 3020, "Alta"));

        
        return tarjetas;
    }
    
    public void InsertarTarjeta(TarjetaGrafica tarjeta){
        //AQUI SE INSERTAN AL ARRAYLIST
        tarjetas.add(tarjeta);
    }
    
    public  String Imprimir(){
        //Aqui se muestran en pantalla las tarjetas disponibles
        String imprimir=" ";
        for(int contador =0 ; contador<tarjetas.size();contador++){
            imprimir+=tarjetas.get(contador).toString()+"\n";
        }
        return imprimir;
    }

    
    public TarjetaGrafica CrearTarjeta(){
        //Aqui se crean las tarjetas que se añadiran al catalogo
        String nombre=(JOptionPane.showInputDialog(null,"Ingrese el nombre del fabricante:","fabricante",JOptionPane.PLAIN_MESSAGE,null,new Object[]{"selecciona","NVIDIA","AMD"},"selecciona")).toString();
        String modelo=JOptionPane.showInputDialog("Ingrese el nombre del modelo:");
        String vram=JOptionPane.showInputDialog("ingresa el numero de Vram:");
        String tipomemoria=(JOptionPane.showInputDialog(null,"Ingrese el tipo de memoria:","TipoMemoria",JOptionPane.PLAIN_MESSAGE,null,new Object[]{"selecciona","DDR3","GDDR2","GDDR3","GDDR4","GDDR5","GDDR6"},"selecciona")).toString();
        int consumo=Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de Watts que consume"));
       
        boolean alimentacion_externa=false;
        String pines="ninguno";
        String comprobarAlimentacion=(JOptionPane.showInputDialog(null,"Tiene fuente de alimentacion externa?","Alimentacion externa",JOptionPane.PLAIN_MESSAGE,null,new Object[]{"selecciona","si","no"},"selecciona")).toString();
         if ("si".equals(comprobarAlimentacion)){
                     alimentacion_externa=true;
                     pines=(JOptionPane.showInputDialog(null,"Ingrese el numero de cables X pines","Cantidad cable x pines",JOptionPane.PLAIN_MESSAGE,null,new Object[]{"selecciona","1x4","1x6","1x8","2x4","2x6","2x8"},"selecciona")).toString();
                     }
               
        String puerto=(JOptionPane.showInputDialog(null,"Ingrese el tipo de puerto:","Tipo puerto PCI",JOptionPane.PLAIN_MESSAGE,null,new Object[]{"selecciona","PCI 1.0 x8","PCI 2.0 x8","PCI 2.0 x16","PCI 3.0 x8","PCI 3.0 x16","PCI 4.0 x 16"},"selecciona")).toString();
        int  procesadores=Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero de procesadores:"));
        String gama=(JOptionPane.showInputDialog(null,"Ingrese la gama","Gama",JOptionPane.PLAIN_MESSAGE,null,new Object[]{"selecciona","baja","baja-media","baja-alta","media-baja","media","media-alta","alta-baja","alta-media","alta",},"selecciona")).toString();
        TarjetaGrafica tarjeta = new TarjetaGrafica(nombre,modelo,vram,tipomemoria,consumo,alimentacion_externa,pines,puerto,procesadores,gama);
        return tarjeta;      
    }
    
    /**
     *
     * @param tarjeta
     * @return
     */
    
    
    public boolean modificartarjeta(TarjetaGrafica tarjeta,int id){
        //AQUI SE VERIFICA QUE EXISTA LA TARJETA Y LUEGO SE EDITA
        boolean encontrado= false;
        for(int contador=0;contador<tarjetas.size();contador++){
            if(tarjetas.get(contador).getId()==id){
                encontrado=true;
                tarjetas.get(contador).setNombre(tarjeta.getNombre());
                tarjetas.get(contador).setModelo(tarjeta.getModelo());
                tarjetas.get(contador).setVram(tarjeta.getVram());
                tarjetas.get(contador).setTipomemoria(tarjeta.getTipomemoria());
                tarjetas.get(contador).setConsumo(tarjeta.getConsumo());
                tarjetas.get(contador).setAlimentacion_externa(tarjeta.isAlimentacion_externa());
                tarjetas.get(contador).setPines(tarjeta.getPines());
                tarjetas.get(contador).setPuerto(tarjeta.getPuerto());
                tarjetas.get(contador).setProcesadores(tarjeta.getProcesadores());
                tarjetas.get(contador).setGama(tarjeta.getGama());
                
            } 
        }
        return encontrado;
    }
    
    
    public boolean eliminartarjeta(int id){
        //AQUI SE VERIFICA QUE EXISTA LA TARJETA Y LUEGO SE BORRA
         boolean encontrado= false;
        for(int contador=0;contador<tarjetas.size();contador++){
            if(tarjetas.get(contador).getId()==id){
                encontrado=true;
                tarjetas.remove(contador);         
                }
        }
        return encontrado;
    }
    
  
}
