package exercise8;

// PayPalPayment.java
public class PayPalPayment implements PaymentStrategy {
    @SuppressWarnings("unused")
    private String emailId;
    @SuppressWarnings("unused")
    private String password;

    public PayPalPayment(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid using PayPal.");
    }
}
