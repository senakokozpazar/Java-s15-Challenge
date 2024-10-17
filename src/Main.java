import enums.Audience;
import enums.Category;
import items.Book;
import library.Library;
import library.LibraryItem;
import users.Professor;
import users.Reader;
import users.Student;
import users.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LibraryItem> libraryItems = new ArrayList<>();
        List<User> users = new ArrayList<>();

        Book book1 = new Book(1L, "The Catcher in the Rye", "J.D. Salinger", 1951, Audience.YOUNG, Category.P, "Available", 1, LocalDate.of(2020, 1, 15), "1234567890123", 277, "English", "Little, Brown and Company");
        Book book2 = new Book(2L, "1984", "George Orwell", 1949, Audience.ADULT, Category.P, "Available", 1, LocalDate.of(2021, 5, 22), "9876543210987", 328, "English", "Secker & Warburg");
        Book book3 = new Book(3L, "Pride and Prejudice", "Jane Austen", 1813, Audience.ADULT, Category.P, "Available", 1, LocalDate.of(2019, 10, 10), "5554443332221", 432, "English", "T. Egerton");

        libraryItems.add(book1);
        libraryItems.add(book2);
        libraryItems.add(book3);

        Reader reader = new Student(
                1L,
                "Alice Johnson",
                "alice@studentemail.com",
                "123 Student Dormitory, Library St.",
                "123-456-7890",
                LocalDate.of(2022, 9, 1),
                new ArrayList<>(),
                0.0
        );
        users.add(reader);
        reader.returnItem(book1);
        book1.showItemDetail();



    }

}