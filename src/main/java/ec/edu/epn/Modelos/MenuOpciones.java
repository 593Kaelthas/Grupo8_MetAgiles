package ec.edu.epn.Modelos;

import java.util.ArrayList;
import java.util.List;

public class MenuOpciones {
    private List <String> opciones;

    public MenuOpciones() {
        opciones = new ArrayList<>();
        opciones.add("Registrar Bibliotecario");
        opciones.add("Ingresar al Sistema");
        opciones.add("Salir");

    }

    public List<String> getOpciones(){
        return opciones;
    }
}
