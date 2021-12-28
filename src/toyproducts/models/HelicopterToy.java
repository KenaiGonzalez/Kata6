package toyproducts.models;

public class HelicopterToy implements toyproducts.Toy{
    private final Integer serialNumber;
    private final String type = "helicopter";

    public HelicopterToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public void pack(){
        System.out.println("Packing Helicopter " + this.serialNumber);
    }

    @Override
    public void label(){
        System.out.println("Labelling Helicopter " + this.serialNumber);
    }
}
