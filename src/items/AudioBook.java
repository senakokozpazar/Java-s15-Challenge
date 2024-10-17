package items;

import enums.Audience;
import enums.Category;
import library.LibraryItem;

import java.time.LocalDate;

public class AudioBook extends LibraryItem {
    private int duration;
    private String format;

    public AudioBook(Long id, String title, String author, int publicationYear, Audience audience, Category category, String status, int edition, LocalDate dateOfPurchase, int duration, String format) {
        super(id, title, author, publicationYear, audience, category, status, edition, dateOfPurchase);
        this.duration = duration;
        this.format = format;
    }

    public int getDuration() {
        return duration;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public void showItemDetail() {
        System.out.println("AudioBook Details:");
        System.out.println("ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publication Year: " + getPublicationYear());
        System.out.println("Audience: " + getAudience());
        System.out.println("Category: " + getCategory().getDescription());
        System.out.println("Status: " + getStatus());
        System.out.println("Edition: " + getEdition());
        System.out.println("Date of Purchase: " + getDateOfPurchase());
        System.out.println("Duration: " + getDuration() + " minutes"); // Süreyi dakikalar olarak göster
        System.out.println("Format: " + getFormat()); // Formatı yazdır
    }
}
