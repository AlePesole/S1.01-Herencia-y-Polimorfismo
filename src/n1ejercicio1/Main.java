package n1ejercicio1;

public class Main {
    public static void main(String[] args) {

        PercussionInstrument.staticMethod();

        PercussionInstrument instrument1 = new PercussionInstrument(
                "Conga drums", 279.00);
        System.out.println(instrument1);
        instrument1.play();
        System.out.println();

        StringInstrument instrument2 = new StringInstrument(
                "Guitar", 215.00);
        System.out.println(instrument2);
        instrument2.play();

        WindInstrument instrument3 = new WindInstrument(
                "Flute",
                125.00);
        System.out.println("\n" + instrument3);
        instrument3.play();
    }
}
