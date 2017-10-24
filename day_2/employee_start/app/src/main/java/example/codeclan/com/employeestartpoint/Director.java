package example.codeclan.com.employeestartpoint;

/**
 * Created by goober on 24/10/2017.
 */

public class Director extends Manager {

    private double budget;

    public Director(int id, String name, String socialSecurityNumber, double salary, String deptName) {
        super(id, name, socialSecurityNumber, salary, deptName);

    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}
