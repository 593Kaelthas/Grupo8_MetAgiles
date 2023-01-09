package ec.edu.epn.Vistas;

import java.util.Scanner;

public class LibroDAOVista {
    private Scanner scanner = new Scanner(System.in);
    public String recibirISBN(){
        System.out.println("Ingresar el ISBN del libro para buscar");
        return scanner.nextLine();
    }
}
