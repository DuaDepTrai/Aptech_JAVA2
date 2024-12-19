/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework.E17;

import java.util.List;

/**
 *
 * @author DUADEPTRAI
 */
public class Main {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();
        
        List<BorrowingRecord> records = library.initializeRecords();
        
        BorrowingRecord longestBorrowed = library.getLongestBorrowed(records);
        System.out.println("Longest Borrowed: " + longestBorrowed.getBook().getTitle()
                            + " - Borrowed Days: " + longestBorrowed.getBorrowedDays());
        
        BorrowingRecord shortestBorrowed = library.getShortestBorrowed(records);
        System.out.println("Shortest Borrowed: " + shortestBorrowed.getBook().getTitle()
                            + " - Borrowed Days: " + shortestBorrowed.getBorrowedDays());
        
        long totalBooks = library.countTotalBooks(records);
        System.out.println("Total Books Borrowed: " + totalBooks);
    }
}
