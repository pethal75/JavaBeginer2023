package oop.books;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList();

    public Library() {
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBook(String title) {
        for(int i = 0; i < books.size(); i++) {
            Book searchBook = this.books.get(i);

            if (searchBook.getTitle().equals(title))
                return searchBook;
        }

        return null;
    }
}
