
//Модель представляет собой компонент, отвечающий за управление данными, бизнес-логикой и состоянием приложения.
//        В Java модель может быть представлена классами, объектами и структурами данных, которые описывают основные аспекты вашего приложения.
//       Модель не зависит от представления и контроллера и предоставляет интерфейс для получения, изменения и обновления данных.
public class Student { // модель
    private String rollNumber; // номер зачетки
    private String name; // имя

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}