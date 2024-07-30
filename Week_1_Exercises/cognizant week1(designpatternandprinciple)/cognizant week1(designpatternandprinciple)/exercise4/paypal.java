package exercise4;


class PayPal {
    public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal.");
    }
}

class Stripe {
    public void charge(double amount) {
        System.out.println("Charging $" + amount + " through Stripe.");
    }
}

class Square {
    public void completePayment(double amount) {
        System.out.println("Completing payment of $" + amount + " through Square.");
    }
}
