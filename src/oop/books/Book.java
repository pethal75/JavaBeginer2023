package oop.books;

public class Book {
    protected String title;
    protected long count;
    protected final long maxCount;
    protected Author author;

    public Book(String initialTitle, Author author, long initialCount) {
        this.title = initialTitle;
        this.author = author;
        this.count = initialCount;
        this.maxCount = initialCount;
    }

    public String getTitle() {
        return title;
    }

    public long getCount() {
        return count;
    }

    public boolean borrowBook() {
        if (this.count == 0)
            return false;

        this.count--;

        return true;
    }

    public long returnBook(long returnCount) {

        if (this.count + returnCount > this.maxCount) {
            long possible = this.maxCount - this.count;
            this.count = this.maxCount;
            return possible;
        }

        this.count += returnCount;

        return returnCount;
    }

    public boolean returnBook() {

        return this.returnBook(1) == 1;
    }

    public Author getAuthor() {
        return author;
    }

    public String toString() {
        return "Kniha: " + this.title
                + " (pocet na sklade:"
                + this.count
                + " z "
                + this.maxCount
                + ")";
    }
}
