// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Александр", "Пушкин");
        Author secondAuthor = new Author("Лев", "Толстой");
        Book book = new Book("Сказка о рыбаке и рыбке", firstAuthor, 1800);
        Book book2 = new Book("Война и Мир", secondAuthor, 1863);
        System.out.println("Книга №1 - " + book.getBookName() + ", " + book.getAuthor().getAuthorName() + " " + book.getAuthor().getAuthorLastname() + ", " + book.getPublisherYear());
        System.out.println("Книга №2 - " + book2.getBookName() + ", " + book2.getAuthor().getAuthorName() + " " + book2.getAuthor().getAuthorLastname() + ", " + book2.getPublisherYear());
        book.setPublisherYear(1833);
        System.out.println("Книга №1 (c исправленным годом выхода) - " + book.getBookName() + ", " + book.getAuthor().getAuthorName() + " " + book.getAuthor().getAuthorLastname() + ", " + book.getPublisherYear());


    }
}