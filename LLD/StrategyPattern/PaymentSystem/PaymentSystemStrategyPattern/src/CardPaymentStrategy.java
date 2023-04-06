import java.util.Scanner;

public class CardPaymentStrategy implements PaymentStrategyInterface {
    int cardNumber;
    int cvv;
    double amount;

    Scanner in = new Scanner(System.in);

    public void setParameters(){
        System.out.print("Input Card Number: ");
        this.cardNumber = in.nextInt();
        System.out.print("Input CVV: ");
        this.cvv = in.nextInt();
        System.out.print("Enter the payment amount: ");
        this.amount = in.nextDouble();
    }

    public void executePayment(){
        Pay(amount);
    }

    public void Pay(double amount){
        System.out.println(amount+" was paid using Card :"+cardNumber);
    }
}
