package factories.regionalfactories;

import toyproducts.Toy;
import toyproducts.models.AmericanCarToy;

public class AmericanCarToyFactory extends factories.ToyFactory{

    public AmericanCarToyFactory() {
        super();
    }
   

    @Override
    public Toy createToy(Integer serialNumber) {
        return new AmericanCarToy(serialNumber);
    }

}
