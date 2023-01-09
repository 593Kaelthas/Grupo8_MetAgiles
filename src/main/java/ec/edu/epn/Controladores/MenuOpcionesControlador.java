package ec.edu.epn.Controladores;

import com.google.gson.Gson;
import ec.edu.epn.Modelos.*;
import ec.edu.epn.Vistas.BibliotecarioVista;
import ec.edu.epn.Vistas.LogInVista;
import ec.edu.epn.Vistas.MenuOpcionesVista;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class MenuOpcionesControlador {


    //mostrar menuPrincipal
    public static void mostrarMenu() {
        MenuOpciones menuOpciones = new MenuOpciones();
        List<String> opciones = menuOpciones.getOpciones();
        MenuOpcionesVista.mostrarMenu(opciones);
        int opcionSeleccionada = MenuOpcionesVista.getOpcionSeleccionada();

        //TO DO: logica restante
        Gson gson = new Gson();
        Map<String, Bibliotecario> bibliotecarios = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        Bibliotecario bibliotecario = new Bibliotecario("fsd", "", "", "", "", "", "");
        BibliotecarioDAO bibliotecarioDAO = new BibliotecarioDAO(gson, bibliotecarios);

        MenuPrincipalSistemaBiblioteca menuPrincipalSistemaBiblioteca = new MenuPrincipalSistemaBiblioteca();
        LogIn logIn = new LogIn(menuPrincipalSistemaBiblioteca);


        switch (opcionSeleccionada) {
            case 1: {

                BibliotecarioControlador bibliotecarioControlador = new BibliotecarioControlador(bibliotecario, bibliotecarioDAO);
                BibliotecarioVista bibliotecarioVista = new BibliotecarioVista(bibliotecarioControlador, scanner);

                bibliotecarioVista.mostrarFormularioEInstanciarBibliotecario();
                bibliotecarioDAO.crearBibliotecario(bibliotecario);


                break;
            }
            case 2: {

                LogInControlador logInControlador = new LogInControlador( bibliotecarioDAO, logIn);
                LogInVista logInVista = new LogInVista(logInControlador, scanner);

                logInVista.mostrarMenuLogIn();




                break;
            }
            case 3: {
                System.out.println("----Gracias Por utilizar nuestro sistema------ )");
                System.exit(0);
                break;
            }


        }


    }
}
