public class Person implements IPerson{

    private String name;
    private Integer age;
    public String cpf;

    public Person () {}

    public Person (String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

//    public void say() {
//        System.out.println("I'm saying something..");
//    }
//
    public String walk() {
        return "i am walking...";
    }

    public String walk(String msg) {
        return msg;
    }

    public String walk(String msg, Integer km) {
        return msg + " " + km;
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}
