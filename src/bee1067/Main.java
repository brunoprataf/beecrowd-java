import java.util.Scanner;
 
/*
 * Beecrowd 1067 - Números Ímpares
 * Linguagem: Java
 * Data: 05/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
        
    Scanner teclado = new Scanner(System.in);

    int X;

    X = teclado.nextInt();


    for (int i = 1; i <= X; i += 2) {
        System.out.println(i);
    }
 
    }
 
}
