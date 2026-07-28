import java.util.Scanner;
 
/*
 * Beecrowd 1043 - Triângulo
 * Linguagem: Java
 * Data: 28/07/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    double A, B, C, area, P;
    A = teclado.nextDouble();
    B = teclado.nextDouble();
    C = teclado.nextDouble();
    P = A + B + C;
    area = ((A + B) * C) / 2;

    if ((A + B) > C && (A + C) > B && (B + C) > A) {
    System.out.printf("Perimetro = %.1f%n", P);
    }else{
    System.out.printf("Area = %.1f%n", area);
}
 
}
 
}
