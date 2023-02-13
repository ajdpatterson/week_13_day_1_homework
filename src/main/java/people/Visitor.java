package people;

import attractions.Attraction;

import java.util.ArrayList;

public class Visitor {

    private int age;
    private double height;
    private double money;
    private ArrayList<Attraction> visitedAttractions;
    private Attraction attraction;

    public Visitor(int age, double height, double money, ArrayList<Attraction> visitedAttractions) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.visitedAttractions = visitedAttractions;
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

    public ArrayList<Attraction> getVisitedAttractions() {
        return visitedAttractions;
    }

    public void visitAttraction(Attraction attraction){
        visitedAttractions.add(attraction);
    }
}
