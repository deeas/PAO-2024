package record;

public record Person(String name, int age) {

    public Person(int age) {
        this("Unknown", age);
    }
}
