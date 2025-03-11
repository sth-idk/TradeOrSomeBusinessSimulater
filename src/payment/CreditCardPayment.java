package payment;

public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber , String cardHolderName){
        this.cardNumber=cardNumber;
        this.cardHolderName=cardHolderName;
    }

    @Override
    public void pay(double amount){
        System.out.println(amount+"has been paid with credit card");
    }

    @Override
    public String getPaymentDetails() {
        return "paid with credit card"+cardHolderName+cardNumber;
    }
}
