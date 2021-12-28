package business;

public class SerialNumberGenerator {
    private Integer serialNumber;
    
    public SerialNumberGenerator(){
        this.serialNumber = 0;
    }
    
    public Integer next(){
        return serialNumber++;
    }
}
