import java.util.Arrays;

// Transparencia referencial é quando o resultado da função depende exclusivamente dos valores de entrada

public class Exemplo1 {
    public static int globalValue = 3;

    public static void exemplo(String[] args) {
        int[] vect = new int[]{3, 4, 5};
        changeOddValues(vect);
        System.out.println(Arrays.toString(vect));
    }

    // Não tem transparencia referencial
    public static void changeOddValues(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] += globalValue;
            }
        }
    }
}