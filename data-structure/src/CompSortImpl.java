import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompSortImpl {

    public static void main(String[] args) {
        List<Person> arr = new ArrayList<Person>();

        arr.add(new Person("Marcos", 20));
        arr.add(new Person("Fulano", 31));
        arr.add(new Person("ciclano", 22));

        arr.forEach(person -> System.out.println(person.getName() + " " + person.getAge()));
        Collections.sort((List) arr);

        arr.forEach(person -> System.out.println(person.getName() + " " + person.getAge()));
        Collections.sort((List) arr, new Person());

        arr.forEach(person -> System.out.println(person.getName() + " " + person.getAge()));
    }
}
