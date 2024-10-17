package items;

import enums.Audience;
import enums.Category;
import library.Borrowable;
import library.LibraryItem;
import users.User;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class VideoGame extends LibraryItem implements Borrowable {
    private String platform;
    private String rating;

    public VideoGame(Long id, String title, String author, int publicationYear, Audience audience, Category category, String status, int edition, LocalDate dateOfPurchase, String platform, String rating) {
        super(id, title, author, publicationYear, audience, category, status, edition, dateOfPurchase);
        this.platform = platform;
        this.rating = rating;
    }

    public String getPlatform() {
        return platform;
    }

    public String getRating() {
        return rating;
    }

    @Override
    public void showItemDetail() {
        System.out.println("Video Game Details:");
        System.out.println("ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publication Year: " + getPublicationYear());
        System.out.println("Audience: " + getAudience());
        System.out.println("Category: " + getCategory());
        System.out.println("Status: " + getStatus());
        System.out.println("Edition: " + getEdition());
        System.out.println("Date of Purchase: " + getDateOfPurchase());
        System.out.println("Platform: " + getPlatform());
        System.out.println("Rating: " + getRating());
    }

    @Override
    public boolean lendItem(LibraryItem item, User user) {
        if (item.getStatus().equals("available")) {
            item.setStatus("borrowed");
            user.borrowItem(item);
            return true;
        }
        return false;
    }

    @Override
    public boolean takeBackItem(LibraryItem item, User user) {
        LocalDate dueDate = item.getDateOfPurchase().plusDays(14);
        LocalDate returnDate = LocalDate.now();

        if (user.returnItem(item)) {
            item.setStatus("available");


            if (returnDate.isAfter(dueDate)) {
                long overdueDays = ChronoUnit.DAYS.between(dueDate, returnDate); // Geçen gün sayısını hesapla
                double fine = overdueDays * 10.0;
                user.addFine(fine);
            }

            return true;
        }
        return false;
    }

}
