package users;

import library.LibraryItem;

import java.time.LocalDate;
import java.util.List;

public class Librarian extends Employee{

    public Librarian(Long id, String name, String email, String address, String phone, LocalDate dateOfMembership, List<LibraryItem> borrowedItems, double totalFine, String role, double salary) {
        super(id, name, email, address, phone, dateOfMembership, borrowedItems, totalFine, role, salary);
    }

    public LibraryItem searchItem(String title, List<LibraryItem> libraryItems) {
        for (LibraryItem item : libraryItems) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Item found: " + item.getTitle());
                return item;
            }
        }
        System.out.println("Item not found: " + title);
        return null;
    }


    public boolean verifyUser(User user, List<User> users) {
        for (User u : users) {
            if (u.getId().equals(user.getId())) {
                System.out.println("User verified: " + u.getName());
                return true;
            }
        }
        System.out.println("User not found: " + user.getName());
        return false;
    }

}
