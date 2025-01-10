public abstract class AbstractQueue<E> implements Queue<E>{
    protected int size;

    protected abstract void addElement(E element);
    protected abstract E deleteElement();
    protected abstract void initializeQueue();
    protected abstract E findElement();

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void enqueue(E element) { // insert elements to the queue
        if (isEmpty()) {
            initializeQueue();
        }
        addElement(element);
        size++;
    }

    @Override
    public E dequeue() { // delete element from the queue
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            return null;
        }

        size--;
        return deleteElement();
    }

    @Override
    public void clear() { // очистить очередь
        while (!isEmpty()) {
            dequeue();
        }
    }

    @Override
    public E peek() { // Возвращает объект в начале очереди
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            return null;
        }

        return findElement();
    }
}
