import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var queue = new PriorityQueue<Integer>((a, b) -> Integer.compare(a, b));
        Scanner sc = new Scanner(System.in);
        
        while(true) {

            System.out.println("\nCrie uma Queue! Digite uma opçao:\n");
            System.out.println("1. Adicionar um elemento à queue.");
            System.out.println("2. Visualizar o elemento de maior valor.");
            System.out.println("3. Remover o elemento de maior valor.");
            System.out.println("4. Ver o tamanho da queue.");
            System.out.println("5. Printar todos os elementos da queue.");
            System.out.println("0. Sair.\n");

            int op = sc.nextInt();

            if (op == 1) {
                System.out.print("Digite o valor que deseja adicionar: ");
                int value = sc.nextInt();
                queue.add(value);
                System.out.println();

            } else if (op == 2) {
                System.out.printf("O maior elemento é: " + queue.peek());
                System.out.println();

            } else if (op == 3) {
                System.out.printf("Elemento " + queue.peek() + " removido!");
                queue.pool();
                System.out.println();

            } else if (op == 4) {
                System.out.printf("O tamanho da queue é: " + queue.size());
                System.out.println();

            } else if (op == 5) {
                System.out.print("Queue: ");
                queue.printQueue();
                System.out.println();

            } else if (op == 0) {
                break;

            } else {
                continue;

            }

        }
        sc.close();

    }

    public static class Request {
        public int priority;
        public String value;

        Request(int priority, String value) {
            this.priority = priority;
            this.value = value;
        }

        public static int compare(Request req1, Request req2) {
            return req1.priority - req2.priority;
        }
    } // var arr = new LinkedList<Integer>(); // arr.addLast(1);
    // arr.addLast(3);
    // arr.addLast(7);
    // arr.addLast(8); // arr.add(0, 2); // arr.printList(); // //
    // System.out.printf(" - " + arr.get(3)); // var queue = new
    // PriorityQueue<Integer>((a, b) -> Integer.compare(a, b)); // queue.add(1);
    // queue.add(11);
    // queue.add(5);
    // queue.add(0);
    // queue.add(3);
    // queue.add(7);

    // queue.printQueue(); // queue.pool(); // queue.printQueue();
}