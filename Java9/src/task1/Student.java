package task1;

public class Student implements Comparable<Student> {
    String name;
    String surname;
    String group;
    int course;
    String specialization;
    double point;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }


    @Override
    public int compareTo(Student o) {
        return Double.compare(point, o.point);
    }

    public Student(String name, String surname, String group, int course, String specialization, double point) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.course = course;
        this.specialization = specialization;
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", specialization='" + specialization + '\'' +
                ", point=" + point +
                '}';
    }
}