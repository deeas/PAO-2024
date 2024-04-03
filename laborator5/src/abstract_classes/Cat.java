package abstract_classes;

public class Cat extends Animal {
    public Cat(int noOfLegs) {
        super(noOfLegs);
    }
    @Override
    public void makeNoise() {
        System.out.println("Miau!");
    }
}
