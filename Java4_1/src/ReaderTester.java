public class ReaderTester {
    public static void main(String[] args) {
        Reader data[] = {new Reader("Иванов В.В.","13А2023","Компьютерная безопасность","01.01.2002","89234567788"),
                new Reader("Каликов М.Ю.","12ИУ2009","Менеджмент","02.02.2000","89171234567781")};
        data[1].takeBook("Приключение Тома");
        data[0].takeBook(7);
        data[1].takeBook(new Book("Дети подземелья","Короленко"),new Book("Энциклопедия", "Неизвестно"));
        data[1].returnBook("Преступление и наказание");
    }
}
