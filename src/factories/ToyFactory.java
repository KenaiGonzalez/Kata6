package factories;

import toyproducts.Toy;

public abstract class ToyFactory {
    public final SerialNumberGenerator sng = new SerialNumberGenerator();
    public Toy produceToy(String type){
        Toy toy = this.createToy(type);
        toy.label();
        toy.pack();
        return toy;
        
    }
    public abstract Toy createToy(String type);
}
