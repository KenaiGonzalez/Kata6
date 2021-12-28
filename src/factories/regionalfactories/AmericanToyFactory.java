package factories.regionalfactories;

import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;

public class AmericanToyFactory extends factories.ToyFactory{

    public AmericanToyFactory() {
        super();
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
        return toy;
    }

}
