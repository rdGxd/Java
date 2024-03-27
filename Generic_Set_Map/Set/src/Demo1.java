import java.util.LinkedHashSet;
import java.util.Set;

public class Demo1 {
    public static void demo1(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        // HashSet é a mais rápida só que ele nao garante a ordem
        // TreeSet ele ordena os dados
        // LinkedHasset mantem a ordem

        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

//        set.remove("Tablet");
//        set.removeIf(x -> x.length() <= 3);

        for (String p : set) {
            System.out.println(p);
        }
    }
}