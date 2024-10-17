package items;

import enums.Audience;
import enums.Category;
import library.LibraryItem;

import java.time.LocalDate;

public abstract class Periodical extends LibraryItem {
    public Periodical(Long id, String title, String author, int publicationYear, Audience audience, Category category, String status, int edition, LocalDate dateOfPurchase) {
        super(id, title, author, publicationYear, audience, category, status, edition, dateOfPurchase);
    }

}
