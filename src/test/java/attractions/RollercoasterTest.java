package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(10, 120, 100, null);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasHeightAndAgeRestriction(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void chargesOver200GuestsDouble(){
        visitor = new Visitor(16, 210, 100, null);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.00);
    }
}
