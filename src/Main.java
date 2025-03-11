import payment.*;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new RegularCustomer("Farya the First");
        customer1.displayCustomerInfo();
        PaymentStrategy process1Customer1 = new BitcoinPayment("1Lbcfr7sAHTD9CgdQo3HTMTkV8LK4ZnX71");
        PaymentStrategy process2Customer1 = new CreditCardPayment("1111110000101010001101" , "Farya the Ninth");
        process1Customer1.getPaymentDetails();
        process1Customer1.pay(1200.0);
        process2Customer1.getPaymentDetails();
        process2Customer1.pay(200.0);


        System.out.println();

        Customer customer2 = new PremiumCustomer("Farya the Fifth");
        customer2.displayCustomerInfo();
        PaymentStrategy process1Customer2 = new CreditCardPayment("0101001100101000" , "Farya the Third");
        PaymentStrategy process2Customer2 = new PayPalPayment("Farya.ILoveMySugerMummyFaryaTheThird@gmail.com");
        process1Customer2.getPaymentDetails();
        process1Customer2.pay(3000.0);
        process2Customer2.getPaymentDetails();
        process2Customer2.pay(468.0);

        System.out.println();

        Customer customer3 = new RegularCustomer("Farya the Second");
        customer3.displayCustomerInfo();
        PaymentStrategy process1Customer3 = new PayPalPayment("FaryaTheSecond.theGreatestFaryaOutThere@gmail.com");
        PaymentStrategy process2Customer3 = new BitcoinPayment("3FZbgi29cpjq2GjdwV***HuJJnkLtktZc5");
        process1Customer3.getPaymentDetails();
        process1Customer3.pay(560.0);
        process2Customer3.getPaymentDetails();
        process2Customer3.pay(986.0);
    }
}
