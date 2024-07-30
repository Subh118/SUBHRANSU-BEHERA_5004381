package exercise5;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        
        Notifier slackAndSmsNotifier = new SlackNotifierDecorator(smsNotifier);

        System.out.println("Sending with EmailNotifier only:");
        emailNotifier.send("Hello!");

        System.out.println("\nSending with SMSNotifierDecorator:");
        smsNotifier.send("Hello!");

        System.out.println("\nSending with SlackNotifierDecorator:");
        slackAndSmsNotifier.send("Hello!");
    }
}
