package com.springboot.bookstore.model.book;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book")
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer book_id;
    private String title;
    private String author;
    private Integer release_year;
}


//Créez une entité Livre avec les attributs suivants : id (Long), titre (String), auteur (String), et année de publication (Integer).
