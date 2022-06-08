package com.codedifferently.heros;

public class Xmen {

    private String power;
    private String codeName;
    private Double height;
    private String mutantLevel;

    public Xmen(String power, String codeName, Double height, String mutantLevel) {
        this.power = power;
        this.codeName = codeName;
        this.height = height;
        this.mutantLevel = mutantLevel;
    }

    public String getPower() {
        return this.power;
    }

    public String getCodeName() {
        return  this.codeName;
    }

    public Double getHeight() {
        return  this.height;
    }

    public String getMutantLevel(){
        return this.mutantLevel;
    }

    public void setPower(String power){
        this.power = power;
    }

    public void setCodeName(String codeName){
        this.codeName = codeName;
    }

    public void setHeight(Double height ) {
        this.height = height;
    }

    public void setMutantLevel(String mutantLevel) {
        this.mutantLevel = mutantLevel;
    }


}