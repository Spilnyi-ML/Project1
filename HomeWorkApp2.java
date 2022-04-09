package com.homeproject.firstproject;

public class HomeWorkApp {

   public static void main(String[] args){ //пункт 1
       printThreeWords();
       checkSumSign();
       printColor();
       compareNumbers();
   }
     public static void printThreeWords() { //пункт 2
        System.out.println("------JAVA_Lesson_1--------");
        System.out.println("--------HomeWork-----------");
        System.out.println("--------пункт 2------------");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
     }
     public static void checkSumSign() { //пункт 3
        int a = 198;
        int b = -198;
        int summ = a + b;
        // System.out.println(summ);
        System.out.println("--------пункт 3------------");
        if (summ >= 0) {System.out.println("Сумма положительная");}
        else {System.out.println("Сумма отрицательная");}
     }
     public static void printColor() { //пункт 4
       int value = 100;
       // System.out.println(value);
       System.out.println("--------пункт 4------------");
       if (value <=0) {System.out.println("Красный");}
       if (value >0 && value <=100) {System.out.println("Жёлтый");}
       if (value >100) {System.out.println("Зелёный");}
     }
     public static void compareNumbers() { //пункт 5
       int a = 89;
       int b = 89;
       //System.out.println(a);
       //System.out.println(b);
       System.out.println("--------пункт 5------------");
       if (a >= b) {System.out.println("a>=b");}
       else {System.out.println("a<b");}
     }
}
