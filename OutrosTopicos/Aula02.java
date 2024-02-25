package OutrosTopicos;

import java.util.Locale;
import java.util.Scanner;

public class Aula02 {
    public static void aula02(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    String original = "abcde FGHIJ ABC abc DEFG     ";
    System.out.println("ORIGINAL: " + original);

    // Minusculas
    String s01 = original.toLowerCase();
    System.out.println("toLowerCase: " + s01);
    // Maiúsculas
    String s02 = original.toUpperCase();
    System.out.println("toUpperCase: " + s02);
    // Removendo espaços em brancos nos cantos
    String s03 = original.trim();
    System.out.println("trim: " + s03);
    // Pegando o carácter da posição 2 em diante
    String s04 = original.substring(2); // letra c
    System.out.println("substring(2): " + s04);
    // Pegando o a partir do 2 e abaixo do carácter 9
    String s05 = original.substring(2, 9); // letra I
    System.out.println("substring(2, 9): " + s05);
    // Sempre que achar um "a" trocar pelo "x"
    String s06 = original.replace("a", "x");
    System.out.println("replace('a', 'x'): " + s06);
    // Sempre que achar um "abc" trocar pelo "xy" -> trocando substring
    String s07 = original.replace("abc", "xy");
    System.out.println("replace('abc', 'xy'): " + s07);
    // Pegando a primeira ocorrência do "bc"
    int i = original.indexOf("bc");
    System.out.println("indexOf: " + i);
    // Pegando a ultima ocorrência do "bc"
    int j = original.lastIndexOf("bc");
    System.out.println("lastIndexOf: " + j);

    String s = "potato apple lemon";
    String[] vect = s.split(" ");
    String word1 = vect[0];
    String word2 = vect[1];
    String word3 = vect[2];

    System.out.println(word1);
    System.out.println(word2);
    System.out.println(word3);
    sc.close();
  }
}
