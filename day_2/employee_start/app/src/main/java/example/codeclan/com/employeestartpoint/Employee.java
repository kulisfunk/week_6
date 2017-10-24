package example.codeclan.com.employeestartpoint;

/**
 * Created by user on 28/08/2017.
 */

public class Employee {
    private int id;
    private String name;
    private String socialSecurityNumber;
    private double salary;

    public Employee(int id, String name, String socialSecurityNumber, double salary) {

        this.id = id;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    public double getSalary() {
        return salary;
    }

//    public String getSocialSecurityNumber() {
//        return socialSecurityNumber;
//    }

    public void raiseSalary(double salaryRaise){
        if (salaryRaise >= 0) {
            this.salary += salaryRaise;
        }
    }
}
