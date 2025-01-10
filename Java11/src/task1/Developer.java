package task1;
import java.util.Date;
import java.util.Random;
public class Developer {
    String fullName;
    String prof;
    int salary;
    Date start;
    Date finish;


    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public Date getStart() {
        return start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Developer() {
        Random random = new Random();
        this.start = new Date();
        this.finish = new Date(start.getTime()+random.nextLong((long)Math.pow(10,20)-(long)Math.pow(10,10) + (long)Math.pow(10,10)));
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }
}
