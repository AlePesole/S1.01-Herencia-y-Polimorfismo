package n2ejercicio1;

public class phone {
    private String brand;
    private String model;

    phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void call(int number) {
        System.out.println("Calling " + number);
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }
}
