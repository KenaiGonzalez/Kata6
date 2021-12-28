package toys;

public class ToyBusiness {
    private final SerialNumberGenerator sng;

    public ToyBusiness() {
        this.sng = new SerialNumberGenerator();
    }
    
    public Car createCar(){
        Car car = new Car(sng.next());
        car.label();
        car.pack();
        return car;
    }
    
    public Helicopter createHelicopter(){
        Helicopter helicopter = new Helicopter(sng.next());
        helicopter.label();
        helicopter.pack();
        return helicopter;
    }
}
