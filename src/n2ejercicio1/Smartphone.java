package n2ejercicio1;

public class Smartphone extends phone implements Clock, Camera{
    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void picture() {
        System.out.println("Camera mode");
    }

    @Override
    public void alarm() {
        System.out.println("Alarm ring ring");
    }
}
