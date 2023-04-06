import java.util.ArrayList;
public class PaymentMethodResolver {
    ArrayList<PaymentStrategy> paymentMethods = new ArrayList<PaymentStrategy>();
    
    public void Add(){
        PaymentStrategy e = new PaymentStrategy(null);
        e.SetPaymentStrategy(new CardPaymentStrategy());
        paymentMethods.add(e);
        e.SetPaymentStrategy(new CashPaymentStrategy());
        paymentMethods.add(e);
    }

    public void Resolve(int paymentMethodIndex){
        PaymentStrategy paymentMethod = paymentMethods.get(paymentMethodIndex);
        paymentMethod.setParams();
        paymentMethod.Pay();
    
    /*paymentMethod.Pay();
    */
    }
}
