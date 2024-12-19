/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework.E17;

/**
 *
 * @author DUADEPTRAI
 */
public class BorrowingRecord {
    private Book book;
    private int borrowedDays;
    private Member member;
    
    public BorrowingRecord(Book book, int borrowedDays, Member member) {
        this.book = book;
        this.borrowedDays = borrowedDays;
        this.member = member;
    }
    
    public Book getBook() {
        return book;
    }
    public int getBorrowedDays() {
        return borrowedDays;
    }
    public Member getMember() {
        return member;
    }
    
    public void setBook(Book book){
        this.book = book;
    }
    public void setBorrowedDays(int borrowedDays) {
        this.borrowedDays = borrowedDays;
    }
    public void setMember(Member member) {
        this.member = member;
    }
}
