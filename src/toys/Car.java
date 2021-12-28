package toys;

public class Car {
    private final Integer serialNumber;
    private final String type = "car";

    public Car(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public void pack(){
        System.out.println("Packing car " + this.serialNumber);
    }
    
    public void label(){
        System.out.println("Labelling car " + this.serialNumber);
    }
}
