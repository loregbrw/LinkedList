public class LinkedList<E> {

    private LinkedListNode first;
    private LinkedListNode last;

    private class LinkedListNode {
        private E value;
        private LinkedListNode next;
    }

    public LinkedList() {
        first = null;
        last = null;
    }

    public void addLast(E node) {
        if (first == null) {
            first.value = node;
        }
    }

    
}
