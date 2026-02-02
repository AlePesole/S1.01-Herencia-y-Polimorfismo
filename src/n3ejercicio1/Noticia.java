package n3ejercicio1;

public abstract class Noticia {
    private String titular;
    private String texto;
    private int puntuacionBase;
    private double precioBase;

    public Noticia(String titular, int puntuacionBase, double precioBase) {
        this.titular = titular;
        this.puntuacionBase = puntuacionBase;
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public int getPuntuacionBase() {
        return puntuacionBase;
    }

    public String getTitular() {
        return titular;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public abstract double calcularPrecioNoticia();

    public abstract int calcularPuntuacionNoticia();

    @Override
    public String toString() {
        return "○ " + titular + "\n" + texto;
    }
}
