package com.homeproject.firstproject.lesson7;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Барс", 6, false, 100);
        Cat cat2 = new Cat("Марсель", 5, false, 200);
        Cat cat3 = new Cat("Васька", 20, false, 50);
        Cat cat4 = new Cat("Мурзик", 13, false, 50);
        Cat cat5 = new Cat("Котик", 9, false, 50);
        Plate plate = new Plate(36);
        Plate plate2 = new Plate(15);
        Plate plate3 = new Plate(150);

        System.out.println(" ");
        System.out.println("--------------------пункты 2-3-4-----------------------");
        System.out.println("-----------------Вариант 2 выполнения------------------");
        System.out.println(" ");

        plate.info();
        int i = 0;
        while (cat.getAppetite() <= plate.getFoodCount()){
            i++;
            System.out.println("Кормление №" + i + ":");
            System.out.println("<" + cat.getName() + "> употребил <" + cat.getAppetite() + "> еды");
            cat.eat(plate);
            cat.setSatiety(true);
            plate.info();
            int count = plate.getFoodCount() / cat.getAppetite();
            System.out.println("Количества еды в тарелке достаточно ещё на <" + count + "> кормлений <" + cat.getName() + ">");
            } System.out.println("Кормление №" + (i+1) + " невозможно. Количество еды в тарелке недостаточное.");
        if (cat.isSatiety()){
            System.out.println(cat.isSatiety() + ". <" + cat.getName() + "> сыт");
        } else System.out.println(cat.isSatiety() + ". <" + cat.getName() + "> голоден");

        System.out.println(" ");
        System.out.println("--------------------пункты 2-3-4-----------------------");
        System.out.println("-----------------Вариант 2 выполнения------------------");
        System.out.println(" ");

        int j = 0;
        plate2.info();
        for (; ;) {
            if (cat.getAppetite() <= plate2.getFoodCount()) {
            j++;
            System.out.println("Кормление №" + j + ":");
            System.out.println("<" + cat.getName() + "> употребил <" + cat.getAppetite() + "> еды");
            cat.eat(plate2);
            cat.setSatiety(true);
            plate2.info();
            } else break;
            if (cat2.getAppetite() <= plate2.getFoodCount()) {
                j++;
                System.out.println("Кормление №" + j + ":");
                System.out.println("<" + cat2.getName() + "> употребил <" + cat2.getAppetite() + "> еды");
                cat2.eat(plate2);
                cat2.setSatiety(true);
                plate2.info();
            } else break;
            if (cat3.getAppetite() <= plate2.getFoodCount()) {
                j++;
                System.out.println("Кормление №" + j + ":");
                System.out.println("<" + cat3.getName() + "> употребил <" + cat3.getAppetite() + "> еды");
                cat3.eat(plate2);
                cat3.setSatiety(true);
                plate2.info();
            } else break;
        }
        System.out.println("Кормление №" + (j + 1) + " невозможно. Количество еды в тарелке недостаточное.");
        if (cat.isSatiety() == true) {
            System.out.println(cat.isSatiety() + ". <" + cat.getName() + "> сыт");
        } else System.out.println(cat.isSatiety() + ". <" + cat.getName() + "> голоден");
        if (cat2.isSatiety() == true) {
            System.out.println(cat2.isSatiety() + ". <" + cat2.getName() + "> сыт");
        } else System.out.println(cat2.isSatiety() + ". <" + cat2.getName() + "> голоден");
        if (cat3.isSatiety() == true) {
            System.out.println(cat3.isSatiety() + ". <" + cat3.getName() + "> сыт");
        } else System.out.println(cat3.isSatiety() + ". <" + cat3.getName() + "> голоден");

        System.out.println(" ");
        System.out.println("--------------пункт 5------------------");
        System.out.println(" ");

        int x = 0;
        plate3.info();
        String[] arr = new String[5];
        for (; ;){

            if (cat.getAppetite() <= plate3.getFoodCount()) {
                x++;
                System.out.println("Кормление №" + x + ":");
                System.out.println("<" + cat.getName() + "> употребил <" + cat.getAppetite() + "> еды");
                cat.eat(plate3);
                cat.setSatiety(true);
                plate3.info();
            } else break;
            if (cat2.getAppetite() <= plate3.getFoodCount()) {
                x++;
                System.out.println("Кормление №" + x + ":");
                System.out.println("<" + cat2.getName() + "> употребил <" + cat2.getAppetite() + "> еды");
                cat2.eat(plate3);
                cat2.setSatiety(true);
                plate3.info();
            } else break;
            if (cat3.getAppetite() <= plate3.getFoodCount()) {
                x++;
                System.out.println("Кормление №" + x + ":");
                System.out.println("<" + cat3.getName() + "> употребил <" + cat3.getAppetite() + "> еды");
                cat3.eat(plate3);
                cat3.setSatiety(true);
                plate3.info();
            } else break;
            if (cat4.getAppetite() <= plate3.getFoodCount()) {
                x++;
                System.out.println("Кормление №" + x + ":");
                System.out.println("<" + cat4.getName() + "> употребил <" + cat4.getAppetite() + "> еды");
                cat4.eat(plate3);
                cat4.setSatiety(true);
                plate3.info();
            } else break;
            if (cat5.getAppetite() <= plate3.getFoodCount()) {
                x++;
                System.out.println("Кормление №" + x + ":");
                System.out.println("<" + cat5.getName() + "> употребил <" + cat5.getAppetite() + "> еды");
                cat5.eat(plate3);
                cat5.setSatiety(true);
                plate3.info();
            } else break;
        }
        System.out.println("Кормление №" + (x + 1) + " невозможно. Количество еды в тарелке недостаточное.");
        if (cat.isSatiety() == true) {
            System.out.println(cat.isSatiety() + ". <" + cat.getName() + "> сыт");
        } else System.out.println(cat.isSatiety() + ". <" + cat.getName() + "> голоден");
        if (cat2.isSatiety() == true) {
            System.out.println(cat2.isSatiety() + ". <" + cat2.getName() + "> сыт");
        } else System.out.println(cat2.isSatiety() + ". <" + cat2.getName() + "> голоден");
        if (cat3.isSatiety() == true) {
            System.out.println(cat3.isSatiety() + ". <" + cat3.getName() + "> сыт");
        } else System.out.println(cat3.isSatiety() + ". <" + cat3.getName() + "> голоден");
        if (cat4.isSatiety() == true) {
            System.out.println(cat4.isSatiety() + ". <" + cat4.getName() + "> сыт");
        } else System.out.println(cat4.isSatiety() + ". <" + cat4.getName() + "> голоден");
        if (cat5.isSatiety() == true) {
            System.out.println(cat5.isSatiety() + ". <" + cat5.getName() + "> сыт");
        } else System.out.println(cat5.isSatiety() + ". <" + cat5.getName() + "> голоден");

        System.out.println(" ");
        System.out.println("--------------пункт 6------------------");
        System.out.println(" ");

        System.out.println("В тарелку добавлена еда в количестве <" + cat2.getCount() + ">");
        cat2.fill(plate2);
        plate2.info();
    }
}