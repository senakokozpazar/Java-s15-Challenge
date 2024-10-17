package items;

import enums.Audience;
import enums.Category;
import library.Borrowable;
import library.LibraryItem;
import users.User;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MusicCd extends LibraryItem implements Borrowable {
    private String genre;
    private int duration;

    public MusicCd(Long id, String title, String author, int publicationYear, Audience audience, Category category, String status, int edition, LocalDate dateOfPurchase, String genre, int duration) {
        super(id, title, author, publicationYear, audience, category, status, edition, dateOfPurchase);
        this.genre = genre;
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void showItemDetail() {
        System.out.println("Music CD Details:");
        System.out.println("ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publication Year: " + getPublicationYear());
        System.out.println("Audience: " + getAudience());
        System.out.println("Category: " + getCategory());
        System.out.println("Status: " + getStatus());
        System.out.println("Edition: " + getEdition());
        System.out.println("Date of Purchase: " + getDateOfPurchase());
        System.out.println("Genre: " + getGenre());
        System.out.println("Duration: " + getDuration() + " minutes");
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
