package com.codedifferently.computer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ComputerTest {

    @Test
    @DisplayName("No parameter constructor test")
    public void constructorTest01() {
        //Given
        Computer computer = new Computer();
        //When
        String expectedBrand = ""; //We're just expecting a a non null value
        //Then
        String actualBrand = computer.getBrand();
        //Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertNotNull(actualBrand);
    }

    @Test
    @DisplayName("Multi-parameter Test")
    public  void constructorTest02(){
        //Given
        Computer comp = new Computer("Dell", "Windows", "16GB", 120.50, "Ada");
        //When
        String expected = "Dell Windows 16GB Ada";
        //Then
        String actualBrand = comp.getBrand();
        String actualOs = comp.getOs();
        String actualMemory = comp.getMemory();
        String actualModel = comp.getModel();

        String actual = String.format("%s %s %s %s", actualBrand, actualOs, actualMemory, actualModel);

        Assertions.assertEquals(expected, actual);

    }



}
