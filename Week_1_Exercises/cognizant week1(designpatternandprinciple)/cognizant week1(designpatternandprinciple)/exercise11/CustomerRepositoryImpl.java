package exercise11;

// CustomerRepositoryImpl.java
public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public Customer findCustomerById(String customerId) {
        // Simulating database lookup
        return new Customer(customerId, "John Doe");
    }
}
