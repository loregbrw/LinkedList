public class LinkedListNode<E> {
    public E value;
    public LinkedListNode<E> next;

    public LinkedListNode(E node) {
        value = node;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E node) {
        value = node;
    }

    public E getNext() {
        return next.value;
    }

    public void setNext(E node) {
        next.value = node;
    }
}
