package book;

import java.util.ArrayList;
import java.util.Scanner;
public class BookTester {
    public static void main(String[] args) {
        ArrayList <Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество книг: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            Book my_book = new Book();
            System.out.println(" Введите автора книги: ");
            sc.nextLine();
            my_book.setAuthor(sc.nextLine());
            System.out.println(" Введите название книги: ");
            my_book.setName(sc.nextLine());
            System.out.println(" Введите год написания книги: ");
            my_book.setYear(sc.nextInt());
            books.add(my_book);
        }
        BookShelf shelf = new BookShelf(books);
        System.out.println(shelf.get_earliest());
        System.out.println(shelf.get_latest());
        shelf.sort_books();
        System.out.println(shelf);
    }
}
