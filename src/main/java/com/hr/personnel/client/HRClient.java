package com.hr.personnel.client;
import com.hr.personnel.Employee;

import java.time.LocalDate;

class HRClient {
    public static void main(String[] args) {
        Employee employee = new Employee("BreAnna", LocalDate.of(2023,1,1));
        String employeeInfo = employee.getEmployeeInfo();
        System.out.println(employeeInfo);
    }
}