package oop.books;

public class Book {
    private String title;
    private long count;

    public Book(String initialTitle, long initialCount) {
        this.title = initialTitle;
        this.count = initialCount;
    }

    public boolean borrowBook() {
        if (this.count == 0)
            return false;

        this.count--;

        return true;
    }

    public String toString() {
        return "Kniha: " + this.title + " (pocet na sklade:" + this.count + ")";
    }
}
