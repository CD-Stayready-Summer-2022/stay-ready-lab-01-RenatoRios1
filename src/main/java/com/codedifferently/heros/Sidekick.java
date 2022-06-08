package com.codedifferently.heros;

public class Sidekick {

    private String hero;
    private String codeName;
    private String weapon;
    private Costume costume;

    public Sidekick(String hero, String codeName, String weapon, Costume costume) {
        this.hero = hero;
        this.codeName = codeName;
        this.weapon = weapon;
        this.costume = costume;
    }

    public String getHero() {
        return this.hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public String getCodeName() {
        return this.codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Costume getCostume() {
        return this.costume;
    }

    public void setCostume(Costume costume) {
        this.costume = costume;
    }
}
