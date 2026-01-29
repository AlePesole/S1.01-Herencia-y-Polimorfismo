package ejercicio1n1;

public class StringInstrument extends Instrument {
    public StringInstrument(String name, double price) {
        super(name, price);
    }

    public void play() {
        System.out.println("A string instrument is playing");
    }

    static {
        System.out.println("La clase EjemploCarga ha sido cargada2");
    }
}
