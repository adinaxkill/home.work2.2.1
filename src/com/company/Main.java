package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Home home = new Home("Шопокова 13");

      Father father = new Father(35, "Doctor" , "John");
        System.out.println(father.getInfo());
        father.goToWork();


        Son son = new Son(18,"He is a student", "Robert" , "Basketball");
        System.out.println(son.getInfo());


        Son son2 = new Son(11, "he does not work ", "Leo", "Football");
        System.out.println(son2.getInfo());
        }

    }