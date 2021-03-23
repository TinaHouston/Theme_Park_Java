package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void setUp() throws Exception {
        park = new Park("Leafy Meadows", 9);
    }

    @Test
    public void hasName() {
        assertEquals("Leafy Meadows", park.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(9, park.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, park.getVisitCount());
    }

    @Test
    public void visitorIsAllowed(){
        Visitor visitor = new Visitor(3, 1.00, 2.00);
        assertEquals(true, park.isAllowedTo(visitor));
    }

    @Test
    public void visitorNotAllowedTooYoung(){
        Visitor visitor = new Visitor(2, 1.00, 10.00);
        assertEquals(false, park.isAllowedTo(visitor));
    }

    @Test
    public void addsVisitor(){
        park.addVisitor();
        assertEquals(1, park.getVisitCount());
    }
}
