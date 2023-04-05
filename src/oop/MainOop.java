package oop;

import java.util.Scanner;
import oop.books.Book;

public class MainOop {
    public static void main(String[] args) {

        Book javaKniha = new Book("Java for beginners", 5);

        System.out.println(javaKniha);

        boolean success = javaKniha.borrowBook();
        success = javaKniha.borrowBook();
        success = javaKniha.borrowBook();
        success = javaKniha.borrowBook();
        success = javaKniha.borrowBook();
        success = javaKniha.borrowBook();
        System.out.println("Pozicanie bolo " + success);

        System.out.println(javaKniha);
    }
}
