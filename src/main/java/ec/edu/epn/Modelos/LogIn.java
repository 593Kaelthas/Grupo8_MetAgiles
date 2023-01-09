package ec.edu.epn.Modelos;
import ec.edu.epn.Controladores.LogInControlador;
import ec.edu.epn.Vistas.MenuPrincipalSistemaBibliotecaVista;

import java.util.Scanner;

public class LogIn {

    private MenuPrincipalSistemaBiblioteca menuPrincipalSistemaBiblioteca;

    public LogIn(MenuPrincipalSistemaBiblioteca menuPrincipalSistemaBiblioteca) {
        this.menuPrincipalSistemaBiblioteca = menuPrincipalSistemaBiblioteca;
    }

    //TODO: Ingresar al sistema
    public void ingresarSistemaBiblioteca(){
        MenuPrincipalSistemaBibliotecaVista.mostrarMenu(menuPrincipalSistemaBiblioteca.getOpciones());
    }

}
