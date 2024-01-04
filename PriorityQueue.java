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
            if (cmp.compare((E)value, (E)data.get(i)) < 0) {
                data.add(i, value);
                return;
            }
        }
        data.addFirst(value);
    }

    public E peek() {
        return data.getLast();
    }

    public void pool() {
        data.removeLast();
    }

    public void printQueue() {
        for(int i = 0; i < size(); i++) {
            System.out.print(data.get(i) + " ");
        }
    }
}
