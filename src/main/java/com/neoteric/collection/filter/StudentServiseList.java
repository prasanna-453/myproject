package com.neoteric.collection.filter;

import java.util.ArrayList;
import java.util.List;

public class StudentServiseList {

    public static void main(String[] args) {


        List<Student> studentList = new ArrayList<>();

        Student student = new Student();;
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();


        List<Subject> subjectList = new ArrayList<>();

        Subject subject = new Subject("english", 89);
        Subject subject1 = new Subject("maths", 90);
        Subject subject2 = new Subject("Science", 78);
        Subject subject3 = new Subject("phisics", 78);


        subjectList.add(subject);
        subjectList.add(subject1);
        subjectList.add(subject2);
        subjectList.add(subject3);

        System.out.println(subjectList);

        //Subject.stream()
              //  .filter(Subject -> subject.getMarks() >= 36)
              //  .forEach(Subject -> System.out.println(subject.getName()));


       // studentList.stream().filter();


    }
}
