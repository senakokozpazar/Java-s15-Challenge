package users;

import library.LibraryItem;

import java.time.LocalDate;
import java.util.List;

public class Employee extends User{

    private String role;
    private double salary;

    public Employee(Long id, String name,  String email, String address, String phone, LocalDate dateOfMembership,  List<LibraryItem> borrowedItems, double totalFine, String role, double salary) {
        super(id, name, "Employee", email, address, phone, dateOfMembership, 10, borrowedItems, totalFine);
        this.role = role;
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
