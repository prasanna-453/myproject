package com.neoteric.collection.filter;

import java.util.List;

public class Student {

    public List<Subject> subject;


//    public void setSubject(String subject) {
//        this.subject = subject;
//    }

    public Student(List<Subject> subject) {
        this.subject = subject;
    }

    public Student() {

    }

    public List<Subject> getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "subject=" + subject +
                '}';
    }
//    public void setMarks(String marks) {
//        this.marks = marks;
//    }




}
