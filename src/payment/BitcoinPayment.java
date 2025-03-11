package payment;

    public class BitcoinPayment implements PaymentStrategy{
    private String walletAddress;

    public BitcoinPayment(String walletAddress){
        this.walletAddress=walletAddress;
    }
    @Override
    public void pay(double amount){
        System.out.println(amount+"has been paid with bitcoin");
    }

    @Override
    public String getPaymentDetails(){
        return "paid with bitcoin"+walletAddress;
    }
}
