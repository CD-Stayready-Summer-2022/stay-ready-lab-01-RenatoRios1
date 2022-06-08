package com.codedifferently.herostest;

import com.codedifferently.heros.Xmen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class XmenTest {

    @Test
    @DisplayName("Test 1 with multi parameter constructor")
    public void constructorTest01(){
        //Given
        Xmen hero = new Xmen("Underwater breathing", "Barnacle Boy", 6.20, "Normal");
        String expected = "Underwater breathing Barnacle Boy " + 6.20 + " Normal";
        //When
        String power = hero.getPower();
        String codeName = hero.getCodeName();
        Double height = hero.getHeight();
        String mutantLevel = hero.getMutantLevel();
        //Then
        String actual = power + " " + codeName + " " + height + " " + mutantLevel;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Setter test power")
    public void setPowerTest(){
        Xmen hero = new Xmen("Underwater breathing", "Barnacle Boy", 6.20, "Normal");

        String expected = "Flying";

        hero.setPower("Flying");

        String actual = hero.getPower();

        Assertions.assertEquals(expected, actual);
    }
}
