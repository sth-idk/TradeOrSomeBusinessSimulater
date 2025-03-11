package payment;

public class PayPalPayment implements PaymentStrategy{
    private String email;

    public PayPalPayment(String email){
        this.email=email;
    }

    @Override
    public void pay(double amount){

        System.out.println(amount+"has been paid with paypal");
    }

    @Override
    public String getPaymentDetails(){
        return "paid with paypal"+email;
    }
}
