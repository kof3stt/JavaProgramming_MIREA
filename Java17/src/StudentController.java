// Контроллер представляет собой компонент, отвечающий за управление событиями и взаимодействием пользователя с приложением.
        // В Java контроллеры обрабатывают события, такие как нажатия кнопок, ввод текста и другие действия пользователя.
        // Контроллеры взаимодействуют с моделью для обновления данных и с представлением для отображения изменений.
public class StudentController { // связка между моделью и отображением
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNumber(String rollNumber) {
        model.setRollNumber(rollNumber);
    }

    public String getStudentRollNumber() {
        return model.getRollNumber();
    }

    public void updateView() {
        view.printStudentDetails(model);
    }
}