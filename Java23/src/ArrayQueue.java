
public class ArrayQueue<E> extends AbstractQueue<E> {
    private int capacity; // вместимость
    private int front; // первый элемент очереди
    private int tail; // последний элемент очереди
    private E[] array; // очередь

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        front = -1;
        tail = -1;
        array = (E[]) new Object[capacity];
    }

    private E[] createNewArray() { // создать новую очередь
        E[] newArray = (E[]) new Object[capacity * 2];
        for (int i = front, j = 0; i != tail + 1; i = (i + 1) % capacity, j++) {
            newArray[j] = array[i];
        }

        return newArray;
    }

    @Override
    protected void initializeQueue() {
        front = 0;
    } // инициализация очереди

    protected void increaseCapacity() {
        array = createNewArray();
        capacity *= 2;
    }

    @Override
    public boolean isEmpty() {
        return front == -1;
    } // нет первого элемента

    @Override
    protected void addElement(E element) {
        tail = (tail + 1) % capacity;
        array[tail] = element;
        size++;
        if (size >= 0.75 * capacity) {
            increaseCapacity();
        }
    }

    @Override
    public E deleteElement() {
        E element = array[front];
        front = (front + 1) % capacity;
        if (front == tail) {
            front = -1;
            tail = -1;
        }

        return element;
    }

    @Override
    protected E findElement() {
        return array[front];
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = front; i != tail; i = (i + 1) % size) {
            stringBuilder.append(array[i]).append(" ");
        }
        stringBuilder.append(array[tail]);
        return stringBuilder.toString();
    }
}
