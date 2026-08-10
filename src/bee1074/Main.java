import java.util.Scanner;
 
/*
 * Beecrowd 1074 - Par ou Ímpar
 * Linguagem: Java
 * Data: 10/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int N = teclado.nextInt();
    int X;

    for (int i = 1; i <= N; i++) {

        X = teclado.nextInt();

        if (X > 0 && X % 2 == 0) {
            System.out.println("EVEN POSITIVE");

        }else if (X > 0 && X % 2 != 0) {
            System.out.println("ODD POSITIVE");

        }else if (X < 0 && X % 2 == 0) {
            System.out.println("EVEN NEGATIVE");

        }else if (X < 0 && X % 2 != 0) {
            System.out.println("ODD NEGATIVE");

        }else {
            System.out.println("NULL");


        }
    }
 
    }
 
}
