package oop.books;

public class Manual extends Book {
    private String topic;

    public Manual(String initialTitle, Author author, long initialCount, String topic) {
        super(initialTitle, author, initialCount);

        this.topic = topic;
    }

    @Override
    public boolean borrowBook() {
        return false;
    }

    @Override
    public boolean returnBook() {
        return false;
    }

    @Override
    public String toString() {
        return "Manual: " + this.title + " " + this.topic
                + " (pocet na sklade:"
                + this.count
                + " z "
                + this.maxCount
                + ")";
    }
}
