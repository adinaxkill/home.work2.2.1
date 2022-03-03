package com.company;

public class Son extends Father {
    private String hobby;


    public String getHobby() {
        return hobby;
    }

    public Son(int age, String work, String name, String hobby) {
        super(age, work, name);
        this.hobby = hobby;
    }


    @Override
    public String getInfo() {
        String s = "Age:" + getAge() +
                "\nWork:" + getWork() +
                "\nName:" + getName() +
                "\nHobby:" + hobby +
                "\nHair color:" + Enumcolor.BROWN;
        return s;
    }
}
