public abstract class PaymentFlow {
    public abstract void validateRequest();
    public abstract void calculateFees();
    public abstract void debitAmount();
    public abstract void creditAmount();

    public final void sendMoney(){
        validateRequest(); //step 1
        debitAmount(); //step 2
        calculateFees(); //step 3
        creditAmount(); //step 4
    }
}
