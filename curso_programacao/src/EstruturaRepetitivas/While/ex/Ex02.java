package EstruturaRepetitivas.While.ex;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void ex02(String[] args) {
// Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
// um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
// 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
// que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
// mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
// exemplo


    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("1. Álcool");
    System.out.println("2. Gasolina");
    System.out.println("3. Diesel");
    System.out.println("4. Fim");
    int x = sc.nextInt();
    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;

    while (x >= 1 && x <= 4) {
      if (x == 1) {
        alcool += 1;
        x = sc.nextInt();
      } else if (x == 2) {
        gasolina += 1;
        x = sc.nextInt();
      } else if (x == 3) {
        diesel += 1;
        x = sc.nextInt();
      } else {
        System.out.println("MUITO OBRIGADO");
        break;
      }
    }

        System.out.printf("Alcool: %d%n", alcool);
        System.out.printf("Gasolina: %d%n", gasolina);
        System.out.printf("Diesel: %d%n", diesel);


    sc.close();
  }
}
