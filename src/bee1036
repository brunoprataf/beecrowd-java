import java.util.Scanner;
import static java.lang.Math.pow;  
import static java.lang.Math.sqrt;

/*
 * Beecrowd 1036 - Fórmula de Bhaskara
 * Linguagem: Java
 * Data: 27/07/2026
 * Status: Accepted
 */ 
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);
double A, B, C, delta, r1, r2;

    A = teclado.nextDouble();
    B = teclado.nextDouble();
    C = teclado.nextDouble();
    delta = Math.pow(B, 2) - 4 * (A * C);
    r1 = ( - B + (Math.sqrt(delta))) / (2 * A);
    r2 = ( - B - (Math.sqrt(delta))) / (2 * A);

if (A == 0 || delta < 0) {
        System.out.println("Impossivel calcular");

    } else if (A != 0 && delta >= 0) {

        System.out.printf("R1 = %.5f%n", r1);
        System.out.printf("R2 = %.5f%n", r2);
    }

 
    }
 
}
