package com.springboot.bookstore.model.borrow;

import jakarta.persistence.*;

@Entity
@Table(name = "borrow")
public class BorrowModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer borrow_id;
    private Integer book_id;
    private Integer user_id;
    private String borrowing_date;
    private String return_date;

}