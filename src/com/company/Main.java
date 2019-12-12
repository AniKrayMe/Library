package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Убийство в Восточном экспрессе", "Агата Кристи", 504, "Детектив", 1934);
        Book book2 = new Book("Смерть на Ниле", "Агата Кристи", 320, "Роман", 1937);
        Book book3 = new Book("Убийства по алфавиту", "Агата Кристи", 446, "Детектив", 1936);
        Book book4 = new Book("Свидетель обвинения", "Агата Кристи", 280, "Детектив", 1925);
        Book book5 = new Book("Зло под солнцем", "Агата Кристи", 354, "Детектив", 1941);


        HashMap<String, Book> books = new HashMap<>();
        books.put(book1.getName(), book1);
        books.put(book2.getName(), book2);
        books.put(book3.getName(), book3);
        books.put(book4.getName(), book4);
        books.put(book5.getName(), book5);

        int menuNumber;
        do {
            System.out.println("-------------MENU-------------");
            System.out.println("|||||PRESS 1 TO ADD BOOK |||||");
            System.out.println("|||||PRESS 2 TO VIEW BOOK|||||");
            System.out.println("|||||PRESS 3 FOR EXIT    |||||");
            System.out.println("------------------------------");
            Scanner scanner = new Scanner(System.in);
            menuNumber = scanner.nextInt();
            String text = scanner.nextLine();
            if (menuNumber == 1) {
                Book book = new Book();
                System.out.println("Add book name");
                book.setName(scanner.nextLine());
                System.out.println("Add book author name");
                book.setAuthor(scanner.nextLine());
                System.out.println("Add book number of pages");
                book.setNumberOfPages(scanner.nextInt());
                System.out.println("Add book genre");
                book.setGenre(scanner.nextLine());
                System.out.println("Add book print year");
                book.setYear(scanner.nextInt());
                books.put(book.getName(), book);

            } else if (menuNumber == 2) {
                System.out.println("Write book name");
                String bookName = scanner.nextLine();
                if (books.containsKey(bookName)) {
                    System.out.println(books.get(bookName));
                } else {
                    System.out.println("We have no this book in our library");
                }
            } else if (menuNumber == 3) {
                System.out.println("Thank you for your visit in our library");
            } else {
                System.out.println("Error,if you can return menu reload the page");
                break;
            }
        } while (menuNumber != 3);
    }
}
