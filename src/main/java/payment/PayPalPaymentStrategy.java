package payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        System.out.format("Received a PayPal payment: %f\n", price);
        return true;
    }
}
