package library;

import enums.Audience;
import enums.Category;

import java.time.LocalDate;

public abstract class LibraryItem {
    private Long id;
    private String title;
    private String author;
    private int publicationYear;
    private Audience audience;  // Young veya Adult
    private Category category;
    private String status;
    private int edition;
    private LocalDate dateOfPurchase;
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public Audience getAudience() {
        return audience;
    }

    public Category getCategory() {
        return category;
    }

    public String getStatus() {
        return status;
    }

    public int getEdition() {
        return edition;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setAudience(Audience audience) {
        this.audience = audience;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public void setDateOfPurchase(LocalDate dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public LibraryItem(Long id, String title, String author, int publicationYear, Audience audience, Category category, String status, int edition, LocalDate dateOfPurchase) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.audience = audience;
        this.category = category;
        this.status = status;
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
    }

    public abstract void showItemDetail();
}
