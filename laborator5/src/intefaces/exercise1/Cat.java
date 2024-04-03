package intefaces.exercise1;

public class Cat implements Animal {
    @Override
    public String getName() {
        return "cat";
    }

    @Override
    public void eat() {
        System.out.println("I eat mice!");
    }
}
