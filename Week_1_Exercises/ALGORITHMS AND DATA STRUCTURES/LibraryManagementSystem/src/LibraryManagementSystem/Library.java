package LibraryManagementSystem;

import java.util.Arrays;

class Library {
    Book[] books;

    Library(Book[] books) {
        this.books = books;
    }

    // Linear Search
    Book linearSearch(String title) {
        for (Book book : books) {
            if (book.title.equals(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary Search
    Book binarySearch(String title) {
        Arrays.sort(books, (a, b) -> a.title.compareTo(b.title)); // Sort the books by title
        int left = 0, right = books.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = books[mid].title.compareTo(title);
            if (cmp == 0) {
                return books[mid];
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
