package kata6;

import java.util.Scanner;
import toys.ToyBusiness;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ToyBusiness tb = new ToyBusiness();
        System.out.println("Escribe la orden");
        String line;
        while(!("exit".equals(line = in.nextLine()))){
            switch(line){
                case "car":
                    tb.createToy("car");
                    break;
                case "helicopter":
                    tb.createToy("helicopter");
                    break;
                default:
                    System.out.println("Command unknown!");
                    break;
            }
            
        }
    }
    
}
