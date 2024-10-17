package items;

import enums.Audience;
import enums.Category;

import java.time.LocalDate;

public class NewsPaper extends Periodical {
    private String issueDate;
    private String publisher;

    public NewsPaper(Long id, String title, String author, int publicationYear, Audience audience, Category category, String status, int edition, LocalDate dateOfPurchase, String issueDate, String publisher) {
        super(id, title, author, publicationYear, audience, category, status, edition, dateOfPurchase);
        this.issueDate = issueDate;
        this.publisher = publisher;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public void showItemDetail() {
        System.out.println("Newspaper Details:");
        System.out.println("ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publication Year: " + getPublicationYear());
        System.out.println("Audience: " + getAudience());
        System.out.println("Category: " + getCategory().getDescription());
        System.out.println("Status: " + getStatus());
        System.out.println("Edition: " + getEdition());
        System.out.println("Date of Purchase: " + getDateOfPurchase());
        System.out.println("Issue Date: " + getIssueDate());
        System.out.println("Publisher: " + getPublisher());
    }
}
