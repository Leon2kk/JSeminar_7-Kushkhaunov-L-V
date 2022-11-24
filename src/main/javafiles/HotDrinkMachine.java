package javafiles;

import java.util.List;

public class HotDrinkMachine extends Machine {
 
    public HotDrinkMachine(List<Products> list){
        super(list);
    }

      public Products getProduct(String name, Double cost, Integer temper){
        for(Products item: super.getAllProducts()){
            if ( item instanceof HotDrink){
                HotDrink newitem = (HotDrink) item;
                if(name.equals(newitem.getName()) && cost.equals(newitem.getCost()) && temper.equals(newitem.getTemper())){
                    return item;
                }
            }
        }
       
        return null;
        //throw new IllegalStateException("Hot Drink not found");
    }
}
