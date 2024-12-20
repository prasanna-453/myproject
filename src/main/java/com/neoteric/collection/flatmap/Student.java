package com.neoteric.collection.flatmap;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;

    private String id;

    private List<Subject> subjectList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void add(Subject subject){
        this.subjectList.add(subject);
    }

    public List<Subject> getSubjectList(){
        return this.subjectList;
    }

}
