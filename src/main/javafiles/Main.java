package javafiles;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args){
        
        List<Products> list = new ArrayList<Products>();

        list.add(new Products("Snikers", 10.5));
        list.add(new Products("Bounty", 10.5));
        Machine machine = new Machine(list);
        System.out.println(machine.getProductByName("Snikers"));

        //DZ
        List<Products> list2 = new ArrayList<Products>();
        list2.add(new HotDrink("Coffe", 5.5, 54));
        list2.add(new HotDrink("Tea", 10.5, 40));
        HotDrinkMachine machine2 = new HotDrinkMachine(list2); 
        System.out.println(machine2.getProduct("Coffe", 5.5, 54));
    }
}