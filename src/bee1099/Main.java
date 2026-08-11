import java.util.Scanner;
 
/*
 * Beecrowd 1099 - Soma de Ímpares Consecutivos II
 * Linguagem: Java
 * Data: 11/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int N = teclado.nextInt();
    int X;
    int Y;
    int menor;
    int maior;

    for (int r = 1; r <= N; r++) {

        int soma = 0;

        X = teclado.nextInt();
        Y = teclado.nextInt();

        if (X < Y) {
            menor = X;
            maior = Y;
        } else {
            menor = Y;
            maior = X;
        }
        for (int i = menor + 1; i < maior; i++) {

            if (i % 2 != 0) {
                soma += i;
            }
        }
        System.out.println(soma);

        }
 
    }
 
}
