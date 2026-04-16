package library;

import java.util.ArrayList;

public class Member {
    private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public boolean borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.checkoutItem();
            return true;
        }
        return false;
    }

    public boolean returnBook(String bookId) {
        for (int i = 0; i < borrowedBooks.size(); i++) {
            if (borrowedBooks.get(i).getId().equals(bookId)) {
                borrowedBooks.get(i).returnItem();
                borrowedBooks.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}