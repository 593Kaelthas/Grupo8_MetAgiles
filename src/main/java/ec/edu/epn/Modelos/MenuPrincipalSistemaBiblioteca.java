package ec.edu.epn.Modelos;

import java.util.ArrayList;
import java.util.List;

public class MenuPrincipalSistemaBiblioteca {
    private List<String> opciones;
    public MenuPrincipalSistemaBiblioteca() {
        opciones = new ArrayList<>();
        opciones.add("Usuarios Prestamistas");
        opciones.add("Libros");
        opciones.add("Multas");
        opciones.add("Préstamos");
        opciones.add("Salir del Sistema");
    }

    public List<String> getOpciones() {
        return opciones;
    }
}
