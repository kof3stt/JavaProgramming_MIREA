package shop;
import java.util.ArrayList;
import java.util.Scanner;
public class Shop {
    private ArrayList <Computer> computers;
    public Shop(int number){
        computers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<number;i++){
            Computer comp = new Computer();
            System.out.println("Введите процессор: ");
            comp.setCPU(sc.nextLine());
            System.out.println("Введите видеокарту: ");
            comp.setGraphics_card(sc.nextLine());
            System.out.println("Введите материнскую плату: ");
            comp.setMotherboard(sc.nextLine());
            System.out.println("Введите оперативную память: ");
            comp.setRAM(sc.nextInt());
            computers.add(comp);
            sc.nextLine();
        }
    }
    public void addComputer() {
        Computer comp = new Computer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите процессор: ");
        comp.setCPU(sc.nextLine());
        System.out.println("Введите видеокарту: ");
        comp.setGraphics_card(sc.nextLine());
        System.out.println("Введите материнскую плату: ");
        comp.setMotherboard(sc.nextLine());
        System.out.println("Введите оперативную память: ");
        comp.setRAM(sc.nextInt());
        computers.add(comp);
    }

    public int deleteComputer(int index) {
        if (index>=0 & index < computers.size()) {
            computers.remove(index);
            return 0;
        }
        return -1;
    }

    public void findComputer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите характеристики компьютера. Введите оперативную память: ");
        int r = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < computers.size();i++){
            if (((computers.get(i)).getRAM())==r){
                flag = true;
                System.out.println("В наличии имеется следующий вариант: ");
                System.out.println(computers.get(i).toString());
            }
        }
        if (!flag)
            System.out.println("В наличии нет компьютера с нужными характеристиками ");

    }

    @Override
    public String toString() {
        return "Shop{" +
                "computers=" + computers +
                '}';
    }
}
