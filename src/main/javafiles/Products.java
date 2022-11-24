package javafiles;

public class Products {
    
    private String name;
    private Double cost;

    public Products(String name,  Double cost){
        this.name = name;
        this.cost = cost;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setCost(Double cost){
        this.cost = cost;
    }

    public Double getCost(){
        return this.cost;
    }
    
    public String typeName(){
        return "type(" + this.getClass() + ")";
    }

    @Override
    public String toString() {
        return this.typeName() + " " + this.getName() + " " + this.getCost();
    }

    

}
