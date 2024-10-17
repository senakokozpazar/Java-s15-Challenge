package users;

import library.LibraryItem;

import java.time.LocalDate;
import java.util.List;

public class LibraryManager extends Employee{
    private List<User> users;
    private List<Employee> employees;

    public LibraryManager(Long id, String name, String email, String address, String phone, LocalDate dateOfMembership, List<LibraryItem> borrowedItems, double totalFine, String role, double salary, List<User> users, List<Employee> employees) {
        super(id, name, email, address, phone, dateOfMembership, borrowedItems, totalFine, role, salary);
        this.users = users;
        this.employees = employees;
    }

    public void addMember(User newUser) {
        if (!users.contains(newUser)) {
            users.add(newUser);
            System.out.println("New user added: " + newUser.getName());
        } else {
            System.out.println("User already exists: " + newUser.getName());
        }
    }

    public void removeMember(User user) {
        if (users.remove(user)) {
            System.out.println("User removed: " + user.getName());
        } else {
            System.out.println("User not found: " + user.getName());
        }
    }


    public void paySalaries() {
        for (Employee employee : employees) {
            System.out.println("Paid salary to " + employee.getName() + ": $" + employee.getSalary());

        }
    }
}
