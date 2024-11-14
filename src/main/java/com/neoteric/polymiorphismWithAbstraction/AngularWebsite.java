package com.neoteric.polymiorphismWithAbstraction;

public abstract class AngularWebsite implements Website{


    @Override
    public String navbar() {
        return "navbar";
    }



    @Override
    public String footer() {
        return "footer";
    }


    @Override
    public String body() {
        return "body";
    }


    public  String page (){
        navbar();
        body();
        footer();
        return this.getClass().getName();
    }
}
