package branches;

import business.SerialNumberGenerator;
import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;

public class AsianToyBusiness extends business.ToyBusiness{
    private final SerialNumberGenerator sng;
    public AsianToyBusiness() {
        sng = new SerialNumberGenerator();
    }

    @Override
    public Toy createToy(String type) {
        Toy toy = null;
        switch(type){
            case "car":
                toy = new AsianCarToy(sng.next());
                break;
            case "helicopter":
                toy = new AsianHelicopterToy(sng.next());
                break;
        }
        toy.label();
        toy.pack();
        return toy;
    }

}
