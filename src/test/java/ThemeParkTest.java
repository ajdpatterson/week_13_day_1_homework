import attractions.Attraction;
import attractions.Dodgems;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;
    ArrayList<Stall> stalls;
    Dodgems dodgems;
    Playground playground;
    RollerCoaster rollerCoaster;
    ArrayList<Attraction> attractions;
    ArrayList<IReviewed> reviewed;
    ThemePark themePark;
    Visitor visitor;

    @Before
    public void before(){
        candyflossStall = new CandyflossStall("Flossy Ann's", "Anne Bann", ParkingSpot.A1, 6);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 6);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 2);
        stalls = new ArrayList<>();
        stalls.add(candyflossStall);
        stalls.add(iceCreamStall);
        stalls.add(tobaccoStall);
        dodgems = new Dodgems("Bumper Cars", 5);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        attractions = new ArrayList<>();
        attractions.add(dodgems);
        attractions.add(playground);
        attractions.add(rollerCoaster);
        reviewed = new ArrayList<>();
        themePark = new ThemePark(attractions, stalls);
        visitor = new Visitor(21, 220, 100, attractions);
    }
    @Test
    public void storesStalls(){
        ArrayList<Attraction> storedAttractions = themePark.getAttractions();
        assertEquals(3, storedAttractions.size());
    }

    @Test
    public void storesAttractions(){

        ArrayList<Stall> storedStalls = themePark.getStalls();
        assertEquals(3, storedStalls.size());
    }

    @Test
    public void storesAllReviewed(){
        ArrayList<IReviewed> storedAllReviewed = themePark.getAllReviewed();
        assertEquals(6, storedAllReviewed.size());
    }

    @Test
    public void canVisit(){
        themePark.visit(visitor, dodgems);
        assertEquals(4, visitor.getVisitedAttractions().size());
        assertEquals(1, dodgems.getVisitCount());
    }
}
