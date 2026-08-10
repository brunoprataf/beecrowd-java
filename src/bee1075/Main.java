import java.util.Scanner;
 
/*
 * Beecrowd 1075 - Resto 2
 * Linguagem: Java
 * Data: 10/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int N = teclado.nextInt();

    for (int i = 1; i <= 10000; i++) {

    if (i % N == 2) {
    System.out.println(i);
    }
    }
 
    }
 
}
