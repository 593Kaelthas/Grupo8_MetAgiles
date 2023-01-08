package ec.edu.epn.Controladores;

import ec.edu.epn.Modelos.Bibliotecario;
import ec.edu.epn.Modelos.BibliotecarioDAO;
import ec.edu.epn.Modelos.LogIn;
import ec.edu.epn.Vistas.MenuOpcionesVista;

public class LogInControlador {

    private BibliotecarioDAO bibliotecarioDAO;
    private LogIn logIn;

    public LogInControlador(BibliotecarioDAO bibliotecarioDAO, LogIn logIn) {
        this.bibliotecarioDAO = bibliotecarioDAO;
        this.logIn = logIn;
    }

    public void manejarSolicitudLogIn(String idUsuario, String password){

        Bibliotecario bibliotecario = bibliotecarioDAO.getBibliotecario(idUsuario);

        if (bibliotecario == null) {
            System.out.println("---No exite tal ID Usuario registrado---" + "\n");
            //TODO: Presentar nuevamente el menu de login
            MenuOpcionesControlador.mostrarMenu();
        } else {
            if (!bibliotecario.getPassword().equals(password)){
                System.out.println("---Contraseña Incorrecta---" + "\n");
                //TODO: Presentar nuevamente el menu de login
                MenuOpcionesControlador.mostrarMenu();
            } else {
                logIn.ingresarSistemaBiblioteca();
                //TODO: Despliega el menu principal
            }
        }

    }
}
