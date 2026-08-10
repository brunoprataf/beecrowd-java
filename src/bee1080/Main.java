import java.util.Scanner;
 
/*
 * Beecrowd 1080 - Maior e Posição
 * Linguagem: Java
 * Data: 10/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args){
 
    Scanner teclado = new Scanner(System.in);

    int X;
    int maior = 0;
    int posicao = 0;

    for (int i = 1; i <= 100; i++) {

        X = teclado.nextInt();

        if (X > maior) {
            maior = X;
            posicao = i;
        }
    }

    System.out.println(maior);
    System.out.println(posicao);
 
    }
 
}
