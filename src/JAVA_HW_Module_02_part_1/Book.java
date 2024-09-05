package JAVA_HW_Module_02_part_1;

import java.time.LocalDate;
import java.util.Scanner;

public class Book {

    private String bookTitle;
    private String authorName;
    private String authorSurname;
    private LocalDate issueYear;
    private String publishingName;
    private String genreBooks;
    private int numberPages;

    public Book() {
    }
    public Book(String bookTitle, String authorName, String authorSurname) {
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }
    public Book(String bookTitle, String authorName, String authorSurname, int year, String publishingName, String genreBooks, int numberPages) {
        this(bookTitle, authorName, authorSurname);
        this.issueYear = LocalDate.ofYearDay(year, 1);
        this.publishingName = publishingName;
        this.genreBooks = genreBooks;
        this.numberPages = numberPages;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String bookTitle = scanner.nextLine();
        this.setBookTitle(bookTitle);
        System.out.print("Enter author name: ");
        String authorName = scanner.nextLine();
        this.setAuthorName(authorName);
        System.out.print("Enter author surname: ");
        String authorSurname = scanner.nextLine();
        this.setAuthorSurname(authorSurname);
        System.out.print("Enter year issue: ");
        int year = scanner.nextInt();
        this.setIssueYear(year);
        System.out.print("Enter publishing house name: ");
        String publishingName = scanner.nextLine();
        this.setPublishingName(publishingName);
        System.out.print("Enter book genre: ");
        String bookGenre = scanner.nextLine();
        this.setGenreBooks(bookGenre);
        System.out.print("Enter number pages: ");
        int numberPages = scanner.nextInt();
        this.setNumberPages(numberPages);

        scanner.close();
    }

    public void print() {
        System.out.println(getBookTitle() + '\n'
        + getAuthorSurname() + ' ' + getAuthorName() + '\n'
        + "Year: " + getIssueYear().getYear() + '\n'
        + "Number of pages: " + getNumberPages() + '\n'
        + "Book genre: " + getGenreBooks() + '\n'
        + "Publishing house: " + getPublishingName() + '\n');
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public LocalDate getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(int year) {
        this.issueYear = LocalDate.ofYearDay(year, 1);
    }

    public String getPublishingName() {
        return publishingName;
    }

    public void setPublishingName(String publishingName) {
        this.publishingName = publishingName;
    }

    public String getGenreBooks() {
        return genreBooks;
    }

    public void setGenreBooks(String genreBooks) {
        this.genreBooks = genreBooks;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }
}
