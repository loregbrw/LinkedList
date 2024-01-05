package string_hash_set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        var arr = new StringHashSet();

        

        arr.add("Hello world");
        arr.add("Hello world1");
        arr.add("Hello world2");

        var it = new HashSetIterator(arr);
        
        System.out.println(arr.contains("Hello world"));
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());


    }
}
