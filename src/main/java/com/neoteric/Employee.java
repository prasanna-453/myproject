package com.neoteric;

public class Employee {



    private String id;

    private double salary;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private String department;



    public Employee( String id, double salary,String department) {

        this.id = id;
        this.salary = salary;
        this.department=department;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
