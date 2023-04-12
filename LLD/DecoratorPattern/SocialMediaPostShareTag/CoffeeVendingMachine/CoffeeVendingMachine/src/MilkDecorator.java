public class MilkDecorator extends CoffeeDecorator {
    
    public MilkDecorator(CoffeeInterface coffee){
        super(coffee);
    }
    
    public String getCoffee(){
        return super.coffee.getCoffee() + " with extra Milk";
    }
}
