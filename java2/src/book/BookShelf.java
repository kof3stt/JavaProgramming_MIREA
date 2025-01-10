package book;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BookShelf {
    private ArrayList <Book> books;

    public BookShelf(ArrayList<Book> books) {
        this.books = books;
    }
    public Book get_earliest()
    {
        Book first = books.get(0);
        for (int i =1;i<books.size();i++){
            if (books.get(i).getYear()<first.getYear())
                first = books.get(i);
        }
        return first;
    }

    public Book get_latest()
    {
        Book last = books.get(0);
        for (int i =1;i<books.size();i++){
            if (books.get(i).getYear()>last.getYear())
                last = books.get(i);
        }
        return last;
    }

    public void sort_books(){
        Book temp;
        for (int i = 0; i < books.size();i++){
            for (int j = i; j < books.size();j++){
                if (books.get(i).getYear() > books.get(j).getYear())
                    Collections.swap(books,i,j);
            }
        }
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "books=" + books +
                '}';
    }
}
