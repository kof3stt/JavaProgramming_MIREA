package task2;

public class Person {
    String name;
    String surname;
    String patronymic;
    String n ;
    String p ;
    int age;

    public Person(String name, String surname, String patronymic, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
        n = name.substring(0,1);
        p = patronymic.substring(0,1);
    }
    public Person() {
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFio()
    {
        StringBuilder sb = new StringBuilder(surname);
        if(name != null && !name.isEmpty())
            sb.append(" ").append(name).append('.');
        if(patronymic != null && !patronymic.isEmpty())
            sb.append(" ").append(patronymic).append('.');
        return sb.toString();
    }
}
