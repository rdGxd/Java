public class Aula01 {
  public static void aula01(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<String> list = new ArrayList<>();

    list.add("Maria");
    list.add("Alex");
    list.add("Bob");
    list.add("Anna");
    list.add("Ahri");
    list.add("Aaaa");

    for (String x : list) {
      System.out.println(x);
    }

    System.out.println("------------------------------------------------------------");
    System.out.println("Index of Bob:" + list.indexOf("Bob")); // Quando nao encontra o elemento retorna -1

    list.add(2, "Rodrigo"); // Na posição 2 eu adiciono o Rodrigo
    System.out.println(list.size()); // Tamanho da lista
    list.remove("Anna"); // Removendo na lista pelo nome
    list.remove(1); // Removendo na lista pela posição
    list.removeIf(x -> x.charAt(0) == 'M'); // Removendo todo mundo que começa com a letra M

    for (String x : list) {
      System.out.println(x);
    }
    System.out.println("------------------------------------------------------------");
    // pegando todo mundo que começa com a letra A
    List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
    System.out.println(result);

    System.out.println("------------------------------------------------------------");
    // Pegando o primeiro elemento que começa com J
    String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
    System.out.println(name);

    sc.close();
  }
}
