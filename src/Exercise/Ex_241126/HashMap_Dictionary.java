/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241126;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author ADMIN
 */
public class HashMap_Dictionary {
    //private Map<String, String> data = new TreeMap<String, String>();
    private Map<String, String> data = new HashMap<String, String>();
    
    public String addWord(String key, String value) {
        return this.data.put(key, value);
    }
    
    public String deleteWord(String key) {
        return this.data.remove(key);
    }
    
    public String findWord(String key) {
        String value = this.data.get(key);
        return value;
    }
    
    public void displayKey() {
        ArrayList<String> allKey = new ArrayList<>(this.data.keySet());        
        for (String key : allKey) {
            System.out.println(key + ": " + this.data.get(key));
        }
    }
    
    public int amount() {
        return this.data.size();
    }
    
    public void clearDictionary() {
        this.data.clear();
    }
    
    public static void main(String[] args) {
        HashMap_Dictionary Dictionary = new HashMap_Dictionary();
        Scanner scanner = new Scanner(System.in);
        int pick;
        
        do {
            System.out.println("-----\nMENU:");
            System.out.println("1. Add Word");
            System.out.println("2. Delete Word");
            System.out.println("3. Find Word");
            System.out.println("4. Display All Words");
            System.out.println("5. Show Amount of Words");
            System.out.println("6. Clear Dictionary");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            pick = scanner.nextInt();scanner.nextLine();
            
            switch (pick) {
                case 1:
                    System.out.print("Enter key: ");
                    String key = scanner.nextLine().trim();
                    System.out.print("Enter value: ");
                    String value = scanner.nextLine().trim();
                    Dictionary.addWord(key, value);
                    break;
                case 2:
                    System.out.print("Enter key: ");
                    String keyDeleted = scanner.nextLine().trim();
                    Dictionary.deleteWord(keyDeleted);
                    break;
                case 3:
                    System.out.print("Enter key: ");
                    String keyFind = scanner.nextLine().trim();
                    System.out.println(keyFind + ": " + Dictionary.findWord(keyFind));
                    break;
                case 4:
                    Dictionary.displayKey();
                    break;
                case 5:
                    System.out.println("Amount of All Words: " + Dictionary.amount());
                    break;
                case 6:
                    Dictionary.clearDictionary();
                    break;
                case 7:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid chosen, please try again.");
            }
        } while (pick != 7);
        
        scanner.close();
    }
}
