package toyproducts.models;

public class CarToy implements toyproducts.Toy {
    private final Integer serialNumber;
    private final String type = "car";

    public CarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    @Override
    public void pack(){
        System.out.println("Packing car " + this.serialNumber);
    }
    
    @Override
    public void label(){
        System.out.println("Labelling car " + this.serialNumber);
    }

   

    
}
