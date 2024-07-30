package exercise2;

import java.util.Arrays;
import java.util.Comparator;

public class search {
    public static product linearSearch(product[] products, int targetId) {
        for (product product : products) {
            if (product.getProductId() == targetId) {
                return product;
            }
        }
        return null; 
    }

    public static product binarySearch(product[] products, int targetId) {
        Arrays.sort(products, Comparator.comparingInt(product::getProductId));
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].getProductId() == targetId) {
                return products[mid];
            } else if (products[mid].getProductId() < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; 
    }
}
