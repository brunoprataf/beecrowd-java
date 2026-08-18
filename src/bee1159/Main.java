import java.util.Scanner;
 
/*
 * Beecrowd 1159 - Soma de Pares Consecutivos
 * Linguagem: Java
 * Data: 18/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int X = teclado.nextInt();

    while (X != 0) {

        int soma = 0;

        if (X % 2 != 0) {
            X++;
        }

        for (int i = 1; i <= 5; i++) {

            soma += X;
            X += 2;
        }

        System.out.println(soma);

        X = teclado.nextInt();
    }
 
    }
 
}
