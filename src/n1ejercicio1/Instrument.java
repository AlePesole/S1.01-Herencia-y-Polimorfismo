package n1ejercicio1;

public abstract class Instrument {
    private String name;
    private double price;

    public Instrument(String name, double price) {
        this.name = verifyName(name);
        this.price = verifyPrice(price);
    }

    public abstract void play();

    public String toString() {
        return "Instrument{" + this.name + ", "+ this.price + "$}";
    }

    public static void staticPlay() {
        System.out.println("Instrument playing");
    }

    public static double verifyPrice(double price) {
        if (price <= (double)0.0F) {
            throw new IllegalArgumentException("Error: Price has to be positive");
        } else {
            return price;
        }
    }

    public static String verifyName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Error: Name must not be null");
        } else {
            return name;
        }
    }
}
