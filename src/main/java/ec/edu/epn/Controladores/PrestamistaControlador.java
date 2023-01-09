package ec.edu.epn.Controladores;

import ec.edu.epn.Modelos.Prestamista;
import ec.edu.epn.Modelos.PrestamistaDAO;

public class PrestamistaControlador {
    private Prestamista prestamista;
    private PrestamistaDAO prestamistaDAO;

    public PrestamistaControlador(Prestamista prestamista, PrestamistaDAO prestamistaDAO) {
        this.prestamista = prestamista;
        this.prestamistaDAO = prestamistaDAO;
    }
    public void setNombrePrestamista(String nombre){
        prestamista.setNombre(nombre);
    }
    public void setApellidoPrestamista(String apellido){
        prestamista.setApellido(apellido);
    }
    public void setCedulaPrestamista(String cedula){
        prestamista.setCedula(cedula);
    }
    public void setDireccionPrestamista(String direccion){
        prestamista.setDireccion(direccion);
    }
    public void setTelefonoPrestamista(String telefono){
        prestamista.setTelefono(telefono);
    }
    public void setMultaPrestamista(double multa){
        prestamista.setMulta(multa);
    }

    public Prestamista getPrestamista() {
        return prestamista;
    }

    public PrestamistaDAO getPrestamistaDAO() {
        return prestamistaDAO;
    }
}