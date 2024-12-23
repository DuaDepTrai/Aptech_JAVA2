/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework.E4;

import java.util.*;
import java.util.function.Predicate;

/**
 *
 * @author DUADEPTRAI
 */
public class GenericCode {
//    1. Kiem tra hai mang co giong nhau khong
    public static <T> boolean areArraysEqual(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i< arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
    
//    2. Tinh tong so chan va le
    public static <T extends Number> Map<String, Integer> sumEvenAndOdd(List<T> numbers) {
        int evenSum = 0, oddSum = 0;
        for (T num : numbers) {
            if (num.intValue() % 2 == 0) {
                evenSum += num.intValue();
            } else {
                oddSum += num.intValue();
            }
        }
        
        Map<String, Integer> result = new HashMap<>();
        result.put("EvenSum", evenSum);
        result.put("OddSum", oddSum);
        return result;
    }
    
//    3. Tim vi tri dau tien cua phan tu
    public static <T> int findFirstIndex(List<T> list, T target) {
        return list.indexOf(target);
    }
    
//    4. Dao nguoc danh sach
    public static <T> List<T> reverseList(List<T> list) {
        List<T> reversed = new ArrayList<>(list);
        Collections.reverse(reversed);
        return reversed;
    }
    
//    5. Gop hai danh sach xen ke
    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        List<T> merged = new ArrayList<>();
        int size = Math.max(list1.size(), list2.size());
        for (int i=0; i<size; i++) {
            if (i < list1.size()) merged.add(list1.get(i));
            if (i < list2.size()) merged.add(list2.get(i));
        }
        return merged;
    }
    
//    6. Loc danh sach theo dieu kien
    public static <T> List<T> filterByPredicate(List<T> list, Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();
        for (T item : list) {
            if (predicate.test(item)) {
                filtered.add(item);
            }
        }
        return filtered;
    }
    
//    7. In cac cap key-value trong map
    public static <K, V> void printMap(Map<K, V> map) {
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
    
//    Main
    public static void main(String[] args) {
        Group<Integer> groupInt = new Group<>(Integer.class, 100);
        Group<String> groupStr = new Group<>(String.class, 100);
        
        groupInt.addItem(1);
        groupInt.addItem(2);
        System.out.println("Item at index 1 in groupInt: " + groupInt.getItem(1));
        System.out.println("Number of items in groupInt: " + groupInt.getNumberItems());
        
        //Su dung cac generic method
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {1, 2, 4};
        System.out.println("Arrays equal: " + areArraysEqual(arr1, arr2));
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum of even and odd: " + GenericCode.sumEvenAndOdd(numbers));
        
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        System.out.println("First index of 'Bob': " + GenericCode.findFirstIndex(names, "Bob"));
        
        System.out.println("Reversed List: " + GenericCode.reverseList(names));
        
        List<String> list1 = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("1", "2", "3");
        System.out.println("Merged list: " + GenericCode.mergeLists(list1, list2));
        
        System.out.println("Filtered list (Length > 3): " + GenericCode.filterByPredicate(names, s -> s.length() > 3));
        
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        GenericCode.printMap(map);
    }
}
