package toys;

public class Helicopter {
    private final Integer serialNumber;
    private final String type = "helicopter";

    public Helicopter(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void pack(){
        System.out.println("Packing Helicopter " + this.serialNumber);
    }

    public void label(){
        System.out.println("Labelling Helicopter " + this.serialNumber);
    }
}
