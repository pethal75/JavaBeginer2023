package oop;

import java.util.Scanner;
import oop.books.Book;
import oop.books.Manual;

public class MainOop {
    public static void main(String[] args) {

        Book javaKniha = new Manual("Java for beginners", 5, "programming");
        Book detska = new Book("Maly princ", 5);

        System.out.println(javaKniha);
        System.out.println(detska.getTitle() + " " + detska.getCount());

        javaKniha.borrowBook();
        detska.borrowBook();

        System.out.println(javaKniha);
        System.out.println(detska);
    }
}
