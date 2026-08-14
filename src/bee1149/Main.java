import java.util.Scanner;
 
/*
 * Beecrowd 1149 - Somando Inteiros Consecutivos
 * Linguagem: Java
 * Data: 14/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int A = teclado.nextInt();
    int N = teclado.nextInt();

    while (N <= 0) {
        N = teclado.nextInt();
    }

    int soma = 0;

    for (int i = 0; i < N; i++) {
        soma += A + i;
    }

  System.out.println(soma);  
 
    }
 
}
