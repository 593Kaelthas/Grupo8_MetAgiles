package ec.edu.epn.Controladores;

import ec.edu.epn.Modelos.Regex;

public class RegexControlador {
    private Regex regex;

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
}
