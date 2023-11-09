package com.company;

public abstract class Vehicle implements Comparable <Vehicle> {
    private int yearOfProduction;
    private String make;
    private String model;
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getMake(){
        return model;
    }
    public void setMake(String make){
        this.make=make;
    }
    public int getYearOfProduction() {
        return yearOfProduction;
    }
    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
    abstract public void drive(double speed);
    @Override
    public int compareTo(Vehicle v) {
        if(this.getYearOfProduction()>v.getYearOfProduction())
            return 1;
        else if(this.getYearOfProduction()<v.getYearOfProduction())
            return -1;
        else
            return 0;
    }
}
