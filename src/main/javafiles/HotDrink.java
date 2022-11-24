package javafiles;

public class HotDrink extends Products {
    
    private Integer temper;

    public HotDrink(String name,  Double cost, Integer temper){
        super(name, cost);
        this.temper = temper;
    }

    public void setTemper(Integer temper){
        this.temper = temper;
    }

    public Integer getTemper(){
        return this.temper;
    }

    @Override
    public String toString() {
        return super.typeName() + " " + this.getName() + " " + this.getCost() + " " + this.getTemper();
    }

}
