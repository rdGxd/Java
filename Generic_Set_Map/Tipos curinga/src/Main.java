import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myNumbers = Arrays.asList(5, 2, 10);
        printList(myNumbers);

        List<String> myNames = Arrays.asList("Maria", "Rodrigo");
        printList(myNames);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}