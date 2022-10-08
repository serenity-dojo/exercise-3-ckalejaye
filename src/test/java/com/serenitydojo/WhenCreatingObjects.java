package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhenCreatingObjects {

    @Test

    public void creating_a_dog(){
/*        Dog fido = new Dog("Fido", "Bone", 5);


        assertEquals(fido.getName(), "Fido");
        assertEquals(fido.getFavouriteFood(), "Bone");
        assertEquals(fido.getAge(), 5);
*/

        String name ="Fido";
        String favouriteFood = "Bone";
        int age = 5;

        Dog fido = new Dog("name","favouriteFood", 5);

        fido.name = "Fido";
        fido.favouriteFood = "Bone";
        fido.age = 5;

        }

}
