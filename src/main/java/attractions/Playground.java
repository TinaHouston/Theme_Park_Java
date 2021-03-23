package attractions;

import people.Visitor;

public class Playground extends Attraction {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() <= 15) {
            return true;
        } return false;
    }
}
