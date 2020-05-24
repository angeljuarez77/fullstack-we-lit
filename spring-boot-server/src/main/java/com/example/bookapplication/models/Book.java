package com.example.bookapplication.models;

import javax.persistence.*;

@Entity
@Table(name = "book_names")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long bookid;

    @Column
    private String title;

    @Column
    private String author;

    @Column
    private int release;

    public Book() { }

    public void setBookid(long bookid) {
        this.bookid = bookid;
    }

    public long getBookid() {
        return bookid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public int getRelease() {
        return release;
    }

}
