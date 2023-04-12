public class SugarDecorator extends CoffeeDecorator {
    
    public SugarDecorator(CoffeeInterface coffee){
        super(coffee);
    }
    
    public String getCoffee(){
        return super.coffee.getCoffee() + " with extra Sugar";
    }
}