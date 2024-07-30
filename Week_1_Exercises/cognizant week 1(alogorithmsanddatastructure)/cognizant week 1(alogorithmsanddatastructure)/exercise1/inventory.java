package exercise1;
import java.util.HashMap;
import java.util.Map;

public class inventory {
    private Map<Integer, product> products;

    public inventory() {
        this.products = new HashMap<>();
    }

    public void addProduct(product product) {
        if (products.containsKey(product.getProductId())) {
            System.out.println("Product already exists.");
        } else {
            products.put(product.getProductId(), product);
            System.out.println("Product " + product.getProductName() + " added successfully.");
        }
    }

    public void updateProduct(int productId, Integer quantity, Double price) {
        product product = products.get(productId);
        if (product != null) {
            if (quantity != null) {
                product.setQuantity(quantity);
            }
            if (price != null) {
                product.setPrice(price);
            }
            System.out.println("Product " + productId + " updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int productId) {
        if (products.containsKey(productId)) {
            products.remove(productId);
            System.out.println("Product " + productId + " deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public product getProduct(int productId) {
        return products.get(productId);
    }

    public static void main(String[] args) {
        inventory inventory = new inventory();

        product product1 = new product(1, "Laptop", 10, 1500.00);
        product product2 = new product(2, "Smartphone", 20, 700.00);

        inventory.addProduct(product1);
        inventory.addProduct(product2);

        inventory.updateProduct(1, 15, null);
        inventory.deleteProduct(2);

        System.out.println(inventory.getProduct(1));
        System.out.println(inventory.getProduct(2));
    }
}
