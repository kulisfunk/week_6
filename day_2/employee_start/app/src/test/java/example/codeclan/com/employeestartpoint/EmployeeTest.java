package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;
import static org.junit.Assert.*;

/**
 * Created by sandy on 13/10/2017.
 */

public class EmployeeTest {
    Employee employee;
    Manager manager;
    Engineer engineer;
    Admin admin;
    Director director;

    @Before
    public void before() {

        employee = new Employee(1, "Martin", "011904A", 30000.00 );
        manager = new Manager(1, "Martin", "011904A", 50000.00, "KPI Test" );
        engineer = new Engineer(1, "Martin", "011904A", 40000.00 );
        admin = new Admin(1, "Martin", "011904A", 20000.00 );
        director = new Director(1, "Martin", "011904A", 90000.00, "Engineering Wing" );

    }

//    @Test
//    public void newEmployeeIdIsZero() {
//        assertEquals(0, employee.getId());
//    }

//    @Test
//    public void newEmployeeNameIsNull() {
//        assertNull(employee.getName());
//    }

//    @Test
//    public void newEmployeeSSnIsNull() {
//        assertNull(employee.getSocialSecurityNumber());
//    }

//    @Test
//    public void newEmployeeSalaryIsNull() {
//        assertEquals(0, employee.getSalary(), 0.01);
//    }

//    @Test
//    public void canSetEmployeeId() {
//        employee.setId(1);
//        assertEquals(1, employee.getId());
//    }

    @Test
    public void canSetEmployeeName() {
        employee.setName("Wilma");
        assertEquals("Wilma", employee.getName());
    }

    @Test
    public void canSetManagerName() {
        manager.setName("Fred");
        assertEquals("Fred", manager.getName());
    }

    @Test
    public void notNullSetManagerName() {
        manager.setName("");
        assertEquals("Martin", manager.getName());
    }

    @Test
    public void canSetEngineerName() {
        engineer.setName("Betty");
        assertEquals("Betty", engineer.getName());
    }

    @Test
    public void canSetAdminName() {
        admin.setName("Barney");
        assertEquals("Barney", admin.getName());
    }

    @Test
    public void canSetDirectorName() {
        director.setName("Mr Boss");
        assertEquals("Mr Boss", director.getName());
    }

    @Test
    public void canSetDirectorBudget() {
        director.setBudget(10000000.00);
        assertEquals(10000000.00, director.getBudget(), 0.01);
    }


//    @Test
//    public void canSetEmployeeSsn() {
//        employee.setSocialSecurityNumber("AB123456C");
//        assertEquals("AB123456C", employee.getSocialSecurityNumber());
//    }

//    @Test
//    public void canSetEmployeeSalary() {
//        employee.setSalary(30000.00);
//        assertEquals(30000.00, employee.getSalary(), 0.01);
//    }

    @Test
    public void canRaiseEmployeeSalary() {
        employee.raiseSalary(5000.00);
        assertEquals(35000.00, employee.getSalary(), 0.01);
    }

    @Test
    public void canRaiseManagerSalary() {
        manager.raiseSalary(5000.00);
        assertEquals(55000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseEngineerSalary() {
        engineer.raiseSalary(5000.00);
        assertEquals(45000.00, engineer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseAdminSalary() {
        admin.raiseSalary(5000.00);
        assertEquals(25000.00, admin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseDirectorSalary() {
        director.raiseSalary(5000.00);
        assertEquals(95000.00, director.getSalary(), 0.01);
    }

    @Test
    public void noNegativeDirectorSalary() {
        director.raiseSalary(-5000.00);
        assertEquals(90000.00, director.getSalary(), 0.01);
    }

}
