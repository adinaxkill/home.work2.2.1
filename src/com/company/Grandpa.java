package com.company;

public abstract class Grandpa {
    private int age;
    private String work;

    public Grandpa(int age, String work) {
        this.age = age;
        this.work = work;
    }




    public String getWork() {
        return work;
    }


    public int getAge() {
        return age;
    }


    public abstract String getInfo();
}