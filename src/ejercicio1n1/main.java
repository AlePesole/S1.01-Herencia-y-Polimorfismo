package ejercicio1n1;

public class main {
    public static void main(String[] args) {
        PercussionInstrument instrument1 = new PercussionInstrument(
                "Conga drums", 279.00);
        StringInstrument instrument2 = new StringInstrument(
                "Guitar", 215.00);
        WindInstrument instrument3 = new WindInstrument(
                "Flute",
                125.00);

        System.out.println(instrument1);
        instrument1.play();
        System.out.println("\n" + String.valueOf(instrument2));
        instrument2.play();
        System.out.println("\n" + String.valueOf(instrument3));
        instrument3.play();
    }
}
