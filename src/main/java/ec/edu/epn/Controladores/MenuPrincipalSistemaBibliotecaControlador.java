package ec.edu.epn.Controladores;

import ec.edu.epn.Modelos.MenuPrincipalSistemaBiblioteca;
import ec.edu.epn.Vistas.MenuPrincipalSistemaBibliotecaVista;

import java.util.List;

public class MenuPrincipalSistemaBibliotecaControlador {

    public static void mostrarMenu(){
        MenuPrincipalSistemaBiblioteca menuPrincipalSistemaBiblioteca = new MenuPrincipalSistemaBiblioteca();
        List <String> opciones = menuPrincipalSistemaBiblioteca.getOpciones();
        MenuPrincipalSistemaBibliotecaVista.mostrarMenuOpciones(opciones);
        int opcionSeleccionada = MenuPrincipalSistemaBibliotecaVista.getOpcionSeleccionada();



        switch (opcionSeleccionada) {
            case 1: {
                System.out.println("fsdfsd");
            }

        }

    }
}
