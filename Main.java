package com.homeproject.firstproject.lesson6;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat("Murzik", "grey", 2);
        Cat cat2 = new Cat("Barsik", "white", 3);
        Dog dog = new Dog("Muhtar", "black", 4);
        Dog dog2 = new Dog("Reks", "brown", 1);

        cat.setLengthBarrierRun(170);
        cat2.setLengthBarrierRun(160);
        dog.setLengthBarrierRun(180);
        dog2.setLengthBarrierRun(190);
        cat.setLengthBarrierSwim(5);
        cat2.setLengthBarrierSwim(7);
        dog.setLengthBarrierSwim(11);
        dog2.setLengthBarrierSwim(17);

        cat.setLengthRun(201);
        cat2.setLengthRun(199);
        dog.setLengthRun(501);
        dog2.setLengthRun(499);
        cat.setLengthSwim(1);
        cat2.setLengthSwim(0);
        dog.setLengthSwim(9);
        dog2.setLengthSwim(11);

        System.out.println("--------------пункт 1------------------");
        System.out.println(cat.toString());
        System.out.println(cat2.toString());
        System.out.println(dog.toString());
        System.out.println(dog2.toString());

        System.out.println("--------------пункт 2------------------");
        cat.run();
        cat.swim();
        cat2.run();
        cat2.swim();
        dog.run();
        dog.swim();
        dog2.run();
        dog2.swim();

        System.out.println("--------------пункт 3------------------");
        cat.lengthRun();
        cat2.lengthRun();
        dog.lengthRun();
        dog2.lengthRun();
        cat.lengthSwim();
        cat2.lengthSwim();
        dog.lengthSwim();
        dog2.lengthSwim();
        }
}
