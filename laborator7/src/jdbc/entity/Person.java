package jdbc.entity;

public class Person {
    private Integer id;

    private String name;

    private Double age;

    public Person(Integer id, String name, Double age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person(String name, Double age) {
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }
}
