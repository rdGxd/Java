import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file full path: ");
        String path = sc.nextLine();
        Map<String, Integer> result = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                if (!result.containsKey(fields[0])) {
                    result.put(fields[0], Integer.parseInt(fields[1]));
                } else {
                    result.put(fields[0], Integer.parseInt(fields[1]) + result.get(fields[0]));
                }
                line = br.readLine();
            }

            for (String s : result.keySet()) {
                System.out.println(s + ": " + result.get(s));
            }
        } catch (IOException e)  {
            System.out.println("Error:" + e.getMessage());
        }
        sc.close();
    }
}