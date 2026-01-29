package n2ejercicio1;

public class Main {
    public static void main(String[] args) {
        Smartphone myphone = new Smartphone("Iphone", "17");
        System.out.println(myphone);
        myphone.call(758648930);
        myphone.picture();
        myphone.alarm();
    }
}
