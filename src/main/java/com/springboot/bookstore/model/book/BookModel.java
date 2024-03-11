package com.springboot.bookstore.model.book;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer book_id;
    private String title;
    private String author;
    private Integer release_year;

    public BookModel() {}

    public BookModel(String title, String author, Integer release_year){
        this.title = title;
        this.author = author;
        this.release_year = release_year;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getRelease_year() {
        return release_year;
    }

    public void setRelease_year(Integer release_year) {
        this.release_year = release_year;
    }
}