import java.util.Scanner;

public class CashPaymentStrategy implements PaymentStrategyInterface {
    double amount;
    Scanner in = new Scanner(System.in);
    public void setParameters(){
        System.out.print("Enter the amount of cash received: ");
        this.amount = in.nextDouble();
    }

    public void executePayment(){
        System.out.print(amount+" was recieved in cash successfully. Payment Done!!");
    }
}
