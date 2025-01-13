package Open_Close_Principle.Without_OCP;


//Every time a new payment method is introduced class needs to be modified
public class PaymentProcessor {

    public void processPayment(String paymentType,double amount){
        if(paymentType.equalsIgnoreCase("Creditcard")) {
            System.out.println("Processing credit card payment");
        } else if (paymentType.equalsIgnoreCase("Paypal")) {
            System.out.println("Processing payment through paypal");
        }
        else {
            System.out.println("Unsupported payment type");
        }
    }
}
