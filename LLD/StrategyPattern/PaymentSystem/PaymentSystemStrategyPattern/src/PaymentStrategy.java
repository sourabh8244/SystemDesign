public class PaymentStrategy {

    PaymentStrategyInterface paymentMethod;

    PaymentStrategy(PaymentStrategyInterface paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void SetPaymentStrategy(PaymentStrategyInterface selectedMethod){
        this.paymentMethod = selectedMethod;
    }

    public void setParams(){
        paymentMethod.setParameters();
    }

    public void Pay(){
        paymentMethod.executePayment();
    }

}
