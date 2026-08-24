import java.util.Scanner;
 
/*
 * Beecrowd 1178 - Preenchimento de Vetor III
 * Linguagem: Java
 * Data: 24/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    double[] N = new double[100];

    double X = teclado.nextDouble();

    N[0] = X;
    System.out.printf("N[0] = %.4f%n", X);

    for (int i = 1; i < 100; i++) {
        N[i] = N[i - 1] / 2;

        System.out.printf("N[%d] = %.4f%n", i, N[i]);
    }

 
    }
 
}
