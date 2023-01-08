package ec.edu.epn.Controladores;

import ec.edu.epn.Modelos.Bibliotecario;
import ec.edu.epn.Modelos.BibliotecarioDAO;

public class BibliotecarioControlador {
    private Bibliotecario bibliotecario;
    private BibliotecarioDAO bibliotecarioDAO;

    public BibliotecarioControlador(Bibliotecario bibliotecario, BibliotecarioDAO bibliotecarioDAO) {
        this.bibliotecario = bibliotecario;
        this.bibliotecarioDAO = bibliotecarioDAO;
    }

    public void setNombreBibliotecario(String nombre){
        bibliotecario.setNombre(nombre);
    }

    public void setApellidoBibliotecario( String apellido){
        bibliotecario.setApellido(apellido);
    }
    public void setCedula( String cedula){
        bibliotecario.setCedula(cedula);
    }
    public void setTelefono( String telefono){
        bibliotecario.setTelefono(telefono);
    }
    public void setDireccion( String direccion){
        bibliotecario.setDireccion(direccion);
    }
    public void setIdUsuario( String idUsuario){
        bibliotecario.setIdUsuario(idUsuario);
    }
    public void setPassword( String password){
        bibliotecario.setPassword(password);
    }
}
