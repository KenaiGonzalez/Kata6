package factories.regionalfactories;

import toyproducts.Toy;
import toyproducts.models.AsianCarToy;

public class AsianCarToyFactory extends factories.ToyFactory{

    public AsianCarToyFactory() {
        super();
    }
   
    @Override
    public Toy createToy(Integer serialNumber) {
        
        return new AsianCarToy(serialNumber);
    }

}
