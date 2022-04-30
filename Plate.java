package com.homeproject.firstproject.lesson7;

public class Plate {
    private int foodCount;

    public Plate(int foodCount){
        this.foodCount = foodCount;
    }

    public void info(){
        System.out.println("Текущее количество еды в тарелке составляет <" + foodCount + ">");
    }

    public void decreaseFood(int amount){
        foodCount -= amount;
    }

    public void increaseFood(int amount){
        foodCount += amount;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }
}