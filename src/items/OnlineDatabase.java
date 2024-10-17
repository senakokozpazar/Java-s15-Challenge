package items;

import enums.Audience;
import enums.Category;
import library.LibraryItem;

import java.time.LocalDate;

public class OnlineDatabase extends LibraryItem {
    private String url;
    private String accessLevel;

    public OnlineDatabase(Long id, String title, String author, int publicationYear, Audience audience, Category category, String status, int edition, LocalDate dateOfPurchase, String url, String accessLevel) {
        super(id, title, author, publicationYear, audience, category, status, edition, dateOfPurchase);
        this.url = url;
        this.accessLevel = accessLevel;
    }

    public String getUrl() {
        return url;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    @Override
    public void showItemDetail() {
        System.out.println("Online Database Details:");
        System.out.println("ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publication Year: " + getPublicationYear());
        System.out.println("Audience: " + getAudience());
        System.out.println("Category: " + getCategory());
        System.out.println("Status: " + getStatus());
        System.out.println("Edition: " + getEdition());
        System.out.println("Date of Purchase: " + getDateOfPurchase());
        System.out.println("URL: " + getUrl());
        System.out.println("Access Level: " + getAccessLevel());
    }
}
