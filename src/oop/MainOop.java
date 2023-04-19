package oop;

import java.io.FileNotFoundException;
import java.util.Scanner;
import oop.books.Author;
import oop.books.Book;
import oop.books.Library;
import oop.books.Manual;

public class MainOop {
    public static void main(String[] args) {

        Author authorJava = new Author("Sun", "Microsystems");
        Book javaKniha = new Manual("Java for beginners", authorJava, 3, "programming");

        Author authorDetskej = new Author("Antoine", "Exupery");
        Book detska = new Book("Maly princ", authorDetskej, 5);
        Book detska2 = new Book("Velky princ", authorDetskej, 5);

        Library kniznica = new Library();

        kniznica.addBook(javaKniha);
        kniznica.addBook(detska);
        kniznica.addBook(detska2);

        try {
            Book foundBook = kniznica.findBookByAuthorSurname("Exup");

            System.out.println("Najdene pre Exupery " + foundBook.getTitle());

        } catch (IllegalStateException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
