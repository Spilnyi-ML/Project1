package com.homeproject.firstproject.lesson7;

public class Cat {
    private int appetite;
    private String name;
    private boolean satiety;
    private int count;

    public Cat(String name, int appetite, boolean satiety, int count){
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
        this.count = count;
    }

    public void eat(Plate plate){
        plate.decreaseFood(appetite);
    }

    public void fill(Plate plate){
        plate.increaseFood(count);
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}