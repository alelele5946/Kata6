package control;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.models.CarToy;
import toyproducts.models.HelicopterToy;
import toys.SerialNumberGenerator;
import toys.ToyBusiness;

public class Main {

    public static void main(String[] args) {
        ToyBusiness business = new ToyBusiness();
        ArrayList<Toy> toys = new ArrayList<>();
        
        
        
        
        Scanner in = new Scanner(System.in);
        String line = "";
        while(!line.equals("exit")){
            line = in.nextLine();
            switch (line){
                case "car":
                    
                    toys.add((CarToy)business.createToy(line));
                    System.out.println("Built cars:"+toys.stream()
                            .map(c -> c.toString())).
                            collect(Collectors.joining(", ")));
                    break;
                    
                case "helicopter":
                    
                    toys.add((HelicopterToy)business.createToy(line));
                    System.out.println("Built helicopter:"+toys.stream()
                            .map(c -> c.toString())).
                            collect(Collectors.joining(", ")));
                    
                    break;
                    
                case "exit":
                    System.out.println("Exit...");
                    break;
                    
                default:
                    System.out.println("Command unknown");
                    
            
            
            
            
            
            }
            
        }
    }
    
}
