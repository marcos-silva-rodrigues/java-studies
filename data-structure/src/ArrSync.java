import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrSync {

    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(
                new ArrayList<String>()
        );

        List<String>list1 = new CopyOnWriteArrayList<String>();

        list1.add("Marcos");
        list1.add("Fulano");
        list1.add("Teste");

        synchronized (list1) {
            Iterator<String> iterator = list1.iterator();

            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }
}
