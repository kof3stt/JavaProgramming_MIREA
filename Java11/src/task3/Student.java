package task3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    String fullName;
    int age;
    Date birthday;
    String group;
    int course;
    String specialization;

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthday() {
        return birthday;
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

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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

    public Student(String fullName, int age, Date birthday, String group, int course, String specialization) {
        this.fullName = fullName;
        this.age = age;
        this.birthday = birthday;
        this.group = group;
        this.course = course;
        this.specialization = specialization;
    }
    public String toString(String Format) {
        switch (Format) {
            case "short":
                SimpleDateFormat dateFormatter1 = new SimpleDateFormat("dd-M-yyyy");
                return dateFormatter1.format(this.birthday);
            case "mid":
                SimpleDateFormat dateFormatter2 = new SimpleDateFormat("E, M.dd, yyyy");
                return dateFormatter2.format(this.birthday);
            case "full":
                SimpleDateFormat dateFormatter3 = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
                return dateFormatter3.format(this.birthday);
        }
        return "Error format";
    }

    public Student() {
        this.birthday = new Date();
    }
}
