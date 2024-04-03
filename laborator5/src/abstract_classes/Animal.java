package abstract_classes;

public abstract class Animal {

    private int noOfLegs;

    public  static final String CONSTANT = "CONSTANT";

    public Animal(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public abstract void makeNoise();

    public void printNoOfLegs() {
        System.out.println("I have " + noOfLegs + " legs");
    }
}
