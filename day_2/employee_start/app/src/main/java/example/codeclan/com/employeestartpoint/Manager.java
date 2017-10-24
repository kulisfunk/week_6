package example.codeclan.com.employeestartpoint;

/**
 * Created by goober on 24/10/2017.
 */

public class Manager extends Employee{

    int id;
    String name;
    String ssn;
    double salary;
    String deptName;

    public Manager(int id, String name, String socialSecurityNumber, double salary, String deptName) {
        super(id, name, socialSecurityNumber, salary);
        this.id = id;
        this.name = name;
        this.ssn = socialSecurityNumber;
        this.salary = salary;
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
