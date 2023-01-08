package ec.edu.epn.Controladores;

import ec.edu.epn.Modelos.MenuOpciones;
import ec.edu.epn.Vistas.MenuOpcionesVista;

import java.util.List;

public class MenuOpcionesControlador {



    //mostrar menuPrincipal
    public static void mostrarMenu(){
        MenuOpciones menuOpciones = new MenuOpciones();
        List <String> opciones = menuOpciones.getOpciones();
        MenuOpcionesVista.mostrarMenu(opciones);
        int opcionSeleccionada = MenuOpcionesVista.getOpcionSeleccionada();

        //TO DO: logica restante

        if (opcionSeleccionada == 1) {
            System.out.println("Joffre, vales 3 hectáreas de vrg");
        }




    }
}
