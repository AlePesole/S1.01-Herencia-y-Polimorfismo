package n3ejercicio1;

public class NoticiaTenis extends Noticia{
    private String competicion;
    private String tenista;

    NoticiaTenis(String titular, String competicion, String tenista) {
        super(titular, 4, 150);
        this.competicion = competicion;
        this.tenista = tenista;
    }

    @Override
    public double calcularPrecioNoticia() {
        int bonus = 0;
        if(tenista.equalsIgnoreCase("Federer") || tenista.equalsIgnoreCase("Nadal") ||
                tenista.equalsIgnoreCase("Djokovic")) bonus += 100;
        return getPrecioBase() + bonus;
    }

    @Override
    public int calcularPuntuacionNoticia() {
        int bonus = 0;
        if(tenista.equalsIgnoreCase("Federer") || tenista.equalsIgnoreCase("Nadal") ||
                tenista.equalsIgnoreCase("Djokovic")) bonus += 3;
        return getPuntuacionBase() + bonus;
    }

    @Override
    public String toString() {
        return getTitular() + " (" + competicion  + " | " + tenista + ")";
    }
}
