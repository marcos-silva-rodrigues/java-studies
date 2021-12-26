import java.util.Random;
import java.util.Stack;

public class StackImpl {

    public static void main(String[] args) {
        Stack stack = new Stack();

        Random random = new Random();

        for (int i = 5; i != 0; i--) {
            stack.push(random.nextInt(20));
        }

        stack.forEach(System.out::println);

        System.out.println(stack.isEmpty());
        System.out.println(stack.get(0));
    }
}
