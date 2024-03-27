import entities.Client;

public class Main {
    public static void main(String[] args) {
        String s1 = "Test";
        String s2 = "Test";

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        /* Comparar dois objetos pelos conteudos do objeto use equals */
        System.out.println(c1.equals(c2));
        // Referencia dos objetos
        System.out.println(s1 == s2);
    }
}