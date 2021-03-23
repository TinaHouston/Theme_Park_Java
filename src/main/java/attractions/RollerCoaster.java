package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() >= 12) {
            if (visitor.getHeight() >= 1.45) {
                return true;
            }
        } return false;
    }

    public double defaultPrice(){
        return 8.40;
    }

    public double priceFor(Visitor visitor){
        if(visitor.getHeight() > 2.00) {
            return defaultPrice() * 2;
        } return defaultPrice();
    }
}
