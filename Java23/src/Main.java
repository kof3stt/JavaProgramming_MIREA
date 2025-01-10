
public class Main {
    public static void main(String[] args) {
        System.out.println("ArrayQueueModule:"); // singleton
        ArrayQueueModule queue1 = ArrayQueueModule.getInstance();
        for (int i = 1; i <= 5; i++) {
            queue1.enqueue(i);
        }
        System.out.println(queue1);
        int res = queue1.dequeue();
        System.out.println(res);
        System.out.println(queue1);
        queue1.enqueue(99);
        System.out.println(queue1);
        System.out.println("-----------------------------------------------");


        System.out.println("ArrayQueueADT:"); // реализация с явной передачей ссылки (очередь не хранится в классе)
        ArrayQueueADT queue2 = new ArrayQueueADT();
        for (int i = 0; i < 5; i++) {
            ArrayQueueADT.enqueue(queue2, i);
        }
        System.out.println(queue2);
        res = ArrayQueueADT.dequeue(queue2);
        System.out.println(res);
        System.out.println(queue2);
        ArrayQueueADT.enqueue(queue2, 100);
        ArrayQueueADT.enqueue(queue2, 1);
        System.out.println(queue2);
        System.out.println(ArrayQueueADT.peek(queue2));
        System.out.println("-----------------------------------------------");


        System.out.println("LinkedQueue:"); // реализация на списке
        AbstractQueue<Integer> queue = new LinkedQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(777);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println("-----------------------------------------------");


        System.out.println("ArrayQueue:"); // классическая реализация
        queue = new ArrayQueue<>(5);
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(15);
        System.out.println(queue);
        queue.clear();
        System.out.println(queue);
    }
}