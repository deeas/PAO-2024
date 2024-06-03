package collection.practice;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Se citeste de la tastatura o lista de n Employee(name, salary),
 * si modul de sortare (byName, bySalary)
 *
 * Sa se sorteze in functie de acest lucru si sa se afiseze colectia sortata
 */
public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n: ");
        int n = scanner.nextInt();
        System.out.println("Sort type");
        String sortType = scanner.next();
        Set<Employee> employees;

        if (sortType.equals("bySalary")) {
            employees = new TreeSet<>(new SalaryComparator());
        } else if (sortType.equals("byName")) {
            employees = new TreeSet<>(new NameComparator());
        } else {
            throw new RuntimeException();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Name: ");
            String name = scanner.next();
            System.out.println("Salary: ");
            int salary = scanner.nextInt();
            Employee employee = new Employee(name, salary);
            employees.add(employee);
        }

        System.out.println(employees);

    }
}
