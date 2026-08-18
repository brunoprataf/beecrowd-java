import java.util.Scanner;
 
/*
 * Beecrowd 1158 - Soma de Ímpares Consecutivos III
 * Linguagem: Java
 * Data: 18/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int N = teclado.nextInt();

    for (int r = 1; r <= N; r++) {

        int X = teclado.nextInt();
        int Y = teclado.nextInt();

        int soma = 0;

        if (X % 2 == 0) {
            X++;
        }

        for (int i = 1; i <= Y; i++) {

            soma += X;
            X += 2;
        }

        System.out.println(soma);
    }
 
    }
 
}
