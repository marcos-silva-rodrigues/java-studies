import java.util.Comparator;

public class Person  implements Comparator<Person>, Comparable<Person> {

    private String name;

    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
    }

    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }
}
