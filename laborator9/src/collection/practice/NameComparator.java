package collection.practice;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getName() == null && o2.getName() == null) {
            return 0;
        } else if (o1.getName() == null) {
            return -1;
        } else if (o2.getName() == null) {
            return 1;
        }
        return o1.getName().compareTo(o2.getName());
    }
}
