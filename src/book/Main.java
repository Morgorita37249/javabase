package book;


import book.Book;
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Сказка о царе Салтане","Пушкин",120, false);
        book.printInformation();
        book.printStringCount();
        book.printStringCount(500);
    }
}