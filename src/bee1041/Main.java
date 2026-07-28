import java.util.Scanner;
 
/*
 * Beecrowd 1041 - Coordenadas de um Ponto
 * Linguagem: Java
 * Data: 28/07/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
 Scanner teclado = new Scanner(System.in);

    double x, y;

    x = teclado.nextDouble();
    y = teclado.nextDouble();

    if (x == 0.00 && y == 0.00) {
        System.out.println("Origem");
    } else if (x == 0.00) {
        System.out.println("Eixo Y");
    } else if (y == 0.00) {
        System.out.println("Eixo X");
    } else if (x > 0.00 && y > 0.00) {
        System.out.println("Q1");
    } else if (x < 0.00 && y > 0.00) {
        System.out.println("Q2");
    } else if (x < 0.00 && y < 0.00) {
        System.out.println("Q3");
    } else if (x > 0.00 && y < 0.00) {
        System.out.println("Q4");
    }
    }
 
}
