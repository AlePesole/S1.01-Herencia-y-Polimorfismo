package ejercicio1n1;

public class WindInstrument extends Instrument {
    public WindInstrument(String name, double price) {
        super(name, price);
    }

    public void play() {
        System.out.println("A wind instrument is playing");
    }
}
