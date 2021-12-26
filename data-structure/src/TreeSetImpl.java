import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImpl {

    public static void main(String[] args) {

        TreeSet tree = new TreeSet();

        tree.add("M");
        tree.add("A");
        tree.add("R");
        tree.add("C");
        tree.add("O");
        tree.add("S");

        System.out.println(tree);

        Iterator iterator = tree.iterator();;

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(tree.first());
        System.out.println(tree.last());
        System.out.println(tree.isEmpty());
    }
}
