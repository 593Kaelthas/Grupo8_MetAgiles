package ec.edu.epn.Controladores;

import com.google.gson.Gson;
import ec.edu.epn.Modelos.Libro;
import ec.edu.epn.Modelos.LibroDAO;
import ec.edu.epn.Modelos.MenuPrincipalSistemaBiblioteca;
import ec.edu.epn.Vistas.LibroVista;
import ec.edu.epn.Vistas.MenuPrincipalSistemaBibliotecaVista;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MenuPrincipalSistemaBibliotecaControlador {

    public static void mostrarMenu(){
        Scanner scanner = new Scanner(System.in);
        MenuPrincipalSistemaBiblioteca menuPrincipalSistemaBiblioteca = new MenuPrincipalSistemaBiblioteca();
        List <String> opciones = menuPrincipalSistemaBiblioteca.getOpciones();
        MenuPrincipalSistemaBibliotecaVista.mostrarMenuOpciones(opciones);
        int opcionSeleccionada = MenuPrincipalSistemaBibliotecaVista.getOpcionSeleccionada();

        Gson gson = new Gson();
        Map<String, Libro> libros = new HashMap<>();
        Libro libro = new Libro();
        LibroDAO libroDAO = new LibroDAO(gson, libros);
        LibroControlador libroControlador = new LibroControlador(libro, libroDAO);
        LibroVista libroVista = new LibroVista(libroControlador, scanner);

        switch (opcionSeleccionada) {
            case 1: {
                System.out.println("fsdfsd");
                break;
            }
            case 2: {

                break;
            }
            case 3: {
                break;
            }
            case 4: {
                break;

            }
            case 5: {
                System.out.println("----Gracias Por utilizar nuestro sistema------ )");
                System.exit(0);
                break;
            }

        }

    }
}
