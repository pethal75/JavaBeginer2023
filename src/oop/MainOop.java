package oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import oop.books.Author;
import oop.books.Book;
import oop.books.Library;
import oop.books.Manual;

public class MainOop {
    public static void main(String[] args) {

        /*Author authorJava = new Author("Sun", "Microsystems");
        Book javaKniha = new Manual("Java for beginners", authorJava, 3, "programming");

        Author authorDetskej = new Author("Antoine", "Exupery");
        Book detska = new Book("Maly princ", authorDetskej, 5);
        Book detska2 = new Book("Velky princ", authorDetskej, 5);

        Library kniznica = new Library();

        kniznica.addBook(javaKniha);
        kniznica.addBook(detska);
        kniznica.addBook(detska2);

        kniznica.saveBooks();*/

        Library kniznica = new Library();

        kniznica.loadBooks();

        System.out.println(kniznica);
    }
}
