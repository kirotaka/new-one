package Activits;

class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: \"" + title + "\"\n" +
               "Author: \"" + author + "\"\n" +
               "Year Published: " + yearPublished + "\n" +
               String.format("Price: $%.2f", price);
    }
}

public class Task11 {
    public static void main(String[] args) {
    Book b1 = new Book("Seirei Gensouki: Spirit Chronicles", "Yuri Kitayama", 2015, 7.99);
    Book b2 = new Book("Umamusume: Pretty Derby", "Cygames", 2018, 7.99);
    Book b3 = new Book("Fate/stay night", "Kinoko Nasu", 2004, 7.99);

        System.out.println("Book 1:");
        System.out.println(b1);
        System.out.println();
        System.out.println("Book 2:");
        System.out.println(b2);
        System.out.println();
        System.out.println("Book 3:");
        System.out.println(b3);
    }
}
