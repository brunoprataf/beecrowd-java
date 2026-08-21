import java.util.Scanner;
 
/*
 * Beecrowd 1174 - Seleçao em Vetor I
 * Linguagem: Java
 * Data: 21/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    double[] A = new double[100];

    for (int r = 0; r < 100; r++) {
        A[r] = teclado.nextDouble();
    }

        for (int i = 1; i < 100; i++) {
            if (A[i] <= 10) {
                System.out.printf("A[%d] = %.1f%n", i, A[i]);
            }

        }
 
    }
 
}
