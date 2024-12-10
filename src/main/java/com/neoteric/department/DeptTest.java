package com.neoteric.department;

import java.util.*;
import java.util.stream.Collectors;

public class DeptTest {
    public static void main(String[]args){

        List<Department>departmentList=new ArrayList<>();


        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();
        Employee e6 = new Employee();
        Employee e7 = new Employee();
        Employee e8 = new Employee();

        List<Employee> listofemp = new Vector<>();

        listofemp.add(e1);
        listofemp.add(e2);
        listofemp.add(e3);
        listofemp.add(e4);
        listofemp.add(e5);
        listofemp.add(e6);
        listofemp.add(e7);
        listofemp.add(e8);


        e1.setId("1");
        e1.setName("prasanna");
        e1.setSalary(48000.0);

        e2.setId("2");
        e2.setName("prasanna2");
        e2.setSalary(48000.0);

        e3.setId("3");
        e3.setName("prasanna3");
        e3.setSalary(48000.0);

        e4.setId("4");
        e4.setName("prasanna4");
        e4.setSalary(48000.0);

        e5.setId("5");
        e5.setName("prasanna5");
        e5.setSalary(48000.0);

        e6.setId("6");
        e6.setName("prasanna6");
        e6.setSalary(48000.0);

        e7.setId("7");
        e7.setName("prasanna7");
        e7.setSalary(48000.0);

        e8.setId("8");
        e8.setName("prasanna8");
        e8.setSalary(48000.0);


        Department dev = new Department();
        Department dep = new Department();
        Department  main = new Department();
        Department oncall = new Department();

        dev.setDepcode(1);
        dev.setNameOfdep("development");
        dev.employeeList.add(e1);
        System.out.println(dev);

        dev.setDepcode(1);
        dev.setNameOfdep("development");
        dev.employeeList.add(e2);
        System.out.println(dev);


        dep.setDepcode(2);
        dep.setNameOfdep("deployment");
        dep.employeeList.add(e3);

        dep.setDepcode(2);
        dep.setNameOfdep("deployment");
        dep.employeeList.add(e4);


        main.setDepcode(3);
        main.setNameOfdep("maintain");
        main.employeeList.add(e5);

        main.setDepcode(3);
        main.setNameOfdep("maintain");
        main.employeeList.add(e6);

        oncall.setDepcode(4);
        oncall.setNameOfdep("calling");
        oncall.employeeList.add(e6);

        oncall.setDepcode(1);
        oncall.setNameOfdep("calling");
        oncall.employeeList.add(e8);

        List<Department> departments = new Vector();
        departments.add(dev);
        departments.add(dep);
        departments.add(main);
        departments.add(oncall);
        System.out.println("mahi");
        System.out.println(departments);

        Optional< Employee> higheestsalary=
                departments.stream()
                        .flatMap(
                                department -> listofemp.stream())

                        .max(Comparator.comparingDouble(Employee::getSalary));

        System.out.println(Arrays.asList(higheestsalary).iterator().hasNext() );
        System.out.println(Arrays.asList(higheestsalary).iterator().next());
        System.out.println(Arrays.asList(higheestsalary).stream().collect(Collectors.toList()));



        higheestsalary.ifPresent(employee ->
                System.out.println("Highest Salary Employee: " + employee.getName() + " with salary " + employee.getSalary())
        );




    }

}
