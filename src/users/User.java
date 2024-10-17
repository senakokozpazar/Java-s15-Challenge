package users;

import library.LibraryItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private Long id;
    private String name;
    private String type;
    private String email;
    private String address;
    private String phone;
    private LocalDate dateOfMembership;
    private int maxBookLimit;
    private List<LibraryItem> borrowedItems;
    private double totalFine;

    // Constructor


    public User(Long id, String name, String type, String email, String address, String phone, LocalDate dateOfMembership, int maxBookLimit, List<LibraryItem> borrowedItems, double totalFine) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.dateOfMembership = dateOfMembership;
        this.maxBookLimit = maxBookLimit;
        this.borrowedItems = borrowedItems;
        this.totalFine = totalFine;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getDateOfMembership() {
        return dateOfMembership;
    }

    public void setDateOfMembership(LocalDate dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

    public int getMaxBookLimit() {
        return maxBookLimit;
    }

    public void setMaxBookLimit(int maxBookLimit) {
        this.maxBookLimit = maxBookLimit;
    }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    public void setBorrowedItems(List<LibraryItem> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }

    public double getTotalFine() {
        return totalFine;
    }

    public void setTotalFine(double totalFine) {
        this.totalFine = totalFine;
    }

    public String whoYouAre() {
        return "I am " + name + ", a " + type + ".";
    }

    public void addFine(double fine) {
        this.totalFine += fine;
        System.out.println(name + " has been charged a fine of " + fine + " TL. Total fine: " + totalFine + " TL.");
    }


    public void payFine(double amount) {
        if (amount > totalFine) {
            System.out.println("The amount exceeds the total fine.");
        } else {
            totalFine -= amount;
            System.out.println(name + " has paid " + amount + " TL. Remaining fine: " + totalFine + " TL.");
        }
    }

    public void borrowItem(LibraryItem item) {
        if (borrowedItems.size() < maxBookLimit) {
            borrowedItems.add(item);
        } else {
            System.out.println(name + " cannot borrow more books. Maximum limit reached.");
        }
    }

    public boolean returnItem(LibraryItem item) {
        borrowedItems.remove(item);
        return true;
    }

}
