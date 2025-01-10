import java.util.Arrays;

class MyArrayList<T> {
    private static final int DEFAULT_SIZE = 10; // размер по умолчанию

    private T[] data; // массив
    private int size; // текущий размер

    public MyArrayList() { // конструктор
        this.data = (T[]) new Object[DEFAULT_SIZE];
        this.size = 0;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("IndexError: Index: " + index + ", Size: " + size);
        }
        return data[index];
    }

    public void add(T newItem) {
        ensureSize();
        data[size++] = newItem;
    }

    public void remove(int index) { // удалить элемент в позиции
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("IndexError: Index: " + index + ", Size: " + size);
        }

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        data[--size] = null;
    }

    public boolean isEmpty(){
        if (size==0){
            return true;
        }
        return false;
    }

    private void ensureSize() {
        if (size == data.length) {
            int newCapacity = data.length * 2;
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
}
