public class Vetores3 {
  public static void vect3(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    String[] vect = new String[] { "Maria", "Bob", "Alex" };

    // For each
    for (String apelido : vect) {
      System.out.println(apelido);
    }

    sc.close();
  }
}
