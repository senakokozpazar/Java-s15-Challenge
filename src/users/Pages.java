package users;

import enums.Category;
import library.LibraryItem;

import java.time.LocalDate;
import java.util.List;

public class Pages extends Employee{
    public Pages(Long id, String name, String email, String address, String phone, LocalDate dateOfMembership, List<LibraryItem> borrowedItems, double totalFine, String role, double salary) {
        super(id, name, email, address, phone, dateOfMembership, borrowedItems, totalFine, role, salary);
    }

    public void shelveItems(List<LibraryItem> returnedItems){
        for (LibraryItem item : returnedItems) {
            Category category = item.getCategory();
            String shelfLocation = findShelfLocation(category);
            System.out.println(item.getTitle() + " adlı materyal, " + shelfLocation + " rafına yerleştirildi.");
        }
    }

    private String findShelfLocation(Category category) {
        switch (category) {
            case P:
                return "Dil ve Edebiyat Rafı";
            case H:
                return "Sosyal Bilimler Rafı";
            case M:
                return "Müzik Rafı";
            case N:
                return "Güzel Sanatlar Rafı";
            case Z:
                return "Bilgi Kaynakları Rafı";
            case G:
                return "Coğrafya ve Rekreasyon Rafı";
            default:
                return "Genel Çalışmalar Rafı";
        }
    }
}
