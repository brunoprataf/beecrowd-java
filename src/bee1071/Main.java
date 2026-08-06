import java.util.Scanner;
 
/*
 * Beecrowd 1071 - Soma de Impares Consecutivos I
 * Linguagem: Java
 * Data: 06/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int X, Y, menor, maior, soma;

    X = teclado.nextInt();
    Y = teclado.nextInt();
    soma = 0;

   if (X < Y) {
       menor = X;
       maior = Y;
   } else {
       menor = Y;
       maior = X;
   }

   for (int i = menor + 1; i < maior; i++) {

       if (i % 2 != 0) {
           soma += i;
       }
   }
   System.out.println(soma);
 
    }
 
}
