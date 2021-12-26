import java.util.Vector;

public class VectorImpl {

    public static void main(String[] args) {
        int[] arr = new int[10];

        arr[0] = 1;

        Vector v = new Vector();
        v.addElement(1);
        v.addElement("A");

        System.out.println(v.size());

        while (v.iterator().hasNext()) {
            System.out.println(v.iterator().next());
        }

    }
}
