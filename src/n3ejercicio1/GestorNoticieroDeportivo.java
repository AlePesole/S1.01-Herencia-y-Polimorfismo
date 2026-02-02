package n3ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class GestorNoticieroDeportivo {
    private List<Redactor> redactores;

    public GestorNoticieroDeportivo() {
        redactores = new ArrayList<>();
    }

    private Redactor obtenerRedactor(String dni) {
        for (Redactor redactor : redactores) {
            if (redactor.getDni().equals(dni)) {
                return redactor;
            }
        }
        return null;
    }

    public boolean existenciaRedactor(String dni) {
        for (Redactor redactor : redactores) {
            if (redactor.getDni().equals(dni)) {
                return true;
            }
        }
        return false;
    }

    /** Añade solo solo si no existe un redactor con el mismo dni, retorna 'true' si añadió al redactor, si no 'false' */
    public boolean introducirRedactor(Redactor redactor) {
        if(obtenerRedactor(redactor.getDni()) == null) {
            redactores.add(redactor);
            return true;
        }
        return false;
    }

    /** Retorna 'true' si eliminó una noticia, si no 'false' */
    public boolean eliminarRedactor(String dni) {
        Redactor redactor = obtenerRedactor(dni);
        if (redactor != null) {
            redactores.remove(redactor);
            return true;
        }
        return false;
    }

    /** retorna true si añadió la noticia, si no 'false' */
    public boolean introducirNoticia(String dni, Noticia noticia) {
        Redactor redactor = obtenerRedactor(dni);
        if(redactor != null && noticia != null) {
            redactor.añadirNoticia(noticia);
            return true;
        }
        return false;
    }

    /** retorna true si modificó el texto a la noticia, si no 'false' */
    public boolean modificarTextoNoticia(String dni, String titular, String texto) {
        Redactor redactor = obtenerRedactor(dni);
        if(redactor != null) {
            for(var noticia : redactor.getNoticias()) {
                if(noticia.getTitular().equalsIgnoreCase(titular)) {
                    noticia.setTexto(texto);
                    return true;
                }
            }
        }
        return false;
    }

    /** Retorna 'true' si borro la noticia, si no 'false'*/
    public boolean eliminarNoticia(String dni, String titular) {
        Redactor redactor = obtenerRedactor(dni);
        if(redactor != null) {
            for(var noticia : redactor.getNoticias()) {
                if(noticia.getTitular().equalsIgnoreCase(titular)) {
                    redactor.eliminarNoticia(noticia);
                    return true;
                }
            }
        }
        return false;
    }

    /** Retorna 'false' si no encontró ningún redactor por el dni */
    public boolean mostrarNoticiasRedactor(String dni) { //
        Redactor redactor = obtenerRedactor(dni);
        if(redactor != null) {
            System.out.println("Redactor: " + redactor.getNombre());
            System.out.println("--------Noticias--------");
            for (var noticia : redactor.getNoticias()) {
                System.out.println("○ " + noticia);
                System.out.println("\"" + noticia.getTexto() + "\"");
            }
            return true;
        }
        return false;
    }

    /** Retorna -1 si no encontró ninguna noticia con el titular */
    public int calcularPuntuacionNoticia(String dni, String titular) {
        Redactor redactor = obtenerRedactor(dni);
        if(redactor != null) {
            for(var noticia : redactor.getNoticias()) {
                if(noticia.getTitular().equalsIgnoreCase(titular)) {
                    return noticia.calcularPuntuacionNoticia();
                }
            }
        }
        return -1;
    }

    /** Retorna -1 si no encontró ninguna noticia con el titular */
    public double calcularPrecioNoticia(String dni, String titular) {
        Redactor redactor = obtenerRedactor(dni);
        if(redactor != null) {
            for(var noticia : redactor.getNoticias()) {
                if(noticia.getTitular().equalsIgnoreCase(titular)) {
                    return noticia.calcularPrecioNoticia();
                }
            }
        }
        return -1;
    }

    public void listaRedactores() {
        for(var redactor : redactores) {
            System.out.println(">>"+ redactor);
            System.out.println("  Titulares:");
            for(var noticia : redactor.getNoticias()) {
                System.out.println("    ○ " + noticia);
            }
        }
    }
}
