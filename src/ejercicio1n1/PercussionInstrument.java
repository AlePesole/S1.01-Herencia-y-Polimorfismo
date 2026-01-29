package ejercicio1n1;

public class PercussionInstrument extends Instrument {
    static {
        System.out.println("Carga por llamado a método estático");
    }

    public PercussionInstrument(String name, double price) {
        super(name, price);
    }

    public void play() {
        System.out.println("A percussion instrument is playing");
    }

    public static void staticMethod() {
        System.out.println("Método estático ejecutado");
    }
}
