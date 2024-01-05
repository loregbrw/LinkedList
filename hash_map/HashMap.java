package hash_map;
import java.util.*;

import javax.print.DocFlavor.STRING;

public class HashMap<E> {
    private LinkedList<KeyValuePair<E>>[] data;

    HashMap() {
        data = new LinkedList[100];
    }

    public void add(String key, E value) {
        KeyValuePair<E> newItem = new KeyValuePair<E>(key, value);

        int mod = Math.abs(key.hashCode() % 100);

        if (data[mod] == null) {
            data[mod] = new LinkedList<KeyValuePair<E>>();
        }
        data[mod].add(newItem);
    }

    public E get(String key) {
        int mod = Math.abs(key.hashCode() % 100);

        for (int i = 0; i < data[mod].size(); i++) {
            KeyValuePair<E> current = data[mod].get(i);

            if (current.key.compareTo(key) == 0) {
                return current.value;
            }
        }
        throw new NoSuchElementException();
    }

    public boolean contains(String key) {
        int mod = Math.abs(key.hashCode() % 100);

        for (int i = 0; i < data[mod].size(); i++) {
            KeyValuePair<E> current = data[mod].get(i);

            if (current.key.compareTo(key) == 0) {
                return true;
            }
        }
        return false;
    }

    public HashMapIterator<E> iterator() {
        return new HashMapIterator<E>(this.data);
    }

}
