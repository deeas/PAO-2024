package collection.commons;

public class ComparableStudent extends Student implements Comparable<Student>{
    public ComparableStudent(String firstName, String lastName, long grade) {
        super(firstName, lastName, grade);
    }

    @Override
    public int compareTo(Student o) {

        if( this.getFirstName().equals(o.getFirstName())) {
            return this.getLastName().compareTo(o.getLastName());
        } else {
            return this.getFirstName().compareTo(o.getFirstName());
        }
    }
}
