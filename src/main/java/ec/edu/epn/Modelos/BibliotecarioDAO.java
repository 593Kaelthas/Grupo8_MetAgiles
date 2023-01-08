package ec.edu.epn.Modelos;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Map;

public class BibliotecarioDAO implements BibliotecarioDAOInterface {
    private static final String backup_bibliotecarios = "backup_bibliotecarios.json";
    private Gson gson;
    private Map<String, Bibliotecario> bibliotecarios;

    public BibliotecarioDAO(Gson gson, Map<String, Bibliotecario> bibliotecarios) {
        this.gson = gson;
        this.bibliotecarios = bibliotecarios;
        cargarBibliotecarios();
    }

    @Override
    public void crearBibliotecario(Bibliotecario bibliotecario) {
        bibliotecarios.put(bibliotecario.getIdUsuario(), bibliotecario);
        cargarBibliotecarios();
        guardarBibliotecarios();

    }

    @Override
    public Bibliotecario getBibliotecario(String idUsuario) {
        return null;
    }

    @Override
    public void actualizarBliotecario(Bibliotecario bibliotecario) {

    }

     private void cargarBibliotecarios(){
        try (FileReader reader = new FileReader(backup_bibliotecarios)) {
            Bibliotecario[]  BibliotecarioArray = gson.fromJson(reader, Bibliotecario[].class);
            if (BibliotecarioArray != null) {
                for (Bibliotecario bibliotecario : BibliotecarioArray){
                    bibliotecarios.put(bibliotecario.getIdUsuario(), bibliotecario);
                }
            }


        } catch (IOException e){
            e.printStackTrace();
        }
    }








    private void guardarBibliotecarios(){
        try (FileWriter writer = new FileWriter(backup_bibliotecarios)){
            String json = gson.toJson(bibliotecarios.values());
            writer.write(json);

            System.out.println("Se guardó exitosamente el Bibliotecario");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
