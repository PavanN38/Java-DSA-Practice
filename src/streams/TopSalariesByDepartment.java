package streams;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopSalariesByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", 70000),
            new Employee("Bob", "HR", 80000),
            new Employee("Charlie", "HR", 60000),
            new Employee("David", "HR", 75000),
            new Employee("Eve", "IT", 120000),
            new Employee("Frank", "IT", 110000),
            new Employee("Grace", "IT", 100000),
            new Employee("Heidi", "IT", 105000),
            new Employee("Ivan", "Finance", 90000),
            new Employee("Judy", "Finance", 85000)
        );

        Map<String, List<Employee>> top3ByDept = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.collectingAndThen(
                    Collectors.toList(),
                    list -> list.stream()
                        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                        .limit(3)
                        .collect(Collectors.toList())
                )
            ));

        top3ByDept.forEach((dept, topEmployees) -> {
            System.out.println("Department: " + dept);
            topEmployees.forEach(System.out::println);
            System.out.println();
        });
    }
    
   
}

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }
}

