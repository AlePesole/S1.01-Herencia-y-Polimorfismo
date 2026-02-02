package n3ejercicio1;

public class NoticiaF1 extends Noticia{
    private String escuderia;

    NoticiaF1(String titular, String escuderia) {
        super(titular, 4, 100);
        this.escuderia = escuderia;
    }

    @Override
    public double calcularPrecioNoticia() {
        int bonus = 0;
        if(escuderia.equalsIgnoreCase("Mercedes") || escuderia.equalsIgnoreCase("Ferrari")) bonus += 50;
        return getPrecioBase() + bonus;
    }

    @Override
    public int calcularPuntuacionNoticia() {
        int bonus = 0;
        if(escuderia.equalsIgnoreCase("Mercedes") || escuderia.equalsIgnoreCase("Ferrari")) bonus += 2;
        return getPuntuacionBase() + bonus;
    }

    @Override
    public String toString() {
        return getTitular() + " ("+ escuderia + ")";
    }
}
