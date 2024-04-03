package abstract_classes;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(4);
        cat.makeNoise();
        cat.printNoOfLegs();

        Dog dog = new Dog(4);
        dog.makeNoise();
        dog.printNoOfLegs();
    }

}
