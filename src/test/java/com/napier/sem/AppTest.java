package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
    }

    @Test
    void printSalariesTestNull()
    {
        app.printSalaries(null);
        assertTrue(true, "Method executed without throwing exceptions");
    }

    @Test
    void printSalariesTestEmpty()
    {
        List<Employee> employees = new ArrayList<>();
        app.printSalaries(employees);
        assertTrue(true, "Method executed without throwing exceptions");
    }

    @Test
    void printSalariesTestContainsNull()
    {
        List<Employee> employees = new ArrayList<>();
        employees.add(null);
        app.printSalaries(employees);
        assertTrue(true, "Method executed without throwing exceptions");
    }

    @Test
    void printSalariesNormal()
    {
        List<Employee> employees = new ArrayList<>();
        Employee emp = new Employee();
        emp.emp_no = 1;
        emp.first_name = "Kevin";
        emp.last_name = "Chalmers";
        emp.title = "Engineer";
        emp.salary = 55000;
        employees.add(emp);
        app.printSalaries(employees);
        assertTrue(true, "Method executed without throwing exceptions");
    }

    @Test
    void displayEmployeeTestNull()
    {
        app.displayEmployee(null);
        assertTrue(true, "Method executed without throwing exceptions");
    }

    @Test
    void displayEmployeeTestNormal()
    {
        Employee emp = new Employee();
        emp.emp_no = 1;
        emp.first_name = "Kevin";
        emp.last_name = "Chalmers";
        emp.title = "Engineer";
        emp.salary = 55000;
        app.displayEmployee(emp);
        assertTrue(true, "Method executed without throwing exceptions");
    }
}