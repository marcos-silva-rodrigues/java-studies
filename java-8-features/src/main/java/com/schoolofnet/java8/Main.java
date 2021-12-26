package main.java.com.schoolofnet.java8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<String> strs = Arrays.asList("SON", "Java 8");

//        for (String str: strs) {
//            System.out.println(str);
//        }
        strs.forEach(str -> System.out.println(str));
//
        List<String> result = strs.stream()
                .filter(str -> str.startsWith("J"))
                .collect(Collectors.toList());

        result.forEach(System.out::println);

//        Runnable run = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello features java 8");
//            }
//        };
//        new Thread((run)).start();

        Runnable run1 = () -> System.out.println("Hello features java 8");
        new Thread((run1)).start();

        // Java 7
//        MyInterface myInterface = new MyInterface() {
//            @Override
//            public void print() {
//                System.out.println("java 7 implementation - Function interface");
//            }
//        };

        // Java 8
        MyInterface myInterface = () ->
                System.out.println("Java 8 implementation - Function interface");

        myInterface.print();

        Random hash = new Random();

        hash.doubles()
                .limit(2)
                .forEach(System.out::println);

        List<Person> people = new ArrayList<Person>();
        Person person1 = new Person("Marcos");
        Person person2 = new Person("Fulano");
        Person person3 = new Person("Ciclano");
        Person person4 = new Person(null);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        people.forEach(p -> {
            Optional<String> op = Optional
                    .ofNullable(p.getName());

            op.ifPresent(System.out::println);
        });

        Instant now = Instant.now();
        System.out.println(now);

        Thread.sleep(1000);
        Instant now2 = Instant.now();

        Duration dur = Duration.between(now,now2);
        System.out.println(dur.getSeconds());

        LocalDate local = LocalDate.now();
        System.out.println(local);

        LocalDate birthday1 = LocalDate.of(2001, 07, 05);
        System.out.println(birthday1);

        Period period = Period.between(birthday1, local);
        System.out.println(period.getYears());


        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

        try {
            nashorn.eval("print('HELLO WORLD FROM NASHORN');");
        } catch (ScriptException ex) {
            ex.getStackTrace();
        }
    }
}
