package entidades;

import java.util.ArrayList;

public class Board {
    ArrayList<Board> boards = new ArrayList<>();
    private String tipo;
    private String puerto;
    
    // Constructor vacío para evitar errores
    public Board(){}
    
    public Board(String tipo, String puerto) {
        this.tipo = tipo;
        this.puerto = puerto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Board{");
        sb.append("\nTipo: ").append(tipo);
        sb.append("\nPuerto:").append(puerto);
        sb.append("\n}");
        return sb.toString();
    }
    
    public void catalogoBoards(){
        //boards
            //AMD
        boards.add(new Board("AMD","AM3+"));
        boards.add(new Board("AMD","FM2"));
        boards.add(new Board("AMD","FM2+"));
        boards.add(new Board("AMD","AM1"));
        boards.add(new Board("AMD","AM4"));
            //intel
        boards.add(new Board("INTEL","LGA 1150/Socket H3"));
        boards.add(new Board("INTEL","LGA 1151"));
        boards.add(new Board("INTEL","LGA 2066/Socket R4"));
        boards.add(new Board("INTEL","LGA 1151 rev2"));
        boards.add(new Board("INTEL","LGA 1200"));
        boards.add(new Board("INTEL","LGA 1700"));
    }
    
    public ArrayList<Board> listaBoards(){
        return boards;
    }
    
    public ArrayList<Board> agregarBoard(Board board){
        boards.add(board);
        return boards;
    }
}
