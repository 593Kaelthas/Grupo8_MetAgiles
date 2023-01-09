package ec.edu.epn.Modelos;
import ec.edu.epn.Controladores.MenuPrincipalSistemaBibliotecaControlador;
import ec.edu.epn.Vistas.MenuPrincipalSistemaBibliotecaVista;

public class LogIn {

    private MenuPrincipalSistemaBiblioteca menuPrincipalSistemaBiblioteca;

    public LogIn(MenuPrincipalSistemaBiblioteca menuPrincipalSistemaBiblioteca) {
        this.menuPrincipalSistemaBiblioteca = menuPrincipalSistemaBiblioteca;
    }

    //TODO: Ingresar al sistema
    public void ingresarSistemaBiblioteca(){
        MenuPrincipalSistemaBibliotecaControlador.mostrarMenu();
    }

}
