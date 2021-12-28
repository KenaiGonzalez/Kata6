package kata6;

import java.util.Scanner;
import toys.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SerialNumberGenerator sng = new SerialNumberGenerator();
        System.out.println("Escribe la orden");
        String line;
        while(!("exit".equals(line = in.nextLine()))){
            switch(line){
                default:
                    Car car = new Car(sng.next());
                    car.label();
                    car.pack();
            }
            
        }
    }
    
}
