package com.neoteric;

import com.neoteric.department.Department;

import java.util.*;

public class AverageSalaryLegacy {

    public static void main(String[]args) {

        List<Employee>employeeList=new ArrayList<>();


        Employee employee1 = new Employee("1",70000.0,"IT");


        Employee employee2 = new Employee("2",60000.0,"Manager");

        Employee employee3=new Employee("3",8000.0,"Devoloper");

        Employee employee4=new Employee("4",70000.0,"IT");

        Employee employee5=new Employee("6",70000.0,"IT");


        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        Map<String,Double>deptAvgSalaryMap=new HashMap<>();
        Map<String,Double>deptEmpCountMap=new HashMap<>();

       // deptAvgSalaryMap.put("IT",6000.0);

        //System.out.println(deptAvgSalaryMap);

        //deptAvgSalaryMap.put("IT",70000.0);

       // System.out.println(deptAvgSalaryMap);

        Iterator<Employee> employeeIterator=employeeList.iterator();

        while (employeeIterator.hasNext()){

            Employee emp = employeeIterator.next();
            if (deptAvgSalaryMap.containsKey(emp.getDepartment())){
                Double d = deptAvgSalaryMap.get(emp.getDepartment());
                Double total = d+emp.getSalary();
                deptAvgSalaryMap.put(emp.getDepartment(),total);

                double count =  deptEmpCountMap.get(emp.getDepartment());

                double totalCount = count+1;
                deptEmpCountMap.put(emp.getDepartment(),totalCount);

            }else {
                deptAvgSalaryMap.put(emp.getDepartment(),emp.getSalary());
                deptEmpCountMap.put(emp.getDepartment(),1.0);
            }
        }

        System.out.println("total salary "+deptAvgSalaryMap);

        System.out.println("total count "+deptEmpCountMap);

        Iterator<String> deptIterator =  deptAvgSalaryMap.keySet().iterator();

        while(deptIterator.hasNext()){
            String dept = deptIterator.next();

            Double totalSalary =   deptAvgSalaryMap.get(dept);
            double totalCount  =    deptEmpCountMap.get(dept);

            System.out.println(" Avg salary by dept" +totalSalary/totalCount);
        }

    }

}
