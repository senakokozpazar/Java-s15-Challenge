package users;

import library.LibraryItem;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public abstract class Reader extends User {
    public Reader(Long id, String name, String type, String email, String address, String phone, LocalDate dateOfMembership, int maxBookLimit, List<LibraryItem> borrowedItems, double totalFine) {
        super(id, name, type, email, address, phone, dateOfMembership, maxBookLimit, borrowedItems, totalFine);
    }
}
