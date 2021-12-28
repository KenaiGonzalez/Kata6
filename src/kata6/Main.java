package kata6;

import java.util.Scanner;
import toys.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ToyBusiness tb = new ToyBusiness();
        System.out.println("Escribe la orden");
        String line;
        while(!("exit".equals(line = in.nextLine()))){
            switch(line){
                case "car":
                    tb.createCar();
                    break;
                case "helicopter":
                    tb.createHelicopter();
                    break;
                default:
                    System.out.println("Command unknown!");
                    break;
            }
            
        }
    }
    
}
