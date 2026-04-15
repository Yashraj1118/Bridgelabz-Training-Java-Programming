
public class LibraryManagement {
    static String libraryName = "City Library";
    String title;
    String author;
    final String isbn;

    public LibraryManagement(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    public void displayBookDetails() {
        if (this instanceof LibraryManagement) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        displayLibraryName();
        LibraryManagement book1 = new LibraryManagement("abc", "xyz", "9743273565");
        LibraryManagement book2 = new LibraryManagement("def", "pqr", "9061120084");
        
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}
