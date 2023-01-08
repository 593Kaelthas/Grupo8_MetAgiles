package ec.edu.epn.Vistas;

import ec.edu.epn.Controladores.BibliotecarioControlador;
import ec.edu.epn.Modelos.Bibliotecario;
import ec.edu.epn.Modelos.BibliotecarioDAO;

import java.util.Scanner;

public class BibliotecarioVista {
    private BibliotecarioControlador bibliotecarioControlador;
    private Scanner scanner;

    public BibliotecarioVista(BibliotecarioControlador bibliotecarioControlador, Scanner scanner) {
        this.bibliotecarioControlador = bibliotecarioControlador;
        this.scanner = scanner;
    }



    //formulario de registro

    public void mostrarFormularioEInstanciarBibliotecario(){
        System.out.println("----Llene los siguientes campos para el registro del Bibliotecario-----");

        System.out.println("Nombre:");
        String nombre = scanner.nextLine();
        bibliotecarioControlador.setNombreBibliotecario(nombre);

        System.out.println("Apellido:");
        String apellido = scanner.nextLine();
        bibliotecarioControlador.setApellidoBibliotecario(apellido);

        System.out.println("Cédula:");
        String cedula = scanner.nextLine();
        bibliotecarioControlador.setCedula(cedula);

        System.out.println("Teléfono:");
        String telefono = scanner.nextLine();
        bibliotecarioControlador.setTelefono(telefono);

        System.out.println("Dirección:");
        String direccion = scanner.nextLine();
        bibliotecarioControlador.setDireccion(direccion);

        System.out.println("ID Usuario(Unique):");
        String idUsuario = scanner.nextLine();
        bibliotecarioControlador.setIdUsuario(idUsuario);

        System.out.println("Password:");
        String password = scanner.nextLine();
        bibliotecarioControlador.setPassword(password);



    }

}
