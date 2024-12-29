public class PaymentToMerchant extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Payment to a merchant: Request validated");
    }

    @Override
    public void calculateFees() {
        System.out.println("Payment to a merchant: Fee is 2%");
    }

    @Override
    public void debitAmount() {
        System.out.println("Payment to a merchant: Amount debited");
    }

    @Override
    public void creditAmount() {
        System.out.println("Payment to a merchant: Amount credited");
    }
}
