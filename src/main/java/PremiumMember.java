package library;

public class PremiumMember extends Member {
    private int maxBooksAllowed;

    public PremiumMember(String name, String memberId, int maxBooksAllowed) {
        super(name, memberId);
        this.maxBooksAllowed = maxBooksAllowed;
    }

    @Override
    public boolean borrowBook(Book book) {
        if (getBorrowedBooks().size() >= maxBooksAllowed) {
            return false;
        }
        return super.borrowBook(book);
    }
}