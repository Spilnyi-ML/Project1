package com.homeproject.firstproject;

public class Lesson_2 {
    public static void main(String[] args) {
    //    sum(2,3);
    //    System.out.println("Сумма (сложение) = " + sum(76867,8742));
    //    System.out.println("Разность (вычитание) = " + minus(76867,8742));
    //    System.out.println("Произведение (умножение) = " + mult(76867,8742));
    //    System.out.println("Частное (деление) = " + divide(76867,8742));
        checkPoint1();
        checkPoint2();
        checkPoint3();
        checkPoint4();
    }

   // private static int sum(int a, int b) {return a + b;}
   // private static int minus(int a, int b) {return a - b;}
   // private static int mult(int a, int b) {return a * b;}
   // private static double divide(double a, double b) {return a / b;}

    public static void checkPoint1() { //пункт 1
        boolean bool;
        int a = 1;
        int b = 19;
        int summ = a + b;
        System.out.println("--------пункт 1------------");
        if (summ > 10 && summ <= 20) {System.out.println(bool = true);}
        else {System.out.println(bool = false);}
    }

    public static void checkPoint2() { //пункт 2
        System.out.println("--------пункт 2------------");
        int a = 0;
        if (a >= 0){System.out.println("Число положительное");}
        else {System.out.println("Число отрицательное");}
    }

    public static void checkPoint3() { //пункт 3
        System.out.println("--------пункт 3------------");
        boolean bool;
        int a = 0;
        if (a >= 0){System.out.println(bool = false);}
        else {System.out.println(bool = true);}
    }

    public static void checkPoint4() { //пункт 4
        System.out.println("--------пункт 4------------");
       int i = 1;
       String j = "Hello";
       while (i <= 17) {
           System.out.println(i + " " + j);
           i = i + 1;
       }
    }
}

