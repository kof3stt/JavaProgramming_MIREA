package random;
import java.text.Format;
import java.text.DecimalFormat;

public class Report {
    public static void generateReport(Employee[] data){
        for (int i = 0; i<data.length;i++){
            //System.out.printf("%-15s %15s %n", data[i].getFullName(), data[i].getSalary());
            System.out.printf("%-15s %15s %n", data[i].getFullName(), data[i].getSalary());
        }
    }
}
