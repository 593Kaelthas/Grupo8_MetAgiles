package ec.edu.epn.Controladores;

import ec.edu.epn.Modelos.Bibliotecario;
import ec.edu.epn.Modelos.BibliotecarioDAO;
import ec.edu.epn.Modelos.LogIn;

public class LogInControlador {

    private BibliotecarioDAO bibliotecarioDAO;

    public LogInControlador(BibliotecarioDAO bibliotecarioDAO) {
        this.bibliotecarioDAO = bibliotecarioDAO;
    }

    public void manejarSolicitudLogIn(String idUsuario, String password){
        Bibliotecario bibliotecario = bibliotecarioDAO.getBibliotecario(idUsuario);
        if (bibliotecario == null) {
            System.out.println("---No exite tal ID Usuario registrado---");
            //TODO: Presentar nuevamente el menu de login
        } else {
            if (!bibliotecario.getPassword().equals(password)){
                System.out.println("---Contraseña Incorrecta---");
                //TODO: Presentar nuevamente el menu de login
            } else {
                //LogIn logIn = new
                //TODO: Despliega el menu principal
            }
        }

    }
}
