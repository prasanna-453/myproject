package com.neoteric.streamdemo;

import java.util.ArrayList;
import java.util.List;

public class StreamDemoTest {

    public static void main(String[]args){


        List<Employee>employeeList=new ArrayList<>();

        employeeList.add(new Employee(1,"prasanna"));
        employeeList.add(new Employee(2,"ganesh"));

        int startIndex=0;

        int endIndex=employeeList.size();

        for (int startI =0;startI<employeeList.size(); startI++){
            System.out.println();
        }
    }
}
