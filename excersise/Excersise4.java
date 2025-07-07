package excersise;

class library {
    String[] books;
    int no_of_books;

    library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        this.no_of_books++;
        System.out.println(book + " has been added!");
    }

    void showAvailableBooks() {
        System.out.println("Available Books are:");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println(" * " + book);
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null && this.books[i].equals(book)) {
                System.out.println("The book \"" + book + "\" has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("Sorry, the book \"" + book + "\" is not available.");
    }

    void returnBook(String book){
        addBook(book);
    }
}

public class Excersise4 {
    public static void main(String[] args) {
        library centralLibrary = new library();
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Rich dad poor dad");
        centralLibrary.addBook("Atomic Habit");
        centralLibrary.addBook("disney land");

        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("C++"); // This one doesn't exist
        centralLibrary.issueBook("Atomic Habit"); // This should be removed

        centralLibrary.showAvailableBooks();

        centralLibrary.returnBook("Atomic Habit ");
    }
}

