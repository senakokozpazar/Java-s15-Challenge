package users;

import library.LibraryItem;

import java.time.LocalDate;
import java.util.List;

public class Student extends Reader{
    public Student(Long id, String name, String email, String address, String phone, LocalDate dateOfMembership,  List<LibraryItem> borrowedItems, double totalFine) {
        super(id, name, "Student", email, address, phone, dateOfMembership, 15, borrowedItems, totalFine);
    }
}
