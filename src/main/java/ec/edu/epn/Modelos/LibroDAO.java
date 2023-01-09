package ec.edu.epn.Modelos;

import com.google.gson.Gson;
import ec.edu.epn.Controladores.MenuOpcionesControlador;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class LibroDAO implements LibroDAOInterface {
    private static final String backup_libros = "src/main/java/ec/edu/epn/Files/backup_libros.json";
    private Gson gson;
    private Map<String, Libro> libros;

    public LibroDAO(Gson gson, Map<String, Libro> libros) {
        this.gson = gson;
        this.libros = libros;
    }

    private void guardarLibros(){
        try (FileWriter writer = new FileWriter(backup_libros)){
            String json = gson.toJson(libros.values());
            writer.write(json + "\t");
            System.out.println("-----Se guardó exitosamente el Libro-----" + "\n");
            MenuOpcionesControlador.mostrarMenu();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void cargarLibros() {
        try (FileReader reader = new FileReader(backup_libros)) {
            Libro[] LibroArray = gson.fromJson(reader, Libro[].class);
            if (LibroArray != null) {
                for (Libro libro : LibroArray) {
                    libros.put(libro.getIsbn(), libro);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void crearLibro(Libro libro) {
        libros.put(libro.getIsbn(), libro);
        cargarLibros();
        guardarLibros();
    }

    @Override
    public Libro buscarLibro(String isbn) {
        //TODO: Buscar el libro en el archivo JSON
        Libro libro = libros.get(isbn);
        return libro;
    }

    @Override
    public void actualizarLibro(Libro libro) {
    }

    @Override
    public void eliminarLibro(String isbn) {
        Libro libro = buscarLibro(isbn);
        libros.remove(isbn, libro);
    }
}
