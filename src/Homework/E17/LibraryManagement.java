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
public class LibraryManagement {
    public List<BorrowingRecord> initializeRecords() {
        Book book1 = new Book("To Kill a Mockingbird", 281, "Harper Lee");
        Book book2 = new Book("1984", 328, "George Orwell");
        Book book3 = new Book("The Great Gatsby", 180, "F. Scott Fitzgerald");
        Book book4 = new Book("Pride and Prejudice", 279, "Jane Austen");
        Book book5 = new Book("Moby Dick", 635, "Herman Melville");

        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");
        Member member3 = new Member("Charlie", "M003");
        Member member4 = new Member("David", "M004");
        Member member5 = new Member("Emma", "M005");

        BorrowingRecord record1 = new BorrowingRecord(book1, 14, member1);
        BorrowingRecord record2 = new BorrowingRecord(book2, 7, member2);
        BorrowingRecord record3 = new BorrowingRecord(book3, 21, member3);
        BorrowingRecord record4 = new BorrowingRecord(book4, 3, member4);
        BorrowingRecord record5 = new BorrowingRecord(book5, 10, member5);
        
        return List.of(record1, record2, record3, record4, record5);
    }
    
    public BorrowingRecord getLongestBorrowed(List<BorrowingRecord> records) {
        return records.stream()
                .max((r1, r2) -> Integer.compare(r1.getBorrowedDays(), r2.getBorrowedDays()))
                .orElse(null);
    }
    
    public BorrowingRecord getShortestBorrowed(List<BorrowingRecord> records) {
        return records.stream()
                .min((r1, r2) -> Integer.compare(r1.getBorrowedDays(), r2.getBorrowedDays()))
                .orElse(null);
    }
    
    public long countTotalBooks(List<BorrowingRecord> records) {
        return records.stream()
                .map(BorrowingRecord::getBook)
                .distinct()
                .count();
    }
}
