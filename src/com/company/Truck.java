package com.company;

public class Truck extends Vehicle{
    private int weight;

    @Override
    public void drive(double speed) {
        System.out.println("We are driving a truck: " + toString());
    }
    public String toString (){
        return "make: "+getMake()+" model: "+getModel()+" year of production: "+getYearOfProduction()+" weight: "+getWeight();
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
