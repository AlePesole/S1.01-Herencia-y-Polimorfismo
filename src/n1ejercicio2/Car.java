package n1ejercicio2;

public class Car {
    static final String brand = "Audi";
    static String model = "A1";
    final int power;

    Car(int power) {
        this.power = power;
    }

    public static void brake() {
        System.out.println("EL vehículo está frenando");
    }

    public void accelerate() {
        System.out.println("EL vehículo está acelerando");
    }

    @Override
    public String toString() {
        return "Car{" + "brand=" + brand + ", model=" + model + ", power=" + power + '}';
    }
}
