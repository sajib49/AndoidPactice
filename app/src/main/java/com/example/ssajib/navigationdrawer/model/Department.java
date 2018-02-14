package com.example.ssajib.navigationdrawer.model;

import java.util.ArrayList;

/**
 * Created by ssajib on 11-Feb-2018.
 */

public class Department {
    public int DepartmentId;
    public String DepartmentName;
    public int NoOfEmployee;
    public String DepartmentHeadName;

    ArrayList<Department> departments;
    public ArrayList<Department> GetDepartments(){
        departments = new ArrayList<>();
        Department department1 = new Department();
        department1.DepartmentId = 1;
        department1.DepartmentName ="MIS & IT";
        department1.NoOfEmployee =14;
        department1.DepartmentHeadName ="Arifur Rahman";

        Department department2 = new Department();
        department2.DepartmentId = 2;
        department2.DepartmentName ="Account & Finance";
        department2.NoOfEmployee =22;
        department2.DepartmentHeadName ="Shib Pad Dey";

        Department department4 = new Department();
        department4.DepartmentId = 4;
        department4.DepartmentName ="Human Resources";
        department4.NoOfEmployee =10;
        department4.DepartmentHeadName ="Arifur Rahman";

        Department department3 = new Department();
        department3.DepartmentId = 3;
        department3.DepartmentName ="Ecommerce";
        department3.NoOfEmployee =6;
        department3.DepartmentHeadName ="Faridur Rahman";

        departments.add(department1);
        departments.add(department2);
        departments.add(department3);
        departments.add(department4);

        return departments;

    }
}
