public class RemoveAllDecorator extends CoffeeDecorator {
    
    public RemoveAllDecorator(CoffeeInterface coffee){
        super(coffee);
    }
    
    public String getCoffee(){
        return "This coffee is deprecated!";
    }
}
