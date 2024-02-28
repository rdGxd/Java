public class Vetores1 {
  public static void vetores1(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    double[] vect = new double[n];

    for (int i = 0; i < n; i++) {
      vect[i] = sc.nextDouble();
    }

    double sum = 0.0;

    for (int i = 0; i < n; i++) {
      sum += vect[i];
    }

    System.out.printf("MEDIA: %.2f", sum / n);
    sc.close();
  }
}
