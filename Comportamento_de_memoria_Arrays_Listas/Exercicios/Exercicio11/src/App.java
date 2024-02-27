import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantas pessoas serão digitadas? ");
    int n = sc.nextInt();

    double menor = 999;
    double maior = 0;
    double mediaF = 0.0;
    int numberWomans = 0;
    int numberMans = 0;

    double[] altura = new double[n];
    char[] genero = new char[n];

    for (int i = 0; i < n; i++) {
      System.out.printf("Altura da %da pessoa: ", i + 1);
      altura[i] = sc.nextDouble();
      sc.nextLine();
      System.out.printf("Gênero da %da pessoa: ", i + 1);
      genero[i] = sc.nextLine().toLowerCase().charAt(0);
    }

    for (int i = 0; i < n; i++) {
      if (altura[i] > maior) {
        maior = altura[i];
      } else if (altura[i] < menor) {
        menor = altura[i];
      }
    }

    for (int i = 0; i < n; i++) {
      if (genero[i] == 'f') {
        numberWomans++;
        mediaF += altura[i];
      } else {
        numberMans++;
      }
    }

    System.out.println("Menor altura = " + menor);
    System.out.println("Maior altura = " + maior);
    System.out.printf("Media das alturas das mulheres = %.2f%n", mediaF / numberWomans);
    System.out.println("Numero de homens = " + numberMans);

    sc.close();
  }
}
