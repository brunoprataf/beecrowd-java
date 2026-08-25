import java.util.Scanner;
 
/*
 * Beecrowd 1180 - Menor e Posição
 * Linguagem: Java
 * Data: 25/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int N = teclado.nextInt();

    int[] X = new int[N];

    for (int r = 0; r < N; r++) {
        X[r] = teclado.nextInt();

    }

        int menor = X[0];
        int posicao = 0;

        for (int i = 1; i < N; i++) {

            if (X[i] < menor) {
                menor = X[i];
                posicao = i;
            }

        }

    System.out.println("Menor valor: " + menor);
    System.out.println("Posicao: " + posicao);
 
    }
 
}
