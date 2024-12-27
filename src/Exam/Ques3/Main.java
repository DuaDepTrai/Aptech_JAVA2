/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam.Ques3;

import java.util.*;

/**
 *
 * @author DUADEPTRAI
 */
public class Main {
    public static void main(String[] args) {
        ProductManagement pm = new ProductManagement();
        List<Product> products = pm.initiateProductList();
        
        long countProducts = pm.countProducts(products);
        System.out.println("Products count: " + countProducts);
        
        List<Product> minPriceProducts = pm.getProductWithMinSalePrice(products);
        System.out.println("Products with min sale price:");
        minPriceProducts.forEach(System.out::println);
    }
}
