package com.zeeshan.HelpDesk.Entity;

public class Department {
    private String depName;
    private String depLocation;

    //Setters
    public void setDepName(String depName) {
        this.depName = depName;
    }

    public void setDepLocation(String depLocation) {
        this.depLocation = depLocation;
    }
    //Getters
    public String getDepName() {
        return depName;
    }

    public String getDepLocation() {
        return depLocation;
    }
}
