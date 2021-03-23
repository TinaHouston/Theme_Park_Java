package attractions;

import people.Visitor;

public class Park extends Attraction {

    public Park(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() >= 3) {
            return true;
        } return false;
    }
}
