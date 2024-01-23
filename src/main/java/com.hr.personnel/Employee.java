package com.hr.personnel;

import java.time.LocalDate;

public class Employee {
    //fields
    public String name;
    public LocalDate hireDate;

    //constructor
    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    //methods
    public String getEmployeeInfo() {
        return "name: " + name + " hireDate: " + hireDate;
    }

    public String work() {
        return name + " worked";
    }
}
