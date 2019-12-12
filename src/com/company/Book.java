package com.company;

public class Book {
    private String Name;
    private String Author;
    private int numberOfPages;
    private String genre;
    private int year;

    //region Constructor
    public Book(String name, String author, int numberOfPages, String genre, int year) {
        Name = name;
        Author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.year = year;
    }

    public Book() {
    }
    //endregion

    //region Getter and Setter
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //endregion


    @Override
    public String toString() {
        return ("Name = " + this.getName() + "\n" + "Author = " + this.getAuthor() + "\n" + "Number of pages = " + this.getNumberOfPages() + "\n" + "Genre = " + this.getGenre() + "\n" + "Year = " + this.getYear());

    }
}
