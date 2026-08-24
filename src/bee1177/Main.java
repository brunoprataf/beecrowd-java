import java.util.Scanner;
 
/*
 * Beecrowd 1177 - Preenchimento de Vetor II
 * Linguagem: Java
 * Data: 24/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int[] seq = new int[1000];

    int T = teclado.nextInt();

    for (int i = 0; i < 1000; i++) {
        seq[i] = i % T;

        System.out.println("N[" + i + "] = " + seq[i]);
    }
 
    }
 
}
