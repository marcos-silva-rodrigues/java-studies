public class Main {

    public static void main(String[] args) {
        Person person = new Person("Marcos", 20);
        person.cpf = "111-111-111/11";

        System.out.println("Hello World! " + person.getName());

        Car car = new Car();
        car.setColor("Red");
        car.setTopSpeed(220.0);

        car.methodOverriding();
        CarComposition carComposition = new CarComposition();
        carComposition.getVechicle().methodOverriding();

        carComposition.setVechicle(car);
        carComposition.getVechicle().methodOverriding();
        System.out.println(carComposition.getVechicle().getColor());
//        person.say();
//        System.out.println(Person.walk());
    }
}
