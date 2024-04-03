package imutability;

public final class ImmutableStudent {

    private final int id;
    private final String name;

    private final Age age;


    public ImmutableStudent(int id, String name, Age age) {
        this.id = id;
        this.name = name;
        Age cloneAge = new Age();
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        this.age = cloneAge;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        Age cloneAge = new Age();
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        return cloneAge;
    }

    public int getId() {
        return id;
    }
}
