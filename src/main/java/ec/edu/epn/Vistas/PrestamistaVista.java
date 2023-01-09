package ec.edu.epn.Vistas;

import ec.edu.epn.Controladores.PrestamistaControlador;
import ec.edu.epn.Controladores.RegexControlador;

import java.util.Scanner;

public class PrestamistaVista {
    private PrestamistaControlador prestamistaControlador;
    private RegexControlador regexControlador;
    private Scanner scanner;

    public PrestamistaVista(PrestamistaControlador prestamistaControlador, RegexControlador regexControlador, Scanner scanner) {
        this.prestamistaControlador = prestamistaControlador;
        this.regexControlador = regexControlador;
        this.scanner = scanner;
    }

    //submenu
    public void mostrarSubmenu(){
        System.out.println("----PRESTAMISTA----");
        System.out.println("1. Registrar ");
        System.out.println("2. Modificar ");
        System.out.println("3. Eliminar ");
        System.out.println("4. Consultar");
        System.out.println("5. Regresar");
        int opcionSeleccionada = seleccionarOpcion();
        if( opcionSeleccionada == 1)
            mostrarFormularioEInstanciarPrestamista();
        if (opcionSeleccionada == 5)
            mostrarSubmenu();

    }

    //seleccionar una opcion

    public int seleccionarOpcion(){
        int opcionSeleccionada = 0;
        System.out.println("Seleccione una opción:");

        return opcionSeleccionada = Integer.parseInt(scanner.nextLine());
    }





    //formulario Registro Prestamista
    public void mostrarFormularioEInstanciarPrestamista(){
        System.out.println("----Llene los siguientes campos para el registro del Prestamista-----");

        System.out.println("Nombre:");
        String nombre = scanner.nextLine();
        while(!regexControlador.usarValidarNombre(nombre)){
            System.out.println("Error al ingresar el nombre");
            System.out.println("Ingrese nuevamente el nombre");
            nombre = scanner.nextLine();
        }
        prestamistaControlador.setNombrePrestamista(nombre);


        System.out.println("Apellido:");
        String apellido = scanner.nextLine();
        while(!regexControlador.usarValidarApellido(apellido)){
            System.out.println("Error al ingresar el apellido");
            System.out.println("Ingrese nuevamente el apellido");
            apellido = scanner.nextLine();
        }
        prestamistaControlador.setApellidoPrestamista(apellido);

        System.out.println("Cédula:");
        String cedula = scanner.nextLine();
        while(!regexControlador.usarValidarCedula(cedula)){
            System.out.println("Cedula inválida");
            System.out.println("Ingrese nuevamente el cedula");
            cedula = scanner.nextLine();
        }
        prestamistaControlador.setCedulaPrestamista(cedula);

        System.out.println("Teléfono:");
        String telefono = scanner.nextLine();
        while(!regexControlador.usarValidarTelefono(telefono)){
            System.out.println("Telefono inválido");
            System.out.println("Ingrese nuevamente el telefono");
            telefono = scanner.nextLine();
        }
        prestamistaControlador.setTelefonoPrestamista(telefono);

        System.out.println("Dirección:");
        String direccion = scanner.nextLine();
        while(!regexControlador.usarValidarDireccion(direccion)){
            System.out.println("Error al ingresar el direccion");
            System.out.println("Ingrese nuevamente el direccion");
            direccion = scanner.nextLine();
        }
        prestamistaControlador.setDireccionPrestamista(direccion);








}
}
