package library;

public class Book extends LibraryItem {
    private String author;
    private String genre;

    public Book(String title, String id, String author, String genre) {
        super(title, id);
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() { return author; }
    public String getGenre() { return genre; }

    @Override
    public String toString() {
        return getTitle() + " by " + author;
    }
}