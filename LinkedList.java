public class LinkedList<E> {

    private Node first;
    private Node last;

    private class Node {
        private E value;
        private Node next;

        public Node(E node) {
            value = node;
            next = null;
        }
    }

    public LinkedList() {
        first = null;
        last = null;
    }

    private Node getNodeAt(int index) {
        Node current = first;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }

    private void defineLast() {
        Node current = first;

        if (first == null) {
            last = first;
            return;
        }

        while (true) {
            if (current.next == null) {
                break;
            }
            current = current.next;
        }
        
        last = current;
    }

    public E get(int index) {
        return getNodeAt(index).value;
    }

    public void add(int index, E node) {
        Node newNode = new Node(node);

        if (first == null) {
            first = newNode;
            defineLast();
            return;
        }

        if (index <= 0) {
            addFirst(node);
            return;
        }

        newNode.next = getNodeAt(index - 1).next;
        getNodeAt(index - 1).next = newNode;

        defineLast();
    }

    public void remove(int index) {
        Node current = getNodeAt(index);

        if (current != null) {
            getNodeAt(index - 1).next = current.next;
            defineLast();
        }
    }

    public int size() {
        Node current = first;
        int size = 0;

        while (current != null) {
            current = current.next;
            size++;
        }

        return size;
    }

    public E getFirst() {
        return first.value;
    }

    public E getLast() {
        return last.value;
    }

    public void addFirst(E node) {
        Node new_first = new Node(node);
        new_first.next = first;

        first = new_first;
        defineLast();
    }

    public void addLast(E node) {
        Node new_last = new Node(node);

        if (first == null) {
            first = new_last;
            defineLast();
            return;
        }

        last.next = new_last;
        last = new_last;
        defineLast();
    }

    public void removeFirst() {
        first = first.next;
        defineLast();
    }

    public void removeLast() {
        Node current = first;

        while (true) {
            if (current.next == last)
                break;

            current = current.next;
        }

        last = current;
        last.next = null;
        defineLast();
    }

    public void printList() {
        for (int i = 0; i < size(); i++) {
            System.out.print(get(i) + " ");
        }
    }
}
  