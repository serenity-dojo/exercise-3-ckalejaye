package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhenCreatingObjects {

    @Test
    public void creating_a_dog(){

        String name = "Fido";
        String favouriteFood = "Bone";
        int age = 5;

        Dog fido = new Dog("Fido", "Bone", 5);

        Assert.assertEquals(fido.getName(),"Fido");
        Assert.assertEquals(fido.getFavouriteFood(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
/*
        fido.name = "Fido";
        fido.favouriteFood = "Bone";
        fido.age = 5;
*/
        }

        @Test
        public void dog_make_noise() {

            Dog fido = new Dog("Fido","Bone", 5);
            Dog jack = new Dog("Jack","Ready Meal", 2);

            fido.makeNoise();
            jack.makeNoise();

            fido.feed("Bone");




        }
}
