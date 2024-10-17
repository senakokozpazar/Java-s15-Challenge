package items;

import enums.Audience;
import enums.Category;
import library.LibraryItem;

import java.time.LocalDate;

public class SpecialCollection extends LibraryItem {
    private String collectionType;
    private String specialNotes;

    public SpecialCollection(Long id, String title, String author, int publicationYear, Audience audience, Category category, String status, int edition, LocalDate dateOfPurchase, String collectionType, String specialNotes) {
        super(id, title, author, publicationYear, audience, category, status, edition, dateOfPurchase);
        this.collectionType = collectionType;
        this.specialNotes = specialNotes;
    }

    public String getCollectionType() {
        return collectionType;
    }

    public String getSpecialNotes() {
        return specialNotes;
    }

    @Override
    public void showItemDetail() {
        System.out.println("Special Collection Details:");
        System.out.println("ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publication Year: " + getPublicationYear());
        System.out.println("Audience: " + getAudience());
        System.out.println("Category: " + getCategory());
        System.out.println("Status: " + getStatus());
        System.out.println("Edition: " + getEdition());
        System.out.println("Date of Purchase: " + getDateOfPurchase());
        System.out.println("Collection Type: " + getCollectionType());
        System.out.println("Special Notes: " + getSpecialNotes());
    }
}
