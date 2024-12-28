/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E.Q3;

import java.util.*;

/**
 *
 * @author DUADEPTRAI
 */
public class Main {
    public static void main(String[] args) {
        ProductManagement pm = new ProductManagement();
        List<Product> products = pm.initiateProductList();

        long numberProducts = pm.countProducts(products);
        System.out.println ("Products count: " + numberProducts);
        
        List<Product> minSalePriceProduct = pm.getProductWithMinSalePrice(products);
        System.out.println("Products with min sale price:");
        minSalePriceProduct.forEach(System.out::println);
    }    
}
