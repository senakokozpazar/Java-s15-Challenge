package items;

import enums.Audience;
import enums.Category;
import library.LibraryItem;

import java.time.LocalDate;

public class Ebook extends LibraryItem {
    private String fileFormat;
    private double fileSize;

    public Ebook(Long id, String title, String author, int publicationYear, Audience audience, Category category, String status, int edition, LocalDate dateOfPurchase, String fileFormat, double fileSize) {
        super(id, title, author, publicationYear, audience, category, status, edition, dateOfPurchase);
        this.fileFormat = fileFormat;
        this.fileSize = fileSize;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public double getFileSize() {
        return fileSize;
    }

    @Override
    public void showItemDetail() {
        System.out.println("E-book Details:");
        System.out.println("ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publication Year: " + getPublicationYear());
        System.out.println("Audience: " + getAudience());
        System.out.println("Category: " + getCategory().getDescription());
        System.out.println("Status: " + getStatus());
        System.out.println("Edition: " + getEdition());
        System.out.println("Date of Purchase: " + getDateOfPurchase());
        System.out.println("File Format: " + getFileFormat());
        System.out.println("File Size: " + getFileSize() + " MB");
    }
}
