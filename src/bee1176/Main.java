import java.util.Scanner;
 
/*
 * Beecrowd 1176 - Fibonacci em Vetor
 * Linguagem: Java
 * Data: 24/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    long[] fib = new long[61];

    fib[0] = 0;
    fib[1] = 1;

    for (int i = 2; i <= 60; i++) {
        fib[i] = fib[i - 1] + fib[i - 2];
    }

    int T = teclado.nextInt();

    for (int r = 1; r <= T; r++) {

        int N = teclado.nextInt();

        System.out.println("Fib(" + N + ") = " + fib[N]);
    }
 
    }
 
}
