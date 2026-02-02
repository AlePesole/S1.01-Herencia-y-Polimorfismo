package n3ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Redactor {
    private String nombre;
    private final String dni;
    private static double sueldo = 1500.00;
    private List<Noticia> noticias;


    public Redactor(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        noticias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public List<Noticia> getNoticias() {
        return List.copyOf(noticias);
    }

    public static void setSueldo(double sueldo) {
        Redactor.sueldo = sueldo;
    }

    public void añadirNoticia(Noticia noticia) {
        noticias.add(noticia);
    }

    public void eliminarNoticia(Noticia noticia) {
        noticias.remove(noticia);
    }

    @Override
    public String toString() {
        return "Redactor(" + nombre + ", " + dni + ", " + sueldo + "€)";
    }
}
