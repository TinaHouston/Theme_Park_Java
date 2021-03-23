package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
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
    public void visitorIsAllowed(){
        Visitor visitor = new Visitor(15, 1.83, 10.00);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void visitorNotAllowedTooYoung(){
        Visitor visitor = new Visitor(11, 1.83, 10.00);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void visitorNotAllowedTooShort(){
        Visitor visitor = new Visitor(16, 1.30, 5.00);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void addsVisitor(){
        rollerCoaster.addVisitor();
        assertEquals(1, rollerCoaster.getVisitCount());
    }

    @Test
    public void chargeDoubleIfOver200(){
        Visitor visitor = new Visitor(20, 2.02, 10.00);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.01);
    }

    @Test
    public void chargesNormalPriceIfBelow200(){
        Visitor visitor = new Visitor(20, 1.85, 10.00);
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.01);
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }
}
