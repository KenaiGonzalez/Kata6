package factories.regionalfactories;

import toyproducts.Toy;
import toyproducts.models.AsianHelicopterToy;

public class AsianHelicopterToyFactory extends factories.ToyFactory{

    public AsianHelicopterToyFactory() {
        super();
    }
   
    @Override
    public Toy createToy(Integer serialNumber) {
        
        return new AsianHelicopterToy(serialNumber);
    }

}
