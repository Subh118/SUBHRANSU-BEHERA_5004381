package exercise6;


import java.util.Arrays;
import java.util.Comparator;

public class LibraryManagmentSystem {
    private Book[] books;

    public LibraryManagmentSystem(Book[] books) {
        this.books = books;
        Arrays.sort(this.books, Comparator.comparing(Book::getTitle));
    }

    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Book not found
    }

    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Book not found
    }

    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "1984", "George Orwell"),
            new Book(2, "To Kill a Mockingbird", "Harper Lee"),
            new Book(3, "The Great Gatsby", "F. Scott Fitzgerald")
        };

        LibraryManagmentSystem library = new LibraryManagmentSystem(books);
        System.out.println("Linear Search Result: " + library.linearSearchByTitle("1984"));
        System.out.println("Binary Search Result: " + library.binarySearchByTitle("1984"));
    }
}
