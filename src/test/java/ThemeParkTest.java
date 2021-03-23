import attractions.Dodgems;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import stalls.IceCreamStall;
import people.Visitor;
import stalls.ParkingSpot;
import stalls.TobaccoStall;
import attractions.Attraction;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    RollerCoaster rollerCoaster;
    Dodgems dodgems;
    IceCreamStall iceCreamStall;
    Visitor visitor;
    TobaccoStall tobaccoStall;


    @Before
    public void before() {
        themePark = new ThemePark("Disneyland");
        rollerCoaster = new RollerCoaster("Roller coaster", 10);
        dodgems = new Dodgems("Dodgems", 8);
        iceCreamStall = new IceCreamStall("Ice cream stall", "Stuart", ParkingSpot.A1, 5);
        visitor = new Visitor(26, 1.75, 30.00);
        tobaccoStall = new TobaccoStall("Tobacco Stall", "Jerry", ParkingSpot.A2, 4);
    }

    @Test
    public void hasName(){
        assertEquals("Disneyland", themePark.getName());
    }

    @Test
    public void canAddAttractionsAndStalls(){
        themePark.addAttractionOrStall(rollerCoaster);
        themePark.addAttractionOrStall(tobaccoStall);
        assertEquals(2, themePark.attractionStallListSize());
    }

    @Test
    public void canGetAllReviewed(){
        themePark.addAttractionOrStall(rollerCoaster);
        themePark.addAttractionOrStall(iceCreamStall);
        assertEquals(2, themePark.getAllReviewed().size());
    }

    @Test
    public void visited(){
        themePark.visit(visitor, rollerCoaster);
        assertEquals(1, visitor.visitedAttractionListSize());
        assertEquals(1, rollerCoaster.getVisitCount());
    }
}
