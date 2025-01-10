package random;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] data = {new Employee("vlad",100000),new Employee("vova",12000),new Employee("sasha",155555)};
        Report.generateReport(data);
    }
}
