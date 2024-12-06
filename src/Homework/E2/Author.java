/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework.E2;

import java.util.Scanner;
import java.util.regex.*;

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
    
    //Input data
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Author Name: ");
        this.name = scanner.nextLine();
        
        //Input website
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
        
        //Input email
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
        
        //Input age
        boolean validAge = false;
        while(!validAge) {
            System.out.print("Enter age: ");
            this.age = scanner.nextInt();
            if (this.age > 20) {
                validAge = true;
            } else {
                System.out.println("Age must be > 20, try again");
            }
        }
    }
    
    //Display information
    public void displayInformation() {
        System.out.println(this.toString());
    }
    
    @Override
    public String toString() {
        return "-----\nAuthor: " + this.name + "\n" +
                "Website: " + this.website +"\n" +
                "Email: " + this.email + "\n" +
                "Age: " + this.age;
    }
    
    //Check validate website
    private boolean isValidWebsite(String website) {
        String regex = "^(http://|https://)?(www\\.)?([a-zA-Z0-9]+)\\.(com|net|org|edu|gov)$";
        Pattern pat = Pattern.compile(regex);
        Matcher matcher = pat.matcher(website);
        return matcher.matches();
    }
    
    //Check validate email
    private boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pat = Pattern.compile(regex);
        Matcher matcher = pat.matcher(email);
        return matcher.matches();
    }
    
    public static void main(String[] args) {
        //Create object & input data
        Author author = new Author();
        author.inputData();
        
        // Display information
        author.displayInformation();
    }
}
