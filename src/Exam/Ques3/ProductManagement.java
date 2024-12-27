/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam.Ques3;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author DUADEPTRAI
 */
public class ProductManagement {
    public List<Product> initiateProductList(){
        Product prd1 = new Product("Apple MacBook Air 13 inch", 1500, "Laptop", 5);
        Product prd2 = new Product("IPhone 14 Pro Max 128GB", 1500, "Phone", 10);
        Product prd3 = new Product("Samsung Galaxy Z Fold5 5G 256GB", 2000, "Phone", 5);
        Product prd4 = new Product("Xiaomi Redmi 12 4GB", 200, "Phone", 5);
        Product prd5 = new Product("Lenovo Legion 5", 1500, "Laptop", 10);
        Product prd6 = new Product("Xiaomi Redmi 12C 64GB", 200, "Phone", 5);
        
        return List.of(prd1, prd2, prd3, prd4, prd5, prd6);
    }
    
    public List<Product> getProductWithMinSalePrice(List<Product> products){
        double minSalePrice = products.stream()
                                        .mapToDouble(Product::getSalePrice)
                                        .min()
                                        .orElse(Double.MAX_VALUE);
        return products.stream()
                        .filter(p -> p.getSalePrice() == minSalePrice)
                        .collect(Collectors.toList());
    }
    
    public long countProducts(List<Product> products){
        return products.stream()
                        .filter(p -> p.getOriginalPrice() > 1000)
                        .count();
    }
}
