
public class LinkedQueue<E> extends AbstractQueue<E> {
    private Node<E> front;
    private Node<E> tail;

    @Override
    protected void addElement(E element) {
        if (size == 0) {
            front.setData(element);
            return;
        }
        tail.setNext(new Node<>(front, element));
        tail = tail.getNext();
    }

    @Override
    protected E deleteElement() {
        Node<E> element = front;
        tail.setNext(front.getNext());
        front = front.getNext();

        return element.getData();
    }

    @Override
    protected void initializeQueue() {
        front = new Node<>(null, null);
        tail = front;
    }

    @Override
    protected E findElement() {
        return front.getData();
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        Node<E> node = front;
        do {
            stringBuilder.append(node.getData()).append(" ");
            node = node.getNext();
        } while (node != front);

        return stringBuilder.toString();
    }

    private static class Node<E> {
        private Node<E> next;
        private E data;

        public Node(Node<E> next, E data) {
            this.next = next;
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }
    }
}