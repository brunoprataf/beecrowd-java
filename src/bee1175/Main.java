import java.util.Scanner;
 
/*
 * Beecrowd 1175 - Troca em Vetor I
 * Linguagem: Java
 * Data: 21/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int[] A = new int[20];

    for (int r = 0; r < 20; r++) {

        A[r] = teclado.nextInt();

    }

    for (int i = 0; i < 10; i++) {

        int temp = A[i];

        A[i] = A[19 - i];

        A[19 - i] = temp;
    }

    for (int i = 0; i < 20; i++) {
        System.out.println("N[" + i + "] = " + A[i]);
    }
 
    }
 
}
