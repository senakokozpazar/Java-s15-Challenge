package library;

import users.User;

public interface Borrowable {
     boolean lendItem(LibraryItem item, User user);
     boolean takeBackItem(LibraryItem item, User user);
}
