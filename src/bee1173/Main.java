import java.util.Scanner;
 
/*
 * Beecrowd 1173 - Preenchimento de Vetor I
 * Linguagem: Java
 * Data: 21/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int[] N = new int[10];
    int V = teclado.nextInt();

    N[0] = V;
    System.out.println("N[0] = " + N[0]);

    for (int i = 1; i < 10; i++) {
        N[i] = N[i - 1] * 2;
        System.out.println("N[" + i + "] = " + N[i]);
    }
    
    }
 
}
