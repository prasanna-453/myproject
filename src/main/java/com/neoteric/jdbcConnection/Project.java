package com.neoteric.jdbcConnection;

import java.util.List;

public class Project {

    private int pid;
    private String pName;
    private List<Employee>employeesList;

    public Project() {

    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public List<Employee> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employee> employeesList) {
        this.employeesList = employeesList;
    }

    public Project(int pid, String pName, List<Employee> employeesList) {
        this.pid = pid;
        this.pName = pName;
        this.employeesList = employeesList;
    }
}
