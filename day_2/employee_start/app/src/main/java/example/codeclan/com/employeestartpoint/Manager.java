package example.codeclan.com.employeestartpoint;

/**
 * Created by goober on 24/10/2017.
 */

public class Manager extends Employee{

//     not needed as we defined them in Employee
    private String deptName; //set to private

    public Manager(int id, String name, String socialSecurityNumber, double salary, String deptName) {
        super(id, name, socialSecurityNumber, salary);
//        this.id = id;
//        this.name = name;
//        this.ssn = socialSecurityNumber;
//        this.salary = salary; not needed as Employee has declared
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
