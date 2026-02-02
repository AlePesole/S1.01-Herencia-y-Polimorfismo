package n3ejercicio1;

public class NoticiaMoto extends Noticia{
    private String equipo;

    public NoticiaMoto(String titular, String equipo) {
        super(titular, 3, 100);
        this.equipo = equipo;
    }

    @Override
    public double calcularPrecioNoticia() {
        int bonus = 0;
        if(equipo.equalsIgnoreCase("Honda") || equipo.equalsIgnoreCase("Yamaha")) bonus += 75;
        return getPrecioBase() + bonus;
    }

    @Override
    public int calcularPuntuacionNoticia() {
        int bonus = 0;
        if(equipo.equalsIgnoreCase("Honda") || equipo.equalsIgnoreCase("Yamaha")) bonus += 3;
        return getPuntuacionBase() + bonus;
    }

    @Override
    public String toString() {
        return getTitular() + " (" + equipo + ")";
    }
}