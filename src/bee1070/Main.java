import java.util.Scanner;
 
/*
 * Beecrowd 1070 - Seis Números Ímpares
 * Linguagem: Java
 * Data: 05/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int X;

    X = teclado.nextInt();

if (X % 2 == 0) {
    for (int i = X + 1; i <= X + 12; i += 2) {
        System.out.println(i);
    }
    }else{
        for (int i = X; i <= X + 11; i += 2) {
            System.out.println(i);
        }
    }
    }
 
}
