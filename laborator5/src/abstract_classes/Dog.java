package abstract_classes;

public class Dog extends Animal {

    public Dog(int noOfLegs) {
        super(noOfLegs);
    }

    @Override
    public void makeNoise() {
        System.out.println("Ham!");
    }
}
