package hash_map;

import java.util.*;

public class HashMapIterator<E> implements Iterator<E> {
    private LinkedList<KeyValuePair<E>>[] list;
    private KeyValuePair<E> currentElement;
    private int currentIndex;

    HashMapIterator(LinkedList<KeyValuePair<E>>[] list) {
        this.list = list;
        currentIndex = 0;
        currentElement = null;
    }

    public E next() {

        int nextElementIndex = list[currentIndex].indexOf(currentElement) + 1;
        if (nextElementIndex < list[currentIndex].size() && list[currentIndex].get(nextElementIndex) != null) {
            currentElement = list[currentIndex].get(nextElementIndex);
        }
        
        for (int i = currentIndex; i < list.length; i++) {
            if (list[i] != null) {
                currentElement = list[i].getFirst();
            }
        }

        return currentElement.getValue();
    }

    public boolean hasNext() {
        int nextElementIndex = list[currentIndex].indexOf(currentElement) + 1;
        if (nextElementIndex < list[currentIndex].size() && list[currentIndex].get(nextElementIndex) != null) {
            return true;
        }
        
        for (int i = currentIndex; i < list.length; i++) {
            if (list[i] != null) {
                return true;
            }
        }
        return false;
    }
}
