package factories.regionalfactories;

import toyproducts.Toy;
import toyproducts.models.AmericanHelicopterToy;

public class AmericanHelicopterToyFactory extends factories.ToyFactory{

    public AmericanHelicopterToyFactory() {
        super();
    }
   

    @Override
    public Toy createToy(Integer serialNumber) {
        return new AmericanHelicopterToy(serialNumber);
    }

}
