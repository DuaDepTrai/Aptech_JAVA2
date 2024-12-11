/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework.E3;

import java.util.*;

/**
 *
 * @author Admin
 */
public class LyricSet {
     private static final String[] lyric = {"you", "say", "it", "best",
                         "when", "you", "say", "nothing", "at", "all"};
   
    public static void main(String[] args) {
        // Create a set from HashSet that’s implemented Set
        Set words1 = new HashSet();        
     // Add all words to set
        for (String w : lyric)
            words1.add(w);
       
        // Traverse the list
        // NOTICE: set doesn't allow duplicate items
        System.out.print("HashSet:\t");
        for (Object o : words1)
            System.out.print(o + " ");
        System.out.println();
        
        // Create a set from HashSet that’s implemented Set
        Set words2 = new LinkedHashSet();        
     // Add all words to set
        for (String w : lyric)
            words2.add(w);
       
        // Traverse the list
        // NOTICE: set doesn't allow duplicate items
        System.out.print("LinkedHashSet:\t");
        for (Object o : words2)
            System.out.print(o + " ");
        System.out.println();
        
        // Create a set from HashSet that’s implemented Set
        Set words3 = new TreeSet();        
     // Add all words to set
        for (String w : lyric)
            words3.add(w);
       
        // Traverse the list
        // NOTICE: set doesn't allow duplicate items
        System.out.print("TreeSet:\t");
        for (Object o : words1)
            System.out.print(o + " ");
        System.out.println("\n------------------");
               
        System.out.println("Contains [you]?:" + words1.contains("you"));
        System.out.println("Contains [me]?:" + words1.contains("me"));
        System.out.println("\n------------------");
        
        //Get index of words
        Set<String> words4 = new LinkedHashSet<>();
        Collections.addAll(words4, lyric);
        
        List<String> wordList = new ArrayList<>(words4);
        
        System.out.println("Index of 'say': " + wordList.indexOf("say"));
        System.out.println("Index of 'you': " + wordList.indexOf("you"));
    }

}
