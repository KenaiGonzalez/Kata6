package business;

import factories.SerialNumberGenerator;
import factories.ToyFactory;
import java.util.HashMap;
import java.util.Map;
import toyproducts.Toy;

public class ToyBusiness {
    private final SerialNumberGenerator sng;
    private final Map<String,ToyFactory> toyFactories; 
    public ToyBusiness(){
        this.toyFactories = new HashMap<>();
        sng = new SerialNumberGenerator();
    }
    public Toy produceToy(String name){
        return toyFactories.get(name).produceToy(sng.next());
    }
    
    public void add(String name, ToyFactory f){
        toyFactories.put(name, f);
    }
}
