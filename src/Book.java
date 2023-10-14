public class Book {
    private final String bookName;
    private final Author author;
    private int publisherYear;

    public Book(String bookName, Author author, int publisherYear) {
        this.bookName = bookName;
        this.author = author;
        this.publisherYear = publisherYear;
    }

    public String getBookName() {

        return bookName;
    }

    public Author getAuthor() {
        return author;
    }
    public int getPublisherYear() {

        return publisherYear;
    }

    public void setPublisherYear(int publisherYear) {

        this.publisherYear = publisherYear;
    }
    @Override
    public String toString() {
        return bookName + " " + getAuthor() + publisherYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book nullBook = (Book)other;
        return bookName.equals(nullBook.bookName)
                && getAuthor().equals(nullBook.getAuthor())
                && publisherYear == nullBook.publisherYear
               ;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName, author, publisherYear);
    }
}
