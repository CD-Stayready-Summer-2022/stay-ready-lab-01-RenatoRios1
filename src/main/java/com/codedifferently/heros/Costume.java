package com.codedifferently.heros;

public class Costume {

    private String logo;
    private String primaryColor;
    private String secondaryColor;
    private Boolean mask;

    public Costume(String logo, String primaryColor, String secondaryColor, Boolean mask) {
        this.logo = logo;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.mask = mask;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getPrimaryColor() {
        return this.primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getSecondaryColor() {
        return this.secondaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public Boolean getMask() {
        return this.mask;
    }

    public void setMask(Boolean mask) {
        this.mask = mask;
    }
}
