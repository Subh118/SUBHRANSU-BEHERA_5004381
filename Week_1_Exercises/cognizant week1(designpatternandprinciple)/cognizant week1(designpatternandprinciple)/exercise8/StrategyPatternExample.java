package exercise8;

// StrategyPatternExample.java
public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay with Credit Card
        PaymentStrategy creditCardPayment = new CreditCardPayment("John Doe", "1234567890123456", "786", "12/23");
        context.setPaymentStrategy(creditCardPayment);
        context.executePayment(250.75);

        // Pay with PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("johndoe@example.com", "password123");
        context.setPaymentStrategy(payPalPayment);
        context.executePayment(89.99);
    }
}
