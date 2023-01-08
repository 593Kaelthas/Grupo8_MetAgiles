package ec.edu.epn.Vistas;

import ec.edu.epn.Controladores.LogInControlador;

import java.util.Scanner;

public class LogInVista {
    private LogInControlador logInControlador;
    private Scanner scanner;

    public LogInVista(LogInControlador logInControlador, Scanner scanner) {
        this.logInControlador = logInControlador;
        this.scanner = scanner;
    }

    public void mostrarMenuLogIn(){
        System.out.println("---Inicio de Sesión---");
        System.out.println("Identificador de Usuario:");
        String idUsuario = scanner.nextLine();
        System.out.println("Contraseña:");
        String password = scanner.nextLine();

        logInControlador.manejarSolicitudLogIn(idUsuario,password);

    }
}
