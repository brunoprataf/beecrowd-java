import java.util.Scanner;
 
/*
 * Beecrowd 1153 - Fatorial Simples
 * Linguagem: Java
 * Data: 17/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int N = teclado.nextInt();

    int multiplicacao = 1;

    for (int i = 1; i <= N; i++) {
        multiplicacao *= i;
    }

        System.out.println(multiplicacao);
 
    }
 
}
