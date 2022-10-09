package com.serenitydojo;

public class Dog {
    private String name;

    private String favouriteFood;

    private int age;

    public static final String DOG_NOISE = "Woof!";

    public Dog(String name, String favouriteFood, int age) {
        this.name = name;
        this.favouriteFood = favouriteFood;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }
    public String getFavouriteFood() {
        return favouriteFood;
    }

    public int getAge() {
        return age;

    }

    public void makeNoise() {
        System.out.println(DOG_NOISE);
    }

    public void feed(String food) {
        System.out.println( name + " eat some " + food );
    }
}
