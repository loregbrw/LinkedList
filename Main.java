class Main {
  public static void main(String[] args) {
        var arr = new LinkedList<Integer>();

        arr.addLast(1);
        arr.addLast(3);

        System.out.println(arr.getLast());
        System.out.println(arr.getFirst());
  }
}