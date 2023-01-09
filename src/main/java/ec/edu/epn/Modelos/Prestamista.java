package ec.edu.epn.Modelos;

import java.util.List;

public class Prestamista  extends Persona{
    private List <Libro> librosAdquiridos;
    private double multa;

    public Prestamista(String nombre, String apellido, String cedula, String telefono, String direccion, List<Libro> librosAdquiridos, double multa) {
        super(nombre, apellido, cedula, telefono, direccion);
        this.librosAdquiridos = librosAdquiridos;
        this.multa = multa;
    }

    public List<Libro> getLibrosAdquiridos() {
        return librosAdquiridos;
    }

    public void setLibrosAdquiridos(List<Libro> librosAdquiridos) {
        this.librosAdquiridos = librosAdquiridos;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa =multa;
}
}