import java.util.Scanner;
 
/*
 * Beecrowd 1133 - Resto da Divisão
 * Linguagem: Java
 * Data: 13/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);
    int X = teclado.nextInt();
    int Y = teclado.nextInt();
    int menor;
    int maior;

    if (X < Y) {
        menor = X;
        maior = Y;
    } else {
        menor = Y;
        maior = X;
    }

    for (int i = menor + 1; i <= maior - 1; i++) {

        if (i % 5 == 2 || i % 5 == 3) {
            System.out.println(i);
        }

    }
 
    }
 
}
