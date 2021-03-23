package people;

import behaviours.AttractionsAndStalls;

import java.util.ArrayList;

public class Visitor implements AttractionsAndStalls {

    private int age;
    private double height;
    private double money;
    private ArrayList<AttractionsAndStalls> visitedAttractions;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.visitedAttractions = new ArrayList<AttractionsAndStalls>();
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public int visitedAttractionListSize(){
        return this.visitedAttractions.size();
    }

    public void addAttractionOrStall(AttractionsAndStalls visitedAttractions){
        this.visitedAttractions.add(visitedAttractions);
    }
}
