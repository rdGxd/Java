public class Matriz {
  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o tamanho da matriz: ");
    int n = sc.nextInt();
    // Criando a matriz bi-dimensional
    int[][] mat = new int[n][n];

    // Colocando os números dentro da matriz
    for (int i = 0; i < mat.length; i++) { // Linhas
      for (int j = 0; j < mat[i].length; j++) { // Colunas
        mat[i][j] = sc.nextInt();
      }
    }

    System.out.println("Main diagonal: ");
    for (int i = 0; i < n; i++) {
      System.out.print(mat[i][i] + " ");
    }

    int count = 0;

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        if (mat[i][j] < 0) {
          count++;
        }
      }
    }

    System.out.println("Negative numbers = " + count);

    sc.close();
  }
}
