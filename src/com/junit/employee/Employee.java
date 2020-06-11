package com.junit.employee;

import java.util.Objects;

public class Employee {

    private int empID;
    private String name;
    private String ssn;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empID == employee.empID &&
                name.equals(employee.name) &&
                ssn.equals(employee.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empID, name, ssn);
    }
}
