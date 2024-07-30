package exercise8;

// CreditCardPayment.java
public class CreditCardPayment implements PaymentStrategy {
    @SuppressWarnings("unused")
    private String name;
    @SuppressWarnings("unused")
    private String cardNumber;
    @SuppressWarnings("unused")
    private String cvv;
    @SuppressWarnings("unused")
    private String expiryDate;

    public CreditCardPayment(String name, String cardNumber, String cvv, String expiryDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid with credit card.");
    }
}

