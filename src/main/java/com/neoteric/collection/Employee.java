package com.neoteric.collection;

public class Employee {

    private String name;

    public String getName() {
        return name;
    }

    private String empid;

    public String getEmpid() {
        return empid;
    }

    public Employee(String name,String empid)
    {
        this.empid=empid;
        this.name=name;

    }
}
