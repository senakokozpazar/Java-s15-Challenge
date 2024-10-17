package library;

import items.*;
import users.Reader;
import users.User;

import java.util.List;

public abstract class Library {
    private List<LibraryItem> libraryItems;       // Kütüphanedeki tüm öğeler
    private List<User> users; // Kütüphanedeki tüm kullanıcılar

    public Library(List<LibraryItem> libraryItems, List<User> users) {
        this.libraryItems = libraryItems;
        this.users = users;
    }


    public List<LibraryItem> getLibraryItems() {
        return libraryItems;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setLibraryItems(List<LibraryItem> libraryItems) {
        this.libraryItems = libraryItems;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void getItemsByType(String itemType) {
        switch (itemType.toLowerCase()) {
            case "book":
                for (LibraryItem item : libraryItems) {
                    if (item instanceof Book) {
                        System.out.println("Book Title: " + item.getTitle());
                    }
                }
                break;
            case "ebook":
                for (LibraryItem item : libraryItems) {
                    if (item instanceof Ebook) {
                        System.out.println("Ebook Title: " + item.getTitle());
                    }
                }
                break;
            case "audiobook":
                for (LibraryItem item : libraryItems) {
                    if (item instanceof AudioBook) {
                        System.out.println("Audiobook Title: " + item.getTitle());
                    }
                }
                break;
            case "periodicals":
                for (LibraryItem item : libraryItems) {
                    if (item instanceof Periodical) {
                        System.out.println("Periodicals Title: " + item.getTitle());
                    }
                }
                break;
            case "dvdbluray":
                for (LibraryItem item : libraryItems) {
                    if (item instanceof DvdBluray) {
                        System.out.println("DVD/BluRay Title: " + item.getTitle());
                    }
                }
                break;
            case "musiccd":
                for (LibraryItem item : libraryItems) {
                    if (item instanceof MusicCd) {
                        System.out.println("Music CD Title: " + item.getTitle());
                    }
                }
                break;
            case "videogame":
                for (LibraryItem item : libraryItems) {
                    if (item instanceof VideoGame) {
                        System.out.println("Video Game Title: " + item.getTitle());
                    }
                }
                break;
            case "referencematerial":
                for (LibraryItem item : libraryItems) {
                    if (item instanceof ReferenceMaterial) {
                        System.out.println("Reference Material Title: " + item.getTitle());
                    }
                }
                break;
            case "onlinedatabase":
                for (LibraryItem item : libraryItems) {
                    if (item instanceof OnlineDatabase) {
                        System.out.println("Online Database Title: " + item.getTitle());
                    }
                }
                break;
            case "specialcollection":
                for (LibraryItem item : libraryItems) {
                    if (item instanceof SpecialCollection) {
                        System.out.println("Special Collection Title: " + item.getTitle());
                    }
                }
                break;
            default:
                System.out.println("Invalid item type.");
                break;
        }
    }

    public void addNewItem(LibraryItem newItem) {
        libraryItems.add(newItem);
    }




}
