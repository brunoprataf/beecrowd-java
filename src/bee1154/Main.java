import java.util.Scanner;
 
/*
 * Beecrowd 1154 - Idades
 * Linguagem: Java
 * Data: 17/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int N = teclado.nextInt();
    double soma = 0;
    int contador = 0;

    while (N > 0) {

        soma += N;
        contador ++;

        N = teclado.nextInt();
    }

    System.out.printf("%.2f%n", soma / contador);
 
    }
 
}
