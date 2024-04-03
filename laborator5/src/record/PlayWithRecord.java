package record;

public class PlayWithRecord {
    public static void main(String[] args) {
        Person person1 = new Person("Adrian", 10);
        System.out.println(person1.toString());

        Person person2 = new Person("Marius", 10);
        System.out.println("person1 equals pers2? " + person1.equals(person2));

        Person person3 = person1;
        System.out.println("pers 1 equals pers3? " + person1.equals(person3));

        String nameOfPerson1 = person1.name();
        int ageOfPerson1 =person1.age();

        Person person4 = new Person(6);
        System.out.println(person4);

    }
}
