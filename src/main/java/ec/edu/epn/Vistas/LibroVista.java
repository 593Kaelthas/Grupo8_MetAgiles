package ec.edu.epn.Vistas;

import ec.edu.epn.Controladores.LibroControlador;
import ec.edu.epn.Controladores.RegexControlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibroVista {
    private LibroControlador libroControlador;
    private RegexControlador regexControlador;
    private Scanner scanner;
    private List<String> opciones;

    public LibroVista(LibroControlador libroControlador, Scanner scanner) {
        this.libroControlador = libroControlador;
        this.regexControlador = new RegexControlador();
        this.scanner = scanner;
    }

    //Sub-menú
    public void menuLibro(){
        opciones = new ArrayList<>();
        opciones.add("Registrar libro");
        opciones.add("Buscar libro");
        opciones.add("Eliminar libro");
        opciones.add("Actualizar libro");
        opciones.add("Regresar");
        System.out.println("-----SISTEMA Libro-----");
        for (int i=0; i < opciones.size(); i++){
            System.out.println(i + 1 + "."+ opciones.get(i));
        }
        System.out.println("Seleccione una opción:");
    }
    public static int getOpcionSeleccionada(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    //Formulario de registro
    public void mostrarFormularioEInstanciarLibro(){
        System.out.println("----Llene los siguientes campos para el registro del Libro-----");

        System.out.println("Título:");
        String titulo = scanner.nextLine();
        while(!regexControlador.usarValidarTituloLibro(titulo)){
            System.out.println("Error al ingresar el título");
            System.out.println("Ingrese nuevamente el título");
            titulo = scanner.nextLine();
        }
        libroControlador.setTituloLibro(titulo);

        System.out.println("Autor:");
        String autor = scanner.nextLine();
        while(!regexControlador.usarValidarAutorLibro(autor)){
            System.out.println("Error al ingresar el autor");
            System.out.println("Ingrese nuevamente el autor");
            autor = scanner.nextLine();
        }
        libroControlador.setAutorLibro(autor);

        System.out.println("Género:");
        String genero = scanner.nextLine();
        while(!regexControlador.usarValidarGeneroLibro(genero)){
            System.out.println("Error al ingresar el Género");
            System.out.println("Ingrese nuevamente el Género");
            genero = scanner.nextLine();
        }
        libroControlador.setGeneroLibro(genero);

        System.out.println("Año publicación:");
        String anoPublicacion = scanner.nextLine();
        while(!regexControlador.usarValidarAnoPublicacionLibro(anoPublicacion)){
            System.out.println("Error al ingresar el Año publicación");
            System.out.println("Ingrese nuevamente el Año publicación");
            anoPublicacion = scanner.nextLine();
        }
        libroControlador.setAnoPublicacionLibro(anoPublicacion);

        System.out.println("ISBN:");
        String isbn = scanner.nextLine();
        while(!regexControlador.usarValidarIsbnLibro(isbn)){
            System.out.println("Error al ingresar el ISBN");
            System.out.println("Ingrese nuevamente el ISBN");
            isbn = scanner.nextLine();
        }
        libroControlador.setIsbnLibro(isbn);

        System.out.println("Stock:");
        int stock = Integer.parseInt(scanner.nextLine());
        while(!regexControlador.usarValidarStockLibro(stock)){
            System.out.println("Error al ingresar el Stock");
            System.out.println("Ingrese nuevamente el Stock");
            stock = Integer.parseInt(scanner.nextLine());
        }
        libroControlador.setStockLibro(stock);

    }
}
