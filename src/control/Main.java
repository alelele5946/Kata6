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

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Toy> toys = new ArrayList<>();
        
        Scanner in1 = new Scanner (System.in);
        
        Scanner in = new Scanner(System.in);
        String line = "";
        
        while(!line.equals("exit")){
            line = in.nextLine();
            switch (line){
                
                case "america":
                    line = in.nextLine();
                    AmericanToyFactory americanFactory = new AmericanToyFactory();
                    ToyBusiness business = new ToyBusiness(americanFactory);
                    switch(line){
                        case "car":
                    
                        toys.add((AmericanCarToy)business.createToy(line));
                        System.out.println("Built cars:"+toys.stream()
                                .map(c -> c.toString())).
                                collect(Collectors.joining(", ")));
                            break;
                    
                        case "helicopter":
                    
                            toys.add((AmericanHelicopterToy)business.produceToy(line));
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
                case "asia":
                    line = in.nextLine();
                    AsianToyFactory asianFactory = new AsianToyFactory();
                    ToyBusiness business2 = new ToyBusiness(asianFactory);
                    switch(line){
                        case "car":
                    
                        toys.add((AmericanCarToy)business2.produceToy(line));
                        System.out.println("Built cars:"+toys.stream()
                                .map(c -> c.toString())).
                                collect(Collectors.joining(", ")));
                            break;
                    
                        case "helicopter":
                    
                            toys.add((AmericanHelicopterToy)business2.produceToy(line));
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
                    case "exit":
                            System.out.println("Exit...");
                            break;
                    
                        default:
                            System.out.println("Command unknown");
                            

                    
            

                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
            
            
            
            }
            
        }
        
        
        
    }
    
}
