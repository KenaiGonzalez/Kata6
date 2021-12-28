package branches;

import business.SerialNumberGenerator;
import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;

public class AmericanToyBusiness extends business.ToyBusiness{
    private final SerialNumberGenerator sng;
    public AmericanToyBusiness() {
        sng = new SerialNumberGenerator();
    }

    @Override
    public Toy createToy(String type) {
        Toy toy = null;
        switch(type){
            case "car":
                toy = new AmericanCarToy(sng.next());
                break;
            case "helicopter":
                toy = new AmericanHelicopterToy(sng.next());
                break;
        }
        toy.label();
        toy.pack();
        return toy;
    }

}
