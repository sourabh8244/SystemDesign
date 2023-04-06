import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1 for payment using Card, 2 for Cash ");
        int payMethod = in.nextInt();

        PaymentMethodResolver paymentMethodResolver = new PaymentMethodResolver();
        
        paymentMethodResolver.Add();
        paymentMethodResolver.Resolve(payMethod-1);
        

        in.close();
    }
}
