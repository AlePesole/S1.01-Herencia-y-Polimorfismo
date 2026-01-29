package ejercicio1n1;

public class PercussionInstrument extends Instrument {
    public PercussionInstrument(String name, double price) {
        super(name, price);
    }

    public void play() {
        System.out.println("A percussion instrument is playing");
    }
}
