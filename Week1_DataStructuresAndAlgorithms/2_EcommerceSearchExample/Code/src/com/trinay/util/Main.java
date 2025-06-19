package com.trinay.util;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Headphones", "Electronics"),
                new Product(103, "T-Shirt", "Clothing"),
                new Product(104, "Coffee Maker", "Home Appliance")
        };
        Product result1 = Search.linearSearch(products, 103);
        System.out.println("Linear Search Result: " + result1);
        Arrays.sort(products, (a, b) -> a.productId - b.productId);
        Product result2 = Search.binarySearch(products, 104);
        System.out.println("Binary Search Result: " + result2);
    }
}

