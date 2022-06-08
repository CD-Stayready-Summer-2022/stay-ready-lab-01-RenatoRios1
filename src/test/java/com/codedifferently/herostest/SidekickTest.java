package com.codedifferently.herostest;

import com.codedifferently.heros.Costume;
import com.codedifferently.heros.Sidekick;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SidekickTest {
    @Test
    @DisplayName("Multi Parameter Constructor Test")
    public void constructorTest01(){
        //Given
        Costume tights = new Costume("Fish", "Blue", "Gray", false);
        Sidekick barnacleBoy = new Sidekick("Mermaid Man", "Barnacle Boy", "Trident", tights);
        String expected = "Mermaid Man Barnacle Boy Trident " + "Fish Blue Gray " + false;
        //When
        String hero = barnacleBoy.getHero();
        String codeName = barnacleBoy.getCodeName();
        String weapon = barnacleBoy.getWeapon();

        String logo = tights.getLogo();
        String primaryColor = tights.getPrimaryColor();
        String secondaryColor = tights.getSecondaryColor();
        Boolean mask = tights.getMask();

        String actual = String.format("%s %s %s ", hero, codeName, weapon) +
                        String.format("%s %s %s ", logo, primaryColor, secondaryColor) +
                        false;
        //Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Setter hero Test")
    public void setterTest01(){
        //Given
        Costume tights = new Costume("Fish", "Blue", "Gray", false);
        Sidekick barnacleBoy = new Sidekick("Mermaid Man", "Barnacle Boy", "Trident", tights);
        String expected = "Superman";
        //When
        barnacleBoy.setHero("Superman");
        String actual = barnacleBoy.getHero();
        //Then
        Assertions.assertEquals(expected, actual);
    }
}
