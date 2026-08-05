import java.util.Scanner;
 
/*
 * Beecrowd 1064 - Positivos e Média
 * Linguagem: Java
 * Data: 05/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args)  {
 
        Scanner teclado = new Scanner(System.in);

    double A, B, C, D, E, F, R1, R2, R3, R4, R5, R6, M1, M2, M3, M4, M5, M6, media;

    A = teclado.nextDouble();
    B = teclado.nextDouble();
    C = teclado.nextDouble();
    D = teclado.nextDouble();
    E = teclado.nextDouble();
    F = teclado.nextDouble();

    if (A <= 0) {
        R1 = 0;
    }else{
        R1 = 1;
    }if (B <= 0) {
        R2 = 0;
    }else{
        R2 = 1;
    }if (C <= 0) {
        R3 = 0;
    }else{
        R3 = 1;
    }if (D <= 0) {
        R4 = 0;
    }else{
        R4 = 1;
    }if (E <= 0) {
        R5 = 0;
    }else{
        R5 = 1;
    }if (F <= 0) {
        R6 = 0;
    }else {
        R6 = 1;
    }
    if (A <= 0) {
            M1 = 0;
        }else{
            M1 = A;
        }if (B <= 0) {
            M2 = 0;
        }else{
            M2 = B;
        }if (C <= 0) {
            M3 = 0;
        }else{
            M3 = C;
        }if (D <= 0) {
            M4 = 0;
        }else{
            M4 = D;
        }if (E <= 0) {
            M5 = 0;
        }else{
            M5 = E;
        }if (F <= 0) {
            M6 = 0;
        }else {
        M6 = F;
    }
    media =  R1 + R2 + R3 + R4 + R5 + R6;

    System.out.printf("%.0f valores positivos%n", R1 + R2 + R3 + R4 + R5 + R6);
    System.out.printf("%.1f%n", (M1 + M2 + M3 + M4 + M5 + M6) / media);
 
    }
 
}
