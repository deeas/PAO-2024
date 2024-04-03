package intefaces.exercise1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("I am a " + cat.getName());
        cat.eat();
        cat.printNoOfLegs();

        Chicken chicken = new Chicken();
        System.out.println("I am a " + chicken.getName());
        chicken.eat();
        chicken.printNoOfLegs();

        //static method from interface call
        Animal.makeNoise();
    }
}
