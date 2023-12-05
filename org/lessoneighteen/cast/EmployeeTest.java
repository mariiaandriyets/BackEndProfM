package com.proftelran.org.lessoneighteen.cast;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Alex", "developer", 1500),
                        new Employee("Thomas", "manager", 680.50),
                        new Employee("Thea", "CEO", 5000),
                        new Employee("Mary", "manager", 700),
                        new Employee("Ken", "developer", 900));
        /*
        1) get a list of employees with salary > 1000
        2) get an employee with the lowest salary
        3) get a list of managerial roles colleagues and increase their salaries bt 15% (homework)
        4) calculate an average salary of employees
        5) get a list of employees who are developers
         */
        List<Employee> collect = employeeList.stream()
                .filter(x -> x.getSalary() > 1000)
                .collect(Collectors.toList());
        System.out.println(collect);

        Optional<Employee> min = employeeList.stream().min(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(min.get());

    }
}
