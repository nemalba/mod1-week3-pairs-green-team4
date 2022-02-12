package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PetTest {



    @Test
    public void listVaccinations() {

        //Arrange
        Pet pet = new Pet();

        //Act
        List<String> vaccination = Arrays.asList("Rabies", "Distemper", "Parvo");
        //actual.add("Rabies");
       // actual.add("Distemper");
       // actual.add("Parvo");

        pet.setVaccinations(vaccination);

        String actual  = pet.listVaccinations();
        String expected  = "Rabies, Distemper, Parvo";
        //Assert
        Assert.assertEquals(expected, actual);


        /*
        WordCount wordCount = new WordCount();
    String []words = {"John", "John", "John"};
    Map<String,Integer> expected = new HashMap<>();
    expected.put("John", 3);

    Map<String, Integer> actual = wordCount.getCount(words);

    Assert.assertEquals(expected, actual);
         */
    }
}