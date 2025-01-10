// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package author;
import author.Author;

public class TestAuthor
{
    public static void main(String[] args)
    {
        Author person = new Author("vlad","no mail", 'm');
        System.out.println(person);
        person.setEmail("vlad@mail.ru");
        System.out.println(person.toString());
    }
}
