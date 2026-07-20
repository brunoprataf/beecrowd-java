import java.util.Scanner;
 
/*
 * Beecrowd 1005 - Média 1 
 * Linguagem: Java
 * Data: 20/07/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
  Scanner teclado =  new Scanner (System.in);
    double A, B, C, media;

    A = teclado.nextDouble() * 3.5;
    B = teclado.nextDouble() * 7.5;
    C = 3.5 + 7.5;
    media = (A + B) / C;

    System.out.printf("MEDIA = %.5f%n", media);
  
    }
 
}
