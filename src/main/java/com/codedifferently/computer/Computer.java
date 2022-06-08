package com.codedifferently.computer;

public class Computer {
    private String brand;   //Encapsulation
                            //Use functions to access - getBrand()
    private String os;
    private String model;
    private String memory;
    private Double price;

    //Making out Constructor, We will also be testing this since it has the public keyword
    //Non parameterized
    public Computer() {
        this.brand = "";
    }

    public Computer(String brand, String os, String memory, Double price, String model) {
        this.brand = brand;
        this.os = os;
        this.memory = memory;
        this.price = price;
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getBrand() {
        return this.brand;
    }

    public String getOs() {
        return this.os;
    }

    public String getMemory() {
        return this.memory;
    }


    public Double getPrice(){
        return this.price;
    }

    public String getModel() {
        return this.model;
    }
}
