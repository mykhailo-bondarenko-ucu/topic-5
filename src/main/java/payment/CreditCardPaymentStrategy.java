package payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public boolean pay(double price) {
        System.out.format("Received a Credit Card payment: %f\n", price);
        return true;
    }
}
