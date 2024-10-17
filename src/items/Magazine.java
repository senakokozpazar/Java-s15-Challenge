package items;

import enums.Audience;
import enums.Category;

import java.time.LocalDate;

public class Magazine extends Periodical {
    private String issueNumber;
    private String publisher;

    public Magazine(Long id, String title, String author, int publicationYear, Audience audience, Category category, String status, int edition, LocalDate dateOfPurchase, String issueNumber, String publisher) {
        super(id, title, author, publicationYear, audience, category, status, edition, dateOfPurchase);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public void showItemDetail() {
        System.out.println("Magazine Details:");
        System.out.println("ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publication Year: " + getPublicationYear());
        System.out.println("Audience: " + getAudience());
        System.out.println("Category: " + getCategory().getDescription());
        System.out.println("Status: " + getStatus());
        System.out.println("Edition: " + getEdition());
        System.out.println("Date of Purchase: " + getDateOfPurchase());
        System.out.println("Issue Number: " + getIssueNumber());
        System.out.println("Publisher: " + getPublisher());
    }
}
