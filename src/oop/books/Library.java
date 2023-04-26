package oop.books;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

    public void saveBooks() {
        try {
            File subor = new File("data" + File.separator + "kniznica.txt");
            FileWriter fw = new FileWriter(subor);

            for(Book b : books) {
                fw.write(b.getTitle() + ","
                        + b.getCount() + ","
                        + b.getAuthor().getName() + ","
                        + b.getAuthor().getSurname()
                        + "\n");
            }

            fw.close();
        } catch (IOException e) {
            System.out.println("Subor sa nepodarilo vytvorit " + e.getMessage());
        }
    }

    public void loadBooks() {
        try {
            this.books.clear();

            File subor = new File("data" + File.separator + "kniznica.txt");
            FileReader fr = new FileReader(subor);
            BufferedReader br = new BufferedReader(fr);
            String riadok = null;

            while ( (riadok = br.readLine()) != null) {
                String [] data = riadok.split(",");

                String title = data[0];
                long count = Long.parseLong(data[1]);
                String authorName = data[2];
                String authorSurname = data[3];

                Author author = new Author(authorName, authorSurname);
                Book book = new Book(title, author, count);

                this.books.add(book);
            }

        } catch (IOException e) {
            System.out.println("Subor sa nepodarilo nacitat " + e.getMessage());

        }
    }

    @Override
    public String toString() {
        return this.books.toString();
    }
}
