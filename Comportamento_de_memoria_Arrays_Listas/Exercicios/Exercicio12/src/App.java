import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos estudantes vão alugar os quartos? ");
    int n = sc.nextInt();
    String[] nome = new String[10];
    String[] email = new String[10];
    int[] quartos = new int[10];

    for (int i = 0; i < n; i++) {
      sc.nextLine();
      System.err.println();
      System.out.printf("Estudante #%d:%n", i + 1);
      System.out.print("Nome: ");
      String nomeAluno = sc.nextLine();

      System.out.print("Email: ");
      String emailAluno = sc.nextLine();

      System.out.printf("Room: ");
      int quartoAluno = sc.nextInt();

      nome[quartoAluno] = nomeAluno;
      email[quartoAluno] = emailAluno;
      quartos[quartoAluno] = quartoAluno;
    }

    System.err.println();
    System.out.println("Quartos ocupados:");
    for (int i = 0; i < quartos.length; i++) {
      if (quartos[i] != 0) {
        System.out.printf("%d: %s, %s%n", quartos[i], nome[i], email[i]);
      }
    }
    sc.close();
  }
}
