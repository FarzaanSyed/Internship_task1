package Task-2;

import java.util.Set;
import java.util.TreeSet;

public class SortedProductPrices {
    public static void main(String[] args) {

        Set<Double> productPrices = new TreeSet<>();

        productPrices.add(992.69);
        productPrices.add(899.99);
        productPrices.add(598.30);
        productPrices.add(899.20);
        productPrices.add(869.89);
        productPrices.add(839.29);

        // Display sorted prices
        System.out.println("Sorted Product Prices:");
        for (Double price : productPrices) {
            System.out.println(price);
        }
    }
}