package ec.edu.epn.Controladores;

import ec.edu.epn.Modelos.Regex;

public class RegexControlador {
    private Regex regex;

    public RegexControlador() {
        this.regex = new Regex();
    }

    public boolean usarValidarNombre(String nombre){
        return regex.validarNombre(nombre);
    }

    public boolean usarValidarApellido(String apellido){
        return regex.validarApellido(apellido);
    }

    public boolean usarValidarCedula(String cedula ){
        return regex.validarCedula(cedula);
    }

    public boolean usarValidarTelefono(String telefono){
        return regex.validarTelefono(telefono);
    }

    public boolean usarValidarDireccion(String direccion){
        return regex.validarDireccion(direccion);
    }

    public boolean usarValidarIdUsuario(String idUsuario){
        return regex.validarIdUsuario(idUsuario);
    }

    public boolean usarValidarPassword(String password){
        return regex.validarPassword(password);
    }
    public boolean usarValidarTituloLibro(String titulo){
        return regex.validarTituloLibro(titulo);
    }
    public boolean usarValidarAutorLibro(String autor){
        return regex.validarAutorLibro(autor);
    }
    public boolean usarValidarGeneroLibro(String genero){
        return regex.validarGeneroLibro(genero);
    }
    public boolean usarValidarAnoPublicacionLibro(String anoPublicacion){
        return regex.validarAnoPunlicacionLibro(anoPublicacion);
    }
    public boolean usarValidarIsbnLibro(String isbn){
        return regex.validarIsbnLibro(isbn);
    }
    public boolean usarValidarStockLibro(int stock){
        return regex.validarStockLibro(stock);
    }
}
