public class App {
    public static void main(String[] args) throws Exception {
        CoffeeInterface coffee = new EspressoCoffee();
        System.out.println(coffee.getCoffee());
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getCoffee());
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getCoffee());
        coffee = new RemoveAllDecorator(coffee);
        System.out.println(coffee.getCoffee());
    }
}
