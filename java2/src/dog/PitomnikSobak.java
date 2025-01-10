package dog;
import java.util.ArrayList;
import java.util.Scanner;
public class PitomnikSobak {
    private ArrayList<Dog> dogs;

    public ArrayList<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(ArrayList<Dog> dogs) {
        this.dogs = dogs;
    }
    public void add_dog(int n){
        this.dogs = new ArrayList<>(n);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n;i++)
        {
            System.out.println("Введите кличку и возраст собаки: ");
            dogs.add(new Dog(sc.next(), sc.nextInt()));
        }
    }

    @Override
    public String toString() {
        return "PitomnikSobak{" +
                "dogs=" + dogs +
                '}';
    }
}
