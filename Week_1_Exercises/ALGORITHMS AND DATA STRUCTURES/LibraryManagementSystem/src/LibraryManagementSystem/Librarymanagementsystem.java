package LibraryManagementSystem;

public class Librarymanagementsystem {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Effective Java", "Joshua Bloch"),
            new Book(2, "Clean Code", "Robert C. Martin"),
            new Book(3, "Design Patterns", "Erich Gamma"),
            new Book(4, "Refactoring", "Martin Fowler")
        };

        Library library = new Library(books);

        // Linear Search
        Book foundBookLinear = library.linearSearch("Clean Code");
        if (foundBookLinear != null) {
            System.out.println("Found with Linear Search: " + foundBookLinear.title + " by " + foundBookLinear.author);
        } else {
            System.out.println("Book not found with Linear Search");
        }

        // Binary Search
        Book foundBookBinary = library.binarySearch("Clean Code");
        if (foundBookBinary != null) {
            System.out.println("Found with Binary Search: " + foundBookBinary.title + " by " + foundBookBinary.author);
        } else {
            System.out.println("Book not found with Binary Search");
        }
    }
}