import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExemploStream01 {
    public static void exemplo01(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        // Criando uma stream apartir de uma coleção
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

        // Criando uma stream usando stream.of
        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        // Criando stream usando o iterate
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        // Fibonnaci
        Stream<Long> st4 = Stream.iterate(new Long[]{0L, 1L}, p -> new Long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));
    }
}