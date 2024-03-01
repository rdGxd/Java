import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número de linhas e colunas");
    int m = sc.nextInt();
    int n = sc.nextInt();
    int[][] mat = new int[m][n];

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        mat[i][j] = sc.nextInt();
      }
    }

    System.err.println();
    System.out.print("Qual número deseja as informações ? ");
    int x = sc.nextInt();

    System.err.println();
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        if (mat[i][j] == x) {
          System.out.printf("Position: %d,%d%n", i, j);
          if (j > 0) {
            System.out.println("Left: " + mat[i][j - 1]);
          }
          if (i > 0) {
            System.out.println("Up: " + mat[i - 1][j]);
          }
          if (j < mat[i].length - 1) {
            System.out.println("Right: " + mat[i][j + 1]);
          }
          if (i < mat.length - 1) {
            System.out.println("Down: " + mat[i + 1][j]);
          }
        }
      }
    }

    sc.close();
  }
}
