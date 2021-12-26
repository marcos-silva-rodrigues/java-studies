import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {

    public static void main(String[] args) {
        Queue fila = new LinkedList();

        fila.add("a");
        fila.add("b");


        fila.forEach(System.out::println);

        System.out.println("Element " + fila.element());
        System.out.println("Poll " + fila.poll());
        System.out.println("Poll " + fila.remove());
        System.out.println("Peek " + fila.peek());
    }
}
