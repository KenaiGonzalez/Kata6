package business;

import factories.ToyFactory;
import toyproducts.Toy;

public class ToyBusiness {
    public ToyFactory tf;
    public ToyBusiness(ToyFactory tf){
        this.tf = tf;
    }
    public Toy produceToy(String type){
        return tf.produceToy(type);
    }
}
