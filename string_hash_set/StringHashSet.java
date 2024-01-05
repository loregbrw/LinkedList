package string_hash_set;

import java.util.*;

public class StringHashSet {

    public ArrayList<String>[] data;

    public StringHashSet() {
        data = new ArrayList[100];
        
        for (int i = 0; i < 100; i++) {
            data[i] = new ArrayList<String>();
        }
    }

    public void add(String value) {
        int hash_value = value.hashCode();
        int mod = Math.abs(hash_value % 100);

        if (data[mod] == null) {
            data = new ArrayList[100];
            
            for (int i = 0; i < 100; i++) {
                data[i] = new ArrayList<String>();
            }
        }

        data[mod].add(value);
    }

    public boolean contains(String value) {
        int hash_value = value.hashCode();
        int mod = Math.abs(hash_value % 100);

        for (var str : data[mod]) {
            if (value.equals(str)) {
                return true;
            }
        }

        return false;
    }


}
