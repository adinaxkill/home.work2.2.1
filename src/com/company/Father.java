package com.company;

public class Father extends Grandpa {
    private String name;


    public Father(int age, String work, String name) {
        super(age, work);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getInfo() {
        String s = "Age:" + getAge() +
                "\nWork:" + getWork() +
                "\nName:" + name +
                "\nHair color:" + Enumcolor.BLACK;
        return s;
    }

        public void goToWork () {
            System.out.println("Я иду на работу");
        }
}
