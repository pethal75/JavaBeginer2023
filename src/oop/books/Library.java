package oop.books;

import java.util.ArrayList;
import java.util.List;

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

    public List<Book> findBookByAuthorSurname(String surname) throws IllegalStateException {
        List<Book> foundBooks = new ArrayList<Book>();

        for(int i = 0; i < books.size(); i++) {
            Book searchBook = this.books.get(i);

            if (searchBook.getAuthor().getSurname().contains(surname)) {
                foundBooks.add(searchBook);
            }
        }

        return foundBooks;
    }
}
