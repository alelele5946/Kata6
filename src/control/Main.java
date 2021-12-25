package control;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.models.AmericanCarToy;
import toyproducts.models.AmericanHelicopterToy;
import toys.SerialNumberGenerator;
import business.ToyBusiness;
import business.branches.AmericanToyBusiness;

public class Main {

    public static void main(String[] args) {
        AmericanToyBusiness business = new AmericanToyBusiness();
        ArrayList<Toy> toys = new ArrayList<>();
        
        
        
        
        Scanner in = new Scanner(System.in);
        String line = "";
        while(!line.equals("exit")){
            line = in.nextLine();
            switch (line){
                case "car":
                    
                    toys.add((AmericanCarToy)business.createToy(line));
                    System.out.println("Built cars:"+toys.stream()
                            .map(c -> c.toString())).
                            collect(Collectors.joining(", ")));
                    break;
                    
                case "helicopter":
                    
                    toys.add((AmericanHelicopterToy)business.createToy(line));
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
