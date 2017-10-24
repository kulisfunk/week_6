package example.codeclan.com.employeestartpoint;

/**
 * Created by goober on 24/10/2017.
 */

public class Engineer extends Employee{

    int id;
    String name;
    String ssn;
    double salary;

    public Engineer(int id, String name, String socialSecurityNumber, double salary) {
        super(id, name, socialSecurityNumber, salary);
        this.id = id;
        this.name = name;
        this.ssn = socialSecurityNumber;
        this.salary = salary;
    }
}
