package people;

import attractions.Attraction;
import attractions.Dodgems;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    Attraction dodgems;
    Attraction rollerCoaster;
    ArrayList<Attraction> attractions;

    @Before
    public void before(){
        attractions = new ArrayList<>();
        visitor = new Visitor(14, 1.2, 40.0, attractions);
        dodgems = new Dodgems("Bumper Cars", 5);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void attractionsStartsEmpty(){
        assertEquals(true, visitor.getVisitedAttractions().isEmpty());
    }

    @Test
    public void canAddAttractionToVisitor(){
        visitor.visitAttraction(dodgems);
        assertEquals(1, visitor.getVisitedAttractions().size());
    }
}
