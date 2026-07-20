import java.util.Scanner;
 
/*
 * Beecrowd 1006 - Média 2 
 * Linguagem: Java
 * Data: 20/07/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner teclado = new Scanner (System.in);
        double A, B, C, D, media;
        
        A = teclado.nextDouble() * 2;
        B = teclado.nextDouble() * 3;
        C = teclado.nextDouble() * 5;
        D = 2 + 3 + 5;
        media = (A + B + C) / D;
        
        System.out.printf("MEDIA = %.1f%n", media);
 
    }
 
}
