package control;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;
import factories.SerialNumberGenerator;
import business.ToyBusiness;
import factories.regionalfactories.AmericanToyFactory;
import factories.regionalfactories.AsianToyFactory;
import toyproducts.Toy;

public class Main {

    public static void main(String[] args) {
        
       ToyBusiness business = new ToyBusiness(new AmericanToyFactory());
       ArrayList<Toy> toys;
        toys = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String line = "";
        while(!line.equals("exit")){
            line = in.nextLine();
            
            switch (line){
                case "car":
                case "helicopter":
                    toys.add(business.produceToy(line));
                    System.out.println(
                            "Built toys: "+ toys.stream()
                                    .map(c -> c.toString())
                                    .collect(Collectors.joining(", ")));
                    break;
                
                case "exit":
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Command unknown!");
                    
            
            
            
            }
        
        
        
        }
        
        
    }
    
}
