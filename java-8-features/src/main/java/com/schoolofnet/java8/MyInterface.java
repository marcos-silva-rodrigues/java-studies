package main.java.com.schoolofnet.java8;

@FunctionalInterface
public interface MyInterface {
    void print();

    default void body() {
        System.out.println("This is my interface function body");
    }
}
