package javafiles;

import java.util.List;

public class Machine {
 
    private final List<Products> list;

    public Machine(List<Products> list){
        this.list = list;
    }

    public Products getProductByName(String name){
        for(Products item:this.list){
            if(name.equals(item.getName())){
                return item;
            }
        }
        return null;
        //throw new IllegalStateException("Product not found");
    }

    public List<Products> getAllProducts()
    {
            return this.list;
    }

    //public getProductByCost();

}
