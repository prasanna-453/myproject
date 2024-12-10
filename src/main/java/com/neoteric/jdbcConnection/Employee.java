package com.neoteric.jdbcConnection;

public class Employee {

    private int empId;
    private String empName;
    private Double salary;

    public Employee(Double salary, String empName, int empId) {
        this.salary = salary;
        this.empName = empName;
        this.empId = empId;
    }

    public Employee() {

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
