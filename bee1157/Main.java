import java.util.Scanner;
 
/*
 * Beecrowd 1157 - Divisores I
 * Linguagem: Java
 * Data: 17/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int N = teclado.nextInt();

    for (int i = 1; i <= N; i++) {

        if (N % i == 0) {

            System.out.println(i);
            
        }

    }
 
    }
 
}
