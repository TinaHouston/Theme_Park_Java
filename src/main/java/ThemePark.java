import attractions.Attraction;
import behaviours.AttractionsAndStalls;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark implements AttractionsAndStalls {

    private String name;
    private ArrayList<AttractionsAndStalls> attractionsAndStalls;
    private HashMap<String, Integer> reviews;

    public ThemePark(String name) {
        this.name = name;
        this.attractionsAndStalls = new ArrayList<AttractionsAndStalls>();
        this.reviews = new HashMap<String, Integer>();
    }

    public ArrayList<AttractionsAndStalls> getAttractionsAndStalls() {
        return attractionsAndStalls;
    }

    public int attractionStallListSize(){
        return this.attractionsAndStalls.size();
    }

    public String getName(){
        return name;
    }

    public void addAttractionOrStall(AttractionsAndStalls attractionsAndStalls){
        this.attractionsAndStalls.add(attractionsAndStalls);
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> allReviewed = new ArrayList<IReviewed>();
        for(AttractionsAndStalls attractionsAndStalls: this.attractionsAndStalls){
            allReviewed.add((IReviewed) attractionsAndStalls);
        } return allReviewed;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.addVisitor();
        visitor.addAttractionOrStall(attraction);
    }

}
