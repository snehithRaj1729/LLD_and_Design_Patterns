package Open_Close_Principle.With_OCP;

public class OnlineStore {
    public static void main(String args[]){
        PaymentProcessor creditCardProcessor = new CreditCardPaymentProcessor();
        creditCardProcessor.processPayment(100.00);

        PaymentProcessor paypalProcessor = new PaypalPaymentProcessor();
        paypalProcessor.processPayment(200.00);
    }
}
