package com.example.ssajib.navigationdrawer.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by ssajib on 11-Feb-2018.
 */

public class Employee {
    public int EmployeeId;
    public String EmployeeCode;
    public String EmployeeName;
    public int Salary;
    public Date DoB;

    public ArrayList<Employee> GetEmployees(){
        ArrayList<Employee> employees = new ArrayList<Employee>();

        Employee emp1 = new Employee();
        emp1.EmployeeId = 1;
        emp1.EmployeeCode = "0873";
        emp1.EmployeeName = "Md. Saidujjaman Sajib";
        emp1.Salary = 9786;
        emp1.DoB = Calendar.getInstance().getTime();

        Employee emp2 = new Employee();
        emp2.EmployeeId = 2;
        emp2.EmployeeCode = "3550";
        emp2.EmployeeName = "Md. Ahad Ali";
        emp2.Salary = 9786;
        emp2.DoB = Calendar.getInstance().getTime();

        Employee emp3 = new Employee();
        emp3.EmployeeId = 3;
        emp3.EmployeeCode = "3522";
        emp3.EmployeeName = "Rejon Al Tormuj";
        emp3.Salary = 9786;
        emp3.DoB = Calendar.getInstance().getTime();

        employees.add(emp1);
        employees.add(emp3);
        employees.add(emp2);

        return employees;
    }
    /*public int Age;
    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmployeeCode() {
        return EmployeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        EmployeeCode = employeeCode;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public Date getDoB() {
        return DoB;
    }

    public void setDoB(Date doB) {
        DoB = doB;
    }*/
}
