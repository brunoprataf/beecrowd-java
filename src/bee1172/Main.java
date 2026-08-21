import java.util.Scanner;
 
/*
 * Beecrowd 1172 - Substituição em Vetor I
 * Linguagem: Java
 * Data: 21/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int [] X = new int[10];

    for (int r = 0; r < 10; r++) {

        X[r] = teclado.nextInt();

        if (X[r] <= 0) {
            X[r] = 1;
        }

        System.out.println("X[" + r + "] = " + X[r]);
    }
 
    }
 
}
