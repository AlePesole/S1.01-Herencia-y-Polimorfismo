package n1ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Llamado a método estático
        Car.brake();

        //Inicialización de objeto y llamado a método no estático
        Car car1 = new Car(300);
        car1.accelerate();

        //Pruebas de modificación de valores, creación de 3 objetos
        Car car2 = new Car(500);
        Car car3 = new Car(150);
        System.out.println("\nValores iniciales:");
        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);
        System.out.println("Car 3: " + car3);

        //Prueba de modificación: static final brand
        System.out.println("\n•Cambio de valor static final brand");
        //Car.brand = "Toyota";  ERROR: no se puede modificar
        System.out.println("ERROR: no se puede modificar variable final");

        //Prueba de modificación: static model
        System.out.println("\n•Cambio de valor static model");
        Car.model = "A3";
        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);
        System.out.println("Car 3: " + car3);

        //Prueba de modificación: static final power
        System.out.println("\n•Cambio de valor static power");
        //car1.power = 200; ERROR: no se puede modificar
        System.out.println("ERROR: no se puede modificar variable final");

        //Explicación en el README.md
    }
}
