package items;

import enums.Audience;
import enums.Category;
import library.LibraryItem;

import java.time.LocalDate;

public class ReferenceMaterial extends LibraryItem {
    private String publisher;
    private String isbn;

    public ReferenceMaterial(Long id, String title, String author, int publicationYear, Audience audience, Category category, String status, int edition, LocalDate dateOfPurchase, String publisher, String isbn) {
        super(id, title, author, publicationYear, audience, category, status, edition, dateOfPurchase);
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public void showItemDetail() {
        System.out.println("Reference Material Details:");
        System.out.println("ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publication Year: " + getPublicationYear());
        System.out.println("Audience: " + getAudience());
        System.out.println("Category: " + getCategory());
        System.out.println("Status: " + getStatus());
        System.out.println("Edition: " + getEdition());
        System.out.println("Date of Purchase: " + getDateOfPurchase());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("ISBN: " + getIsbn());
    }
}
