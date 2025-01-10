//Написать класс, который умеет хранить в себе массив любых типов
//данных (int, long etc.).
public class Task2<T> {
    private T[] array;

    public Task2(int size) {
        array = (T[]) new Object[size];
    }

    public void set(int index, T value) {
        array[index] = value;
    }

    public T get(int index) {
        return array[index];
    }

    public int length() {
        return array.length;
    }

    public static void main(String[] args) {
        Task2 <Integer> intArray = new Task2<>(5);

        // Устанавливаем значения в массиве
        intArray.set(0, 10);
        intArray.set(1, 20);
        intArray.set(2, 30);
        intArray.set(3, 40);
        intArray.set(4, 50);

        System.out.println("Element at index 1: " + intArray.get(1));

        Task2 <String> stringArray = new Task2 <>(3);

        stringArray.set(0, "Egor");
        stringArray.set(1, "Leonidov");
        stringArray.set(2, "!");

        System.out.println("Element at index 0: " + stringArray.get(0));
    }
}