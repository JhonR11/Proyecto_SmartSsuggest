package entidades;

import java.util.ArrayList;

public class Fuente  {
    ArrayList<Fuente> fuentes = new ArrayList<>();
    private int capacidad;
    
    // Constructor vacío para evitar errores
    public Fuente(){};
    
    public Fuente(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }     

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fuente{");
        sb.append("\ncapacidad: ").append(capacidad);
        sb.append("\n}");
        return sb.toString();
    }
    
    public void catalogoFuentes(){
        fuentes.add(new Fuente(200));
        fuentes.add(new Fuente(250));
        fuentes.add(new Fuente(300));
        fuentes.add(new Fuente(350));
        fuentes.add(new Fuente(400));
        fuentes.add(new Fuente(450));
        fuentes.add(new Fuente(500));
        fuentes.add(new Fuente(550));
        fuentes.add(new Fuente(600));
        fuentes.add(new Fuente(650));
        fuentes.add(new Fuente(700));
        fuentes.add(new Fuente(750));
        fuentes.add(new Fuente(800));
        fuentes.add(new Fuente(850));
        fuentes.add(new Fuente(900));
        fuentes.add(new Fuente(950));
        fuentes.add(new Fuente(1000));
    }
    
    public ArrayList<Fuente> listaFuentes(){
        return fuentes;
    }
    
    ArrayList<Fuente> agregarFuente(Fuente fuente){
        fuentes.add(fuente);
        return fuentes;
    }
}

  
    
    
    

