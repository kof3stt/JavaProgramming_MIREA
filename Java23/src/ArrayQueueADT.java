public class ArrayQueueADT { // реализация с явной передачей ссылки (очередь не хранится в классе)
    private final int size = 10;
    private int front;
    private int tail;
    private int[] array;

    public ArrayQueueADT() {
        front = -1;
        tail = -1;
        array = new int[size];
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.front == -1;
    }

    public static boolean isFull(ArrayQueueADT queue) {
        return (queue.front == 0 && queue.tail == queue.size - 1) || (queue.tail == queue.front - 1);
    }

    public static void enqueue(ArrayQueueADT queue, int element) {
        if (isFull(queue)) {
            System.out.println("Очередь переполнена");
            return;
        }

        if (queue.front == -1) {
            queue.front = 0;
        }

        queue.tail = (queue.tail + 1) % queue.size;
        queue.array[queue.tail] = element;
    }

    public static int dequeue(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
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

    public static int getSize(ArrayQueueADT queue) {
        return queue.size;
    }

    public static void clear(ArrayQueueADT queue) {
        while (!isEmpty(queue)) {
            dequeue(queue);
        }
    }

    public static int peek(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            System.out.println("Очередь пуста");
            return -1;
        }

        return queue.array[queue.front];
    }

    public String toString() {
        if (isEmpty(this)) {
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