/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Homework.E17;

/**
 *
 * @author DUADEPTRAI
 */
public class Book {
    private String title;
    private int pages;
    private String author;
    
    public Book(String title, int pages, String author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
    }
    
    public String getTitle() {
        return title;
    }
    public int getPages() {
        return pages;
    }
    public String author(){
        return author;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    
    @Override
    public String toString() {
        return "Book: " + title + " - Pages: " + pages + " - Author: " + author;
    }
}