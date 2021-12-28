package factories.regionalfactories;

import toyproducts.Toy;
import toyproducts.models.AsianCarToy;
import toyproducts.models.AsianHelicopterToy;

public class AsianToyFactory extends factories.ToyFactory{

    public AsianToyFactory() {
        super();
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
        return toy;
    }

}
