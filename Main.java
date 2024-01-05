class Main {
  public static void main(String[] args) {
        // var arr = new LinkedList<Integer>();

        // arr.addLast(1);
        // arr.addLast(3);
        // arr.addLast(7);
        // arr.addLast(8);

        // arr.add(0, 2);


        // arr.printList();

        // System.out.printf(" - " + arr.get(3));

        var queue = new PriorityQueue<Integer>((a, b) -> Integer.compare(a, b));

        queue.add(1);
        queue.add(11);
        queue.add(5);
 
        queue.add(0);
        queue.add(3);
        queue.add(7);
        
        queue.printQueue();

        queue.pool();

        queue.printQueue();
  }
}