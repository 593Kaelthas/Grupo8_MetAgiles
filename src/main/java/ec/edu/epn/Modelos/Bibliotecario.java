package ec.edu.epn.Modelos;

public class Bibliotecario extends Persona {
    private String idUsuario, password;

    public Bibliotecario(String nombre, String apellido, String cedula, String telefono, String direccion, String idUsuario, String password) {
        super(nombre, apellido, cedula, telefono, direccion);

        this.idUsuario = idUsuario;
        this.password = password;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
