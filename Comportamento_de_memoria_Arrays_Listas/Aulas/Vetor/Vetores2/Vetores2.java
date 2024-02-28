public class Vetores2 {
  // VETOR DO OBJETO TIPO CLASSE
  public static void vetores2(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Product[] vect = new Product[n];

    for (int i = 0; i < vect.length; i++) {
      sc.nextLine();
      String name = sc.nextLine();
      double price = sc.nextDouble();
      vect[i] = new Product(name, price);
    }

    double sum = 0.0;

    for (int i = 0; i < vect.length; i++) {
      sum += vect[i].getPrice();
    }

    System.out.printf("MEDIA: %.2f%n", sum / n);
    sc.close();
  }
}
