import java.util.Scanner;
 
/*
 * Beecrowd 1078 - Tabuada
 * Linguagem: Java
 * Data: 10/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int N = teclado.nextInt();

    for (int i =1; i <= 10; i++) {

        System.out.println(i + " x " + N + " = " + (N * i));

    }
 
    }
 
}
