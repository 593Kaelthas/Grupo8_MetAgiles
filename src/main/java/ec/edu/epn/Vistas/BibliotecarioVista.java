package ec.edu.epn.Vistas;

import ec.edu.epn.Controladores.BibliotecarioControlador;
import ec.edu.epn.Controladores.RegexControlador;

import java.util.Scanner;

public class BibliotecarioVista {
    private BibliotecarioControlador bibliotecarioControlador;

    private RegexControlador regexControlador;
    private Scanner scanner;

    public BibliotecarioVista(BibliotecarioControlador bibliotecarioControlador, Scanner scanner) {
        this.bibliotecarioControlador = bibliotecarioControlador;
        this.regexControlador = new RegexControlador();
        this.scanner = scanner;
    }



    //formulario de registro

    public void mostrarFormularioEInstanciarBibliotecario(){
        System.out.println("----Llene los siguientes campos para el registro del Bibliotecario-----");

        System.out.println("Nombre:");
        String nombre = scanner.nextLine();
        while(!regexControlador.usarValidarNombre(nombre)){
            System.out.println("Error al ingresar el nombre");
            System.out.println("Ingrese nuevamente el nombre");
            nombre = scanner.nextLine();
        }
        bibliotecarioControlador.setNombreBibliotecario(nombre);


        System.out.println("Apellido:");
        String apellido = scanner.nextLine();
        while(!regexControlador.usarValidarApellido(apellido)){
            System.out.println("Error al ingresar el apellido");
            System.out.println("Ingrese nuevamente el apellido");
            apellido = scanner.nextLine();
        }
        bibliotecarioControlador.setApellidoBibliotecario(apellido);

        System.out.println("Cédula:");
        String cedula = scanner.nextLine();
        while(!regexControlador.usarValidarCedula(cedula)){
            System.out.println("Cedula inválida");
            System.out.println("Ingrese nuevamente el cedula");
            cedula = scanner.nextLine();
        }
        bibliotecarioControlador.setCedula(cedula);

        System.out.println("Teléfono:");
        String telefono = scanner.nextLine();
        while(!regexControlador.usarValidarTelefono(telefono)){
            System.out.println("Telefono inválido");
            System.out.println("Ingrese nuevamente el telefono");
            telefono = scanner.nextLine();
        }
        bibliotecarioControlador.setTelefono(telefono);

        System.out.println("Dirección:");
        String direccion = scanner.nextLine();
        while(!regexControlador.usarValidarDireccion(direccion)){
            System.out.println("Error al ingresar el direccion");
            System.out.println("Ingrese nuevamente el direccion");
            direccion = scanner.nextLine();
        }
        bibliotecarioControlador.setDireccion(direccion);

        System.out.println("ID Usuario(Unique):");
        String idUsuario = scanner.nextLine();
        while(!regexControlador.usarValidarIdUsuario(idUsuario)){
            System.out.println("IdUsuario inválido");
            System.out.println("Ingrese nuevamente el idUsuario");
            idUsuario = scanner.nextLine();
        }
        bibliotecarioControlador.setIdUsuario(idUsuario);

        System.out.println("Password:");
        String password = scanner.nextLine();
        while(!regexControlador.usarValidarPassword(password)){
            System.out.println("Password inválido");
            System.out.println("Ingrese nuevamente el password");
            password = scanner.nextLine();
        }
        bibliotecarioControlador.setPassword(password);



    }

}
