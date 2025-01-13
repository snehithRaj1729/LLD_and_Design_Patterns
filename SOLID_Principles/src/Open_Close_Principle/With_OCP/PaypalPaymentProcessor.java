package Open_Close_Principle.With_OCP;

public class PaypalPaymentProcessor extends PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment through paypal");
    }
}
