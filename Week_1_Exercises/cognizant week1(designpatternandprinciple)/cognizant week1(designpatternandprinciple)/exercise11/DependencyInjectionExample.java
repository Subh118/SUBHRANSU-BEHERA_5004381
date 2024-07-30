package exercise11;

// DependencyInjectionExample.java
public class DependencyInjectionExample {
    public static void main(String[] args) {
        // Create a repository instance
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find a customer
        Customer customer = customerService.getCustomerById("123");
        System.out.println(customer);
    }
}
