public interface Queue<E> {
    void enqueue(E element); // добавление в очередь
    E dequeue(); // удаление из очереди последнего вставленного элемента
    E peek(); // Возвращает объект в начале очереди
    int getSize(); // размер очереди
    boolean isEmpty();
    void clear();
}
