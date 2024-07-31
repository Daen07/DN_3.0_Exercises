package StrategyPatternExample;

public class StrategyTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment(100.0); // Should print paying with Credit Card

        context.setPaymentStrategy(new PayPalPayment());
        context.executePayment(200.0); // Should print paying with PayPal
    }
}
