package ec.edu.epn.Controladores;


import ec.edu.epn.Modelos.Bibliotecario;
import ec.edu.epn.Modelos.BibliotecarioDAO;
import org.junit.Test;

import static org.junit.Assert.*;

public class BibliotecarioControladorTest {

    @Test
    public void when_create_bibliotecario_check_equals(){
        String nombre = "Carolina";
        String apellido = "Pantoja";
        String cedula = "1726085564";
        String telefono = "0987858957";
        String direccion = "Mena del Hierro";
        String idUsuario = "Caro";
        String password = "caro123";
        Bibliotecario bibliotecario = new Bibliotecario(nombre,apellido, cedula, telefono, direccion, idUsuario, password);
        BibliotecarioDAO bibliotecarioDAO = new BibliotecarioDAO();
        BibliotecarioControlador bibliotecarioControlador = new BibliotecarioControlador(bibliotecario, bibliotecarioDAO);

        assertEquals(nombre, bibliotecarioControlador.getBibliotecario().getNombre());
        assertEquals(apellido, bibliotecarioControlador.getBibliotecario().getApellido());
        assertEquals(cedula, bibliotecarioControlador.getBibliotecario().getCedula());
        assertEquals(telefono, bibliotecarioControlador.getBibliotecario().getTelefono());
        assertEquals(direccion, bibliotecarioControlador.getBibliotecario().getDireccion());
        assertEquals(idUsuario, bibliotecarioControlador.getBibliotecario().getIdUsuario());
        assertEquals(password, bibliotecarioControlador.getBibliotecario().getPassword());
    }

}