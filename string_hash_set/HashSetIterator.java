package string_hash_set;

import java.util.*;

public class HashSetIterator implements Iterator<String> {
    private String current;
    private StringHashSet list;
    private int index;

    public HashSetIterator(StringHashSet list) {
        this.list = list;
        
        for (int i = 0; i < list.data.length; i++) {
            if (list.data[i] != null) {
                current = list.data[i].get(i);
                index = i;
                break;
            }
        }
    }

    public String next() {
        try {
            current = list.data[index].get(list.data[index].indexOf(current) + 1);
        } catch (Exception e) {
            for (int i = 0; i < list.data.length; i++) {
                if (list.data[i] != null) {
                    current = list.data[i].get(i);
                    index = i;
                    return current;
                }
            }   
        }
        return current;
    }

    public boolean hasNext() {
        try {
            list.data[index].get(list.data[index].indexOf(current) + 1);
        } catch (Exception e) {
            for (int i = 0; i < list.data.length; i++) {
                if (list.data[i] != null) {
                    current = list.data[i].get(i);
                    index = i;
                    break;
                }
                i = i == list.data.length - 1 ? 0 : i;
            }   
        }
        return true;
    }
}
