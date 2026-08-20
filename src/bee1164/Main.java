import java.util.Scanner;
 
/*
 * Beecrowd 1164 - Número Perfeito
 * Linguagem: Java
 * Data: 20/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int N = teclado.nextInt();

    for (int r = 1; r <= N; r++) {

        int X = teclado.nextInt();

        int soma = 0;

        for (int i = 1; i < X; i++) {


        if (X % i == 0) {
            soma+=i;
        }

    }

        if (soma == X) {
            System.out.println(X + " eh perfeito");
        } else {
            System.out.println(X + " nao eh perfeito");
        }

    }
 
    }
 
}
