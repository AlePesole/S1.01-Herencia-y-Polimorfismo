package n3ejercicio1;

public class NoticiaBaloncesto extends Noticia{
    private String competicion;
    private String club;

    NoticiaBaloncesto(String titular, String competicion, String club) {
        super(titular,4, 250);
        this.competicion = competicion;
        this.club = club;
    }

    @Override
    public double calcularPrecioNoticia() {
        int bonus = 0;
        if(competicion.equalsIgnoreCase("Euroliga")) bonus += 75;
        if(club.equalsIgnoreCase("Barcelona") || club.equalsIgnoreCase("Madrid")) bonus += 75;
        return getPrecioBase() + bonus;
    }

    @Override
    public int calcularPuntuacionNoticia() {
        int bonus = 0;
        if(competicion.equalsIgnoreCase("Euroliga")) bonus += 3;
        if(competicion.equalsIgnoreCase("ACB")) bonus += 2;
        if(club.equalsIgnoreCase("Barcelona") || club.equalsIgnoreCase("Madrid")) bonus += 1;
        return getPuntuacionBase() + bonus;
    }

    @Override
    public String toString() {
        return getTitular() + " (" + competicion  + " | " + club + ")";
    }
}
