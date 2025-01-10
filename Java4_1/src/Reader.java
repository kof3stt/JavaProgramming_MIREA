public class Reader {
    String name;
    String ticketNum;
    String faculty;
    String dateOfBorn;
    String phone;

    public Reader(String name, String ticketNum, String faculty, String dateOfBorn, String phone) {
        this.name = name;
        this.ticketNum = ticketNum;
        this.faculty = faculty;
        this.dateOfBorn = dateOfBorn;
        this.phone = phone;
    }

    public void takeBook(int n){
        System.out.printf("%s взял %d книги.\n",name, n);
    }

    public void takeBook(String ... books){
        String res = name + "взял книги: ";
        for (String book: books){
            res += book + ", ";
        }
        res = res.substring(0, res.length() -2) + ".";
        System.out.println(res);
    }

    public void takeBook(Book ... books){
        String res = name + "взял книги: ";
        for (Book book: books){
            res += book.bookName + ", ";
        }
        res = res.substring(0, res.length() -2) + ".";
        System.out.println(res);
    }

    public void returnBook(int n){
        System.out.printf("%s вернул %d книги.\n",name, n);
    }

    public void returnBook(String ... books){
        String res = name + "вернул книги: ";
        for (String book: books){
            res += book + ", ";
        }
        res = res.substring(0, res.length() -2) + ".";
        System.out.println(res);
    }

    public void returnBook(Book ... books){
        String res = name + "вернул книги: ";
        for (Book book: books){
            res += book.bookName + ", ";
        }
        res = res.substring(0, res.length() -2) + ".";
        System.out.println(res);
    }
}
