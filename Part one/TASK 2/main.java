public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming");
        Book b2 = new Book("Data Structures");

        Library library = new Library("Central");
        library.addBook(b1);
        library.addBook(b2);

        library.showBooks();
    }
}