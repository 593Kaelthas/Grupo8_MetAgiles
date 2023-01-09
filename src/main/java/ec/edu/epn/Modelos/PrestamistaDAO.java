package ec.edu.epn.Modelos;
import com.google.gson.Gson;
import ec.edu.epn.Controladores.MenuOpcionesControlador;
import ec.edu.epn.Controladores.MenuPrincipalSistemaBibliotecaControlador;
import ec.edu.epn.Vistas.MenuPrincipalSistemaBibliotecaVista;
import ec.edu.epn.Vistas.PrestamistaVista;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class PrestamistaDAO implements PrestamistaDAOInterface {
    private static final String backup_prestamistas = "src/main/java/ec/edu/epn/Files/backup_prestamistas.json";
    private Gson gson;
    private Map<String, Prestamista> prestamistas;

    public PrestamistaDAO(Gson gson, Map<String, Prestamista> prestamistas) {
        this.gson = gson;
        this.prestamistas = prestamistas;
        cargarPrestamistas();
    }

    @Override
    public void crearPrestamista(Prestamista prestamista) {
        prestamistas.put(prestamista.getCedula(), prestamista);
        cargarPrestamistas();
        guardarPrestamista();

    }

    @Override
    public void buscarPrestamista(String cedula) {

    }

    @Override
    public void actualizarPrestamista(Prestamista prestamista) {

    }

    @Override
    public void elimiarPrestamista(String cedula) {

    }
    private void cargarPrestamistas(){
        try (FileReader reader = new FileReader(backup_prestamistas)) {
            Prestamista[]  prestamistaArray = gson.fromJson(reader, Prestamista[].class);
            if (prestamistaArray != null) {
                for (Prestamista prestamista : prestamistaArray){
                    prestamistas.put(prestamista.getCedula(), prestamista);
                }
            }


        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private void guardarPrestamista(){
        try (FileWriter writer = new FileWriter(backup_prestamistas)){
            String json = gson.toJson(prestamistas.values());
            writer.write(json + "\t");
            System.out.println("-----Se guardó exitosamente el Prestamista-----" + "\n");

            MenuPrincipalSistemaBibliotecaControlador.mostrarMenu();

        } catch (IOException e) {
            e.printStackTrace();
}
}
}