public class BookArray {
    public static void main(String[] args) {
        Book[] books = new Book[10];

        books[0] = new Fiction("Nineteen eighty-four");
        books[1] = new Fiction("The Great Gatsby");
        books[2] = new Fiction("The Catcher in the Rye");
        books[3] = new Fiction("Jane Eyre");
        books[4] = new Fiction("Brave New World");
        books[5] = new NonFiction("Into Thin Air");
        books[6] = new NonFiction("Into the Wild");
        books[7] = new NonFiction("Between the World");
        books[8] = new NonFiction("How to survive a plague");
        books[9] = new NonFiction("The Art of Cruelty: A Reckoning");

        for (Book book : books) {
            System.out.println("Book title: " + book.getName() + " || Book Price: " + book.getPrice());
        }
    }
}
