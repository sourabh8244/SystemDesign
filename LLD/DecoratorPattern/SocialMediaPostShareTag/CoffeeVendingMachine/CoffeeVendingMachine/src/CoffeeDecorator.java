public abstract class CoffeeDecorator implements CoffeeInterface{
    CoffeeInterface coffee;
    CoffeeDecorator(CoffeeInterface coffee){
        this.coffee = coffee;
    }
}
