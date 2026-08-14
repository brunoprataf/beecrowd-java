import java.util.Scanner;
 
/*
 * Beecrowd 1143 - Quadrado e ao Cubo
 * Linguagem: Java
 * Data: 14/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args){
 
    Scanner teclado = new Scanner(System.in);

    int N = teclado.nextInt();

    for (int i = 1; i <= N; i++) {

        int quadrado = i * i;
        int cubo = i * i * i;

        System.out.println(i + " " + quadrado + " " + cubo);

    }
 
    }
 
}
