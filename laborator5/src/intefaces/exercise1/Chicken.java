package intefaces.exercise1;

public class Chicken implements Animal {
    int noOfLegs = 2;


    @Override
    public String getName() {
        return "chicken";
    }

    @Override
    public void eat() {
        System.out.println("I eat grains!");
    }
    @Override
    public void printNoOfLegs() {
        System.out.println("I have " + noOfLegs + " legs");
    }
}
