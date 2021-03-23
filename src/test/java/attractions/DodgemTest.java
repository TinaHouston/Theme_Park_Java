package attractions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import people.Visitor;

public class DodgemTest {

    Dodgems dodgems;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void visitorIsAllowed(){
        Visitor visitor = new Visitor(15, 1.83, 10.00);
        assertEquals(true, dodgems.isAllowedTo(visitor));
    }

    @Test
    public void visitorNotAllowedTooYoung(){
        Visitor visitor = new Visitor(11, 1.83, 10.00);
        assertEquals(false, dodgems.isAllowedTo(visitor));
    }

    @Test
    public void addsVisitor(){
        dodgems.addVisitor();
        assertEquals(1, dodgems.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(4.50, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void halvesPriceWhenVisitorUnder12(){
        Visitor visitor = new Visitor(10, 1.83, 10.00);
        assertEquals(2.25, dodgems.priceFor(visitor), 0.01);
    }

    @Test
    public void normalPriceWhenVisitorOver12(){
        Visitor visitor = new Visitor(15, 1.83, 10.00);
        assertEquals(4.50, dodgems.priceFor(visitor), 0.01);
    }
}
