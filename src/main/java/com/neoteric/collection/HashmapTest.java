package com.neoteric.collection;

import java.util.*;
import java.util.Map;

public class HashmapTest< k,v > {

    public static void main(String[]args){
        java.util.Map<String,Integer> myMarks=new HashMap<>();

        myMarks.put("english",23);
        myMarks.put("maths",34);
        myMarks.put("science",56);

        //retrieve the the daata

        Set<java.util.Map.Entry<String,Integer>> entrySet=myMarks.entrySet();

        Iterator<java.util.Map.Entry<String,Integer>>ITR= entrySet.iterator();

        //if we use if condition it will execute only once
        //if we use while it will execute until the condition terminate

        while (ITR.hasNext()){
            java.util.Map.Entry<String,Integer> entryMap=ITR.next();

            System.out.println(entryMap.getKey()+"value"+entryMap.getValue());

        }

        myMarks.entrySet().stream().forEach(entry->{
            System.out.println(entry.getKey()+"value"+entry.getValue());
        });

        Map<String,Integer> myMarksSortedMap=new TreeMap<>();

        myMarksSortedMap.put("english",23);
        myMarksSortedMap.put("maths",34);
        myMarksSortedMap.put("science",56);

        myMarks.entrySet().stream().forEach(entry->{
            System.out.println(entry.getKey()+"value"+entry.getValue());
        });


    }
}
