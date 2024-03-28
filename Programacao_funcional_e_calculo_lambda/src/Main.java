import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        // Programação não funcional
//        Integer sum = 0;
//        for (Integer x : list) {
//            sum += x;
//        }

        // Programação Funcional
        Integer sum = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}