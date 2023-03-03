package com.zeeshan.HelpDesk.Entity;

public class Complaint {
    private int compId;
    private int compBy;

    //Getters
    public void setCompId(int compId) {
        this.compId = compId;
    }

    public void setCompBy(int compBy) {
        this.compBy = compBy;
    }
    //Setters
    public int getCompId() {
        return compId;
    }

    public int getCompBy() {
        return compBy;
    }
}
