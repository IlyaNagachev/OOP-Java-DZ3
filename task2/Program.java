package task2;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Employee[] employees = EmployeeFabric.generateEmployees(15, Freelancer.class);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println();
        System.out.println("***");
        System.out.println("Сортировка по возрасту:");

        Arrays.sort(employees, new AgeComparator());  //Сортировка по возрасту

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println();
        System.out.println("***");
        System.out.println("Сортировка по зарплате:");

        Arrays.sort(employees, new SalaryComparator());  // Сортировка по зарплате

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}