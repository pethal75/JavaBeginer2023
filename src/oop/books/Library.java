package oop.books;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList();

    public Library() {
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBook(String title) throws IllegalStateException {
        for(int i = 0; i < books.size(); i++) {
            Book searchBook = this.books.get(i);

            if (searchBook.getTitle().equals(title))
                return searchBook;
        }

        throw new IllegalStateException("Kniha nebola najdena");
    }

    public Book findBookByAuthorSurname(String surname) throws IllegalStateException {
        for(int i = 0; i < books.size(); i++) {
            Book searchBook = this.books.get(i);

            if (searchBook.getAuthor().getSurname().contains(surname))
                return searchBook;
        }

        throw new IllegalStateException("Kniha nebola najdena");
    }
}
