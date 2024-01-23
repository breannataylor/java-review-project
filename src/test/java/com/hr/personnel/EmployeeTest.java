package com.hr.personnel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class EmployeeTest {
    private Employee employee;
    @Before
    public void setUp() throws Exception {
        //create test target object
        employee
                = new Employee("BreAnna",
                LocalDate.of(2023,1,1));

    }

    @Test
    public void getEmployeeInfoShouldReturnValidEmployeeInfo() {

        //call test target method
        String employeeInfo = employee.getEmployeeInfo();

        //verify if the result is what is expected (assert)
        Assert.assertEquals("name: BreAnna hireDate: 2023-01-01", employeeInfo);
    }

    @Test
    public void work() {

        //call test target method
        String work = employee.work();

        //verify if the result is what is expected
        Assert.assertEquals("BreAnna worked", work);
    }
}