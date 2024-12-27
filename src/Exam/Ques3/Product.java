/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam.Ques3;

/**
 *
 * @author DUADEPTRAI
 */
public class Product {
    private String name;
    private double originalPrice;
    private String category;
    private double percentDiscount;
    
    public Product(String name, double originalPrice, String category, double percentDiscount){
        this.name = name;
        this.originalPrice = originalPrice;
        this.category = category;
        this.percentDiscount = percentDiscount;
    }
    
    public String getName(){return name;}
    public double getOriginalPrice(){return originalPrice;}
    public String getCategory(){return category;}
    public double getPercentDiscount(){return percentDiscount;}
    public double getSalePrice(){return originalPrice*(1-percentDiscount/100);}
    
    public void setName(String name){this.name = name;}
    public void setOriginalPrice(double originalPrice){this.originalPrice = originalPrice;}
    public void setCategory(String category){this.category = category;}
    public void setPercentDiscount(double percentDiscount){this.percentDiscount = percentDiscount;}
    
    @Override
    public String toString(){return "Name = " + name;}
}
