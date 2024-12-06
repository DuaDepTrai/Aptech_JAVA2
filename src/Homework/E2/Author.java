/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework.E2;

import java.util.Scanner;

/**
 *
 * @author DUADEPTRAI
 */
public class Author {
    private String name;
    private String website;
    private String email;
    private int age;
    
    public Author() {}
    
    public Author(String name, String website, String email, int age) {
        this.name = name;
        this.website = website;
        this.email = email;
        this.age = age;
    }
    
    //Getter
    public String getName() {
        return name;
    }
    
    public String getWebsite() {
        return website;
    }
    
    public String getEmail() {
        return email;
    }
    
    public int getAge() {
        return age;
    }
    
    //Setter
    public void setName(String name) {
        this.name = name;
    }
    
    public void setWebsite(String website) {
        this.website = website;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    //nhapLieu()
    public void nhapLieu() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Author Name: ");
        this.name = scanner.nextLine();
        
        //Nhap lieu website
        boolean validWebsite = false;
        while(!validWebsite) {
            System.out.print("Enter website: ");
            this.website = scanner.nextLine();
            if (isValidWebsite(this.website)) {
                validWebsite = true;
            } else {
                System.out.println("Invalid Website, try again.");
            }
        }
        
        //Nhap lieu email
        boolean validEmail = false;
        while(!validEmail) {
            System.out.print("Enter email: ");
            this.email = scanner.nextLine();
            if (isValidEmail(this.email)) {
                validEmail = true;
            } else {
                System.out.println("Invalid Email, try again");
            }
        }
    }
}
