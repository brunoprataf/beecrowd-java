import java.util.Scanner;
 
/*
 * Beecrowd 1145 - Sequência Lógica 2
 * Linguagem: Java
 * Data: 14/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int X  = teclado.nextInt();
    int Y = teclado.nextInt();

    for (int i = 1; i <= Y; i++) {

        if (i % X == 0) {
            System.out.println(i);
        } else {
            System.out.print(i + " ");
        }

    }
 
    }
 
}
