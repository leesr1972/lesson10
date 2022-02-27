package sky.pro.java.course1.homework10;

import java.util.Objects;

public class Book {
    private final String titleBook;
    private final Author authorBook;
    public int yearOfPublication;

    public Book(String titleBook, Author authorBook, int yearOfPublication) {
        this.titleBook = titleBook;
        this.authorBook = authorBook;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public Author getAuthorBook() {
        return authorBook;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return titleBook + ". " + authorBook + ". " + yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && titleBook.equals(book.titleBook) && authorBook.equals(book.authorBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, authorBook, yearOfPublication);
    }
}
