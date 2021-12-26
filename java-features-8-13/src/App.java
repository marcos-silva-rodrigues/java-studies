import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

//        String str = """ Hello """;

        String black = "";

        System.out.println(black.isBlank());
        System.out.println(black.lines());

//        Set<String> listSet = new HashSet<String>();
//        listSet.add("ADSDS");
//        listSet.add("ADSDS");
//        listSet.add("ADSDS");

        Set<String> listSet = Set.of("A1", "A2", "A3");

        Stream.iterate(2, number -> number * 2 )
                .limit(10)
                .forEach(System.out::println);

        System.out.println("Hello world");


        Integer status = 0;

//        switch (status) {
//            case 1 -> System.out.println("Numero 1");
//            case 2 -> System.out.println("Numero 2");
//            default -> {
//                System.out.println("Numero 1");
//            }
//        }

//        Integer n = switch (status) {
//            case 1:
//                System.out.println("Numero 1");
//                yield 1;
//            case 2:
//                System.out.println("Numero 2");
//                yield 2;
//            default:
//                throw  new Exception("Erro");
//        };
    }
}
