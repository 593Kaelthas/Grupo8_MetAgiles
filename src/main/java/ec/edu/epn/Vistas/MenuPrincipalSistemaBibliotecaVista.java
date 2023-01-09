package ec.edu.epn.Vistas;

import ec.edu.epn.Controladores.MenuPrincipalSistemaBibliotecaControlador;

import java.util.List;
import java.util.Scanner;

public class MenuPrincipalSistemaBibliotecaVista {


    public static void mostrarMenuOpciones(List<String> opciones){
        System.out.println("-----MENÚ PRINCIPAL-----");
        for (int i=0; i < opciones.size(); i++){
            System.out.println(i + 1 + "."+ opciones.get(i));
        }

        System.out.println("Seleccione una opción:");


    }

    public static int getOpcionSeleccionada(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
