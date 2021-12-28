package kata6;

import java.util.Scanner;
import business.ToyBusiness;
import factories.regionalfactories.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Seleccionar modelo asiatico o americano");
        String line;
        ToyBusiness tb = new ToyBusiness();
        boolean elegido = false;
        while(!elegido){
            line = in.nextLine();
            
            switch(line){
                case "asiatico":
                    tb.add("car", new AsianCarToyFactory());
                    tb.add("helicopter",new AsianHelicopterToyFactory());
                    elegido = true;
                    break;
                case "americano":
                    tb.add("car", new AmericanCarToyFactory());
                    tb.add("helicopter",new AmericanHelicopterToyFactory());
                    elegido = true;
                    break;
                    
            }
        }
       
        System.out.println("Escribe la orden: car( crear coche ),"
                + " helicopter( crear helicoptero ), exit:");
        
        while(!("exit".equals(line = in.nextLine()))){
            switch(line){
                case "car":
                case "helicopter":
                    tb.produceToy(line);
                    break;
                default:
                    System.out.println("Command unknown!");
                    break;
            }
            
        }
    }
    
}
