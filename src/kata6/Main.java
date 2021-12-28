package kata6;

import branches.*;
import java.util.Scanner;
import business.ToyBusiness;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Seleccionar modelo asiatico o americano");
        String line;
        ToyBusiness tb = null;
        boolean elegido = false;
        while(!elegido){
            line = in.nextLine();
            switch(line){
                case "asiatico":
                    tb = new AsianToyBusiness();
                    elegido = true;
                    break;
                case "americano":
                    tb = new AmericanToyBusiness();
                    elegido = true;
                    break;
            }
        }
       
        System.out.println("Escribe la orden");
        
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
