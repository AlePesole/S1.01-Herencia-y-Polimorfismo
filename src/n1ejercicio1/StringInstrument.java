package n1ejercicio1;

public class StringInstrument extends Instrument {
    {
        System.out.println("Carga por inicialización");
    }

    public StringInstrument(String name, double price) {
        super(name, price);
    }

    public void play() {
        System.out.println("A string instrument is playing");
    }
}
