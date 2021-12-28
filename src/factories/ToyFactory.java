package factories;

import toyproducts.Toy;

public abstract class ToyFactory {
    public Toy produceToy(Integer serialNumber){
        Toy toy = this.createToy(serialNumber);
        toy.label();
        toy.pack();
        return toy;
        
    }
    public abstract Toy createToy(Integer serialNumber);
}
