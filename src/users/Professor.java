package users;

import library.LibraryItem;

import java.time.LocalDate;
import java.util.List;

public class Professor extends Reader{

    public Professor(Long id, String name, String email, String address, String phone, LocalDate dateOfMembership,  List<LibraryItem> borrowedItems, double totalFine) {
        super(id, name, "Professor", email, address, phone, dateOfMembership, 20, borrowedItems, totalFine);
    }
}
