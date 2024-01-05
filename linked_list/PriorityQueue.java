package linked_list;
import java.util.*;

public class PriorityQueue<E> {
    private LinkedList<E> data;
    private Comparator<E> cmp;

    public PriorityQueue(Comparator<E> comparator) {
        data = new LinkedList<>();
        cmp = comparator;
    }

    public int size() {
        return data.size();
    }

    public void add(E value) {
        for (int i = 0; i < data.size(); i++) {
            if (cmp.compare(value, data.get(i)) < 0) {
                data.add(i, value);
                return;
            }
        }
        data.addLast(value);
    }

    public E peek() {
        return data.getLast();
    }

    public void pool() {
        data.removeLast();
    }

    public void printQueue() {
        data.printList();
    }
}
