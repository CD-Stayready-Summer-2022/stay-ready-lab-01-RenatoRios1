package com.codedifferently.herostest;

import com.codedifferently.heros.Costume;
import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CostumeTest {

    @Test
    @DisplayName("Multiple parameter constructor test.")
    public void constructorTest01(){
        //Given
        Costume tights = new Costume("Bird", "Red", "Yellow", true);
        String expected = "Bird Red Yellow " + true;
        //When
        String logo = tights.getLogo();
        String primaryColor = tights.getPrimaryColor();
        String secondaryColor = tights.getSecondaryColor();
        Boolean mask = tights.getMask();
        String actual = String.format("%s %s %s ", logo, primaryColor, secondaryColor);
        actual += mask;
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Setter logo test.")
    public void setterLogoTest01(){
        //Given
        Costume tights = new Costume("Bird", "Red", "Yellow", true);
        String expected = "Bird";
        //When
        tights.setLogo("Lion");
        String actual = tights.getLogo();
        //Then
        Assertions.assertEquals(expected, actual);
    }
}
