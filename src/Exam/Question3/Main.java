/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam.Question3;

import java.util.List;

/**
 *
 * @author DUADEPTRAI
 */
public class Main {
    public static void main(String[] args) {
        ProductManagement pm = new ProductManagement();
        
        List<Product> products = pm.initiateProductList();
        
        long countProducts = pm.countProducts(products);
        System.out.println("Number of products > $1000: " + countProducts);
        
        List<Product> getMinPriceProducts = pm.getProductWithMinSalePrice(products);
        System.out.println("List of products with min sale price: ");
        getMinPriceProducts.forEach(System.out::println);
    }
}
