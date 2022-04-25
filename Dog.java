package com.homeproject.firstproject.lesson6;

public class Dog extends Animal{

    private int lengthBarrierRun;
    private int lengthBarrierSwim;
    private int lengthRun;
    private int lengthSwim;

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    public Dog(String name, String color, int age, int lengthBarrierRun, int lengthBarrierSwim, int lengthRun,
                int lengthSwim) {
        super(name, color, age);
        this.lengthBarrierRun = lengthBarrierRun;
        this.lengthBarrierSwim = lengthBarrierSwim;
        this.lengthRun = lengthRun;
        this.lengthSwim = lengthSwim;
    }

    public int getLengthBarrierRun() {
        return lengthBarrierRun;
    }

    public void setLengthBarrierRun(int lengthBarrierRun) {
        this.lengthBarrierRun = lengthBarrierRun;
    }

    public int getLengthBarrierSwim() {
        return lengthBarrierSwim;
    }

    public void setLengthBarrierSwim(int lengthBarrierSwim) {
        this.lengthBarrierSwim = lengthBarrierSwim;
    }

    public int getLengthRun() {
        return lengthRun;
    }

    public void setLengthRun(int lengthRun) {
        this.lengthRun = lengthRun;
    }

    public int getLengthSwim() {
        return lengthSwim;
    }

    public void setLengthSwim(int lengthSwim) {
        this.lengthSwim = lengthSwim;
    }

    public void run(){
        System.out.println("<" + getName() + "> пробежал " + lengthBarrierRun + " м.");
    }

    public void swim(){
        System.out.println("<" + getName() + "> проплыл " + lengthBarrierSwim + " м.");
    }

    public void lengthRun() {
        if (lengthRun> 500) {
            System.out.println("У <" + getName() + "> превышено ограничение на действие <бежать>");
        }    else System.out.println("<" + getName() + "> пробежал " + lengthRun + " м.");
    }

    public void lengthSwim() {
        if (lengthSwim > 10) {
            System.out.println("У <" + getName() + "> превышено ограничение на действие <плыть>");
        }    else System.out.println("<" + getName() + "> проплыл " + lengthSwim + " м.");
    }
}
