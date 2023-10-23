package Persistencia;

import java.util.ArrayList;

public class Usuario {
    private String Usser;
    private String Pass;
    private boolean tipUsser;
    ArrayList<Usuario> listaUsuario = new ArrayList<>();
    
    // Constructor vacío para evitar errores de código
    public Usuario() {
        
    }
    
    // Constructor utilizado para obtener el usuario, la contraseña y si es admin o no
    public Usuario(String Usser, String Pass, boolean tipUsser) {
        this.Usser = Usser;
        this.Pass = Pass;
        this.tipUsser = tipUsser;
    }
    
    // Getters y Setters
    public String getUsser() {
        return Usser;
    }

    public void setUsser(String Usser) {
        this.Usser = Usser;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public boolean isTipUsser() {
        return tipUsser;
    }

    public void setTipUsser(boolean tipUsser) {
        this.tipUsser = tipUsser;
    }
    
    public void catalogoUsuarios(){
        listaUsuario.add(new Usuario("Admin", "135", true));
        listaUsuario.add(new Usuario("noAdmin", "135", false));
    }
    
    public ArrayList<Usuario> listaUsuario(){
        return listaUsuario;
    }
    
    public ArrayList<Usuario> agregarUsuario(Usuario usser){
        listaUsuario.add(usser);
        return listaUsuario;
    }
}
