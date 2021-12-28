package toys;

import toyproducts.Toy;
import toyproducts.models.CarToy;
import toyproducts.models.HelicopterToy;

public class ToyBusiness {
    private final SerialNumberGenerator sng;

    public ToyBusiness() {
        this.sng = new SerialNumberGenerator();
    }
    
    public Toy createToy(String type){
        Toy toy = null;
        switch(type){
            case "car":
                toy = new CarToy(sng.next());
                
                break;
            case "helicopter":
                toy = new HelicopterToy(sng.next());
                break;
         
        }
        toy.label();
        toy.pack();
        return toy;
    }
}
