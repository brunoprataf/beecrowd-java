import java.util.Scanner;
 
/*
 * Beecrowd 1079 - Médias Ponderadas
 * Linguagem: Java
 * Data: 10/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args){
 
    Scanner teclado = new Scanner(System.in);

    int N = teclado.nextInt();
    double A, B, C, media;

    for (int i = 1; i <= N; i++) {

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
        media = ((A * 2) + (B * 3) + (C * 5)) / 10;

        System.out.printf("%.1f%n", media);
    }
 
    }
 
}
