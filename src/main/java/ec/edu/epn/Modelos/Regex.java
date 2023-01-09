package ec.edu.epn.Modelos;

public class Regex {
    public boolean validarNombre(String nombre) {
        return nombre.matches("[A-ZÄËÏÖÜÁÉÍÓÚÂÊÎÔÛÀÈÌÒÙ][a-zäÄëËïÏöÖüÜáéíóúáéíóúÁÉÍÓÚÂÊÎÔÛâêîôûàèìòùÀÈÌÒÙ]+(\\s)*[a-zäÄëËïÏöÖüÜáéíóúáéíóúÁÉÍÓÚÂÊÎÔÛâêîôûàèìòùÀÈÌÒÙ]+");
    }

    public boolean validarApellido(String apellido) {
        return apellido.matches("[A-ZÄËÏÖÜÁÉÍÓÚÂÊÎÔÛÀÈÌÒÙ][a-zäÄëËïÏöÖüÜáéíóúáéíóúÁÉÍÓÚÂÊÎÔÛâêîôûàèìòùÀÈÌÒÙ]+(\\s)*[a-zäÄëËïÏöÖüÜáéíóúáéíóúÁÉÍÓÚÂÊÎÔÛâêîôûàèìòùÀÈÌÒÙ]+");
    }

    public boolean validarCedula(String cedula) {
        boolean cedulaCorrecta = false;

        try {

            if (cedula.length() == 10) // ConstantesApp.LongitudCedula
            {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
                    // Coeficientes de validación cédula
                    // El decimo digito se lo considera dígito verificador
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            cedulaCorrecta = false;
        }
        return cedulaCorrecta;
    }
    public boolean validarTelefono(String telefono) {
        return telefono.matches("^09\\d{8}$");
    }

    public boolean validarDireccion(String direccion) {
        return direccion.matches("[a-zA-Z1-9À-ÖØ-öø-ÿ]+\\.?(( |\\-)[a-zA-Z1-9À-ÖØ-öø-]+\\.?)*");
    }

    public boolean validarIdUsuario(String idUsuario){
        return idUsuario.matches("[a-zA-Z]((\\.|_|-)?[a-zA-Z0-9]+){3}");
    }

    /*
    Min lengh 8
    Max lengh 16
    Min: una mayúscula, minúscula, caracter especial y número
     */
    public boolean validarPassword(String password){
        return password.matches("^(?=.*\\d)(?=.*[\\u0021-\\u002b\\u003c-\\u0040])(?=.*[A-Z])(?=.*[a-z])\\S{8,16}$");
    }

    public boolean validarTituloLibro(String titulo) {
        return titulo.matches("^[a-zA-Z\\u00C0-\\u017F\\s]+$");
    }

    public boolean validarAutorLibro(String autor) {
        return autor.matches("^[a-zA-Z\\u00C0-\\u017F\\s]+$");
    }

    public boolean validarGeneroLibro(String genero) {
        return genero.matches("^[a-zA-Z\\u00C0-\\u017F\\s]+$");
    }

    public boolean validarAnoPunlicacionLibro(String anoPublicacion) {
        return anoPublicacion.matches("^(1|2)\\d{3}$");
    }

    /*
    Ejemplos de ISBN
    ISBN 978-0-596-52068-7
    ISBN-13: 978-0-596-52068-7
    978 0 596 52068 7
    9780596520687
    ISBN-10 0-596-52068-9
    0-596-52068-9
   */
    public boolean validarIsbnLibro(String isbn) {
        return isbn.matches("^(?:ISBN(?:-1[03])?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$|97[89][0-9]{10}$|(?=(?:[0-9]+[- ]){4})[- 0-9]{17}$)(?:97[89][- ]?)?[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$");
    }

    public boolean validarStockLibro(int stock) {
        return stock > 0;

    }
}
