public class ArrayQueueModule {
    private final int size = 10;
    private int front;
    private int tail;
    private final int[] array;
    private static ArrayQueueModule queue; // singleton

    private ArrayQueueModule() {
        front = -1;
        tail = -1;
        array = new int[size];
    }
    public static ArrayQueueModule getInstance() {
        if (queue == null) {
            queue = new ArrayQueueModule();
        }

        return queue;
    }

    //Предусловие: любая очередь
    //Постусловие: в пустой очереди значение front равно -1
    public boolean isEmpty() {
        return queue.front == -1;
    }

    //Предусловие: любая очередь
    //Постусловие: в полной циклической очереди за последним элементом идёт первый элемент
    public boolean isFull() {
        return (queue.tail + 1) % queue.size == queue.front;
    }

    //Предусловие: не полная очередь
    //Постусловие: в конец очереди добавлен элемент, индекс конца увеличен на 1
    public void enqueue(int element) {
        if (queue.isFull()) {
            System.out.println("Очередь переполнена");
            return;
        }

        if (queue.front == -1) {
            queue.front = 0;
        }

        queue.tail = (queue.tail + 1) % queue.size;
        queue.array[queue.tail] = element;
    }

    //Предусловие: не пустая очередь
    //Постусловие: из очереди удалён элемент из начала, индекс начала увеличен на 1.
    //возвращаемое значение - удалённый элемент
    public int dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Очередь пуста");
            return -1;
        }

        int element = queue.array[queue.front];
        queue.front = (queue.front + 1) % queue.size;
        if (queue.front == queue.tail) {
            queue.front = -1;
            queue.tail = -1;
        }

        return element;
    }

    public int getSize() {
        return queue.size;
    }

    public void clear() {
        while (!queue.isEmpty()) {
            queue.dequeue();
        }
    }

    //Предусловие: не пустая очередь
    //Постусловие: возвращает первый элемент из очереди
    public int peek() {
        if (queue.isEmpty()) {
            System.out.println("Очередь пуста");
            return -1;
        }

        return queue.array[queue.front];
    }

    @Override
    public String toString() {
        if (queue.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = queue.front; i != queue.tail; i = (i + 1) % queue.size) {
            stringBuilder.append(queue.array[i]).append(" ");
        }
        stringBuilder.append(queue.array[queue.tail]);
        return stringBuilder.toString();
    }
}