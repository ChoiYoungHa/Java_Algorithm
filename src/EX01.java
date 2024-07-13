class People{
    String name;
    int age;
}

class Employee extends People{
    int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

class Customer extends People{
    int customer_id;
}

public class EX01 {

    public static void main(String[] args) {
        Object [] p = {new Employee("사원1",22,3600), new Customer(), null};

        System.out.println(((People)p[0]).name);
    }

}
