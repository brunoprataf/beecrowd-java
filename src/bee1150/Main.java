import java.util.Scanner;
 
/*
 * Beecrowd 1150 - Ultrapassando Z
 * Linguagem: Java
 * Data: 14/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
  Scanner teclado = new Scanner(System.in);

  int X = teclado.nextInt();
  int Z = teclado.nextInt();

  while (Z <= X) {
    Z = teclado.nextInt();
  }

  int soma = 0;
  int quantidade = 0;
  int numero = X;

  while (soma <= Z) {
    soma += numero;
    quantidade++;
    numero++;
  }

  System.out.println(quantidade);
 
    }
 
}
