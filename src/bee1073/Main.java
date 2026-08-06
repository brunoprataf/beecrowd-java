import java.util.Scanner;
 
/*
 * Beecrowd 1073 - Quadrado de Pares
 * Linguagem: Java
 * Data: 06/08/2026
 * Status: Accepted
 */
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int N;

    N = teclado.nextInt();

    if (N % 2 == 0) {
        for (int i = 2; i <= N; i += 2) {
            System.out.println(i+"^2 = " + i * i);
        }
    }
 
    }
 
}
