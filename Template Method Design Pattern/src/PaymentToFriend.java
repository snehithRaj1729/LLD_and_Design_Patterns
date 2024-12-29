public class PaymentToFriend extends PaymentFlow{

    @Override
    public void validateRequest() {
        System.out.println("Payment to a friend: Request validated");
    }

    @Override
    public void calculateFees() {
        System.out.println("Payment to a friend fee is 0%");
    }

    @Override
    public void debitAmount() {
        System.out.println("Payment to a friend: Amount debited");
    }

    @Override
    public void creditAmount() {
        System.out.println("Payment to a friend: Amount credited");
    }
}
