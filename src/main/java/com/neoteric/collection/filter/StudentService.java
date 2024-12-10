package com.neoteric.collection.filter;


import java.util.HashMap;

import java.util.Map;

    public class StudentService<k,v> {

   public static void main(String[] args) {

        Map<String,Integer> studentMap=new HashMap<>();

       // Subject sub=new Subject();
//        sub.

        Subject english=new Subject("English",67);


        Subject maths=new Subject("Maths",89);


        Subject science=new Subject("Science",7);


        Subject phisics=new Subject("Phisics",80);


       //System.out.println("English"+ 67);


        studentMap.put("english",67);
        studentMap.put("maths",89);
        studentMap.put("Science",7);
        studentMap.put("phisics",80);

       //long Student=studentMap.entrySet().stream().count();

        System.out.println(studentMap);



        studentMap.entrySet().stream().filter(mapEntry->mapEntry.getValue()>=36).forEach(entry-> System.out.println(entry.getKey()));



//       System.out.println(student);
    }

}
