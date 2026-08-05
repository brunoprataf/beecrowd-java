import java.util.Scanner;
 
/*
 * Beecrowd 1065 - Pares entre Cinco Números
 * Linguagem: Java
 * Data: 05/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int A, B, C, D, E, pares;

    A = teclado.nextInt();
    B = teclado.nextInt();
    C = teclado.nextInt();
    D = teclado.nextInt();
    E = teclado.nextInt();
    pares =  0;


    if (A % 2 == 0) {
        pares++;
    }
    if (B % 2 == 0) {
        pares++;
    }
    if (C % 2 == 0) {
        pares++;
    }
    if (D % 2 == 0) {
        pares++;
    }
    if (E % 2 == 0) {
        pares++;
    }

    System.out.println(pares + " valores pares");
 
    }
 
}
