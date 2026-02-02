package n3ejercicio1;

public class NoticiaFutbol extends Noticia{
    private String competicion;
    private String club;
    private String jugador;

    NoticiaFutbol(String titular, String competicion, String club, String jugador) {
        super(titular, 5, 300);
        this.competicion = competicion;
        this.club = club;
        this.jugador = jugador;
    }

    @Override
    public double calcularPrecioNoticia() {
        int bonus = 0;
        if(competicion.equalsIgnoreCase("La liga de campeones")) bonus += 100;
        if(club.equalsIgnoreCase("Barcelona") || club.equalsIgnoreCase("Madrid")) bonus += 100;
        if(jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) bonus += 50;
        return getPrecioBase() + bonus;
    }

    @Override
    public int calcularPuntuacionNoticia() {
        int bonus = 0;
        if(competicion.equalsIgnoreCase("La liga de campeones")) bonus += 3;
        if(competicion.equalsIgnoreCase("Liga")) bonus += 2;
        if(club.equalsIgnoreCase("Barcelona") || club.equalsIgnoreCase("Madrid")) bonus += 1;
        if(jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) bonus += 1;
        return getPuntuacionBase() + bonus;
    }

    @Override
    public String toString() {
        return getTitular() + " (" + competicion  + " | " + club + " | " + jugador + ")";
    }
}