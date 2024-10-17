package items;

import enums.Audience;
import enums.Category;
import library.Borrowable;
import library.LibraryItem;
import users.User;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Book extends LibraryItem implements Borrowable {
    private String isbn; // Kitabın ISBN numarası
    private int pageCount; // Sayfa sayısı
    private String language; // Dil bilgisi
    private String publisher; // Yayıncı bilgisi

    public Book(Long id, String title, String author, int publicationYear, Audience audience, Category category, String status, int edition, LocalDate dateOfPurchase, String isbn, int pageCount, String language, String publisher) {
        super(id, title, author, publicationYear, audience, category, status, edition, dateOfPurchase);
        this.isbn = isbn;
        this.pageCount = pageCount;
        this.language = language;
        this.publisher = publisher;
    }


    public String getIsbn() {
        return isbn;
    }


    public int getPageCount() {
        return pageCount;
    }


    public String getLanguage() {
        return language;
    }


    public String getPublisher() {
        return publisher;
    }

    @Override
    public void showItemDetail() {
        System.out.println("Book Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publication Year: " + getPublicationYear());
        System.out.println("Audience: " + getAudience());
        System.out.println("Category: " + getCategory());
        System.out.println("Status: " + getStatus());
        System.out.println("Edition: " + getEdition());
        System.out.println("Date of Purchase: " + getDateOfPurchase());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Page Count: " + getPageCount());
        System.out.println("Language: " + getLanguage());
        System.out.println("Publisher: " + getPublisher());
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
