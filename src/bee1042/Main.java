import java.util.Scanner;
 
/*
 * Beecrowd 1042 - Sort Simples
 * Linguagem: Java
 * Data: 28/07/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
       Scanner teclado = new Scanner(System.in);

    int A, B, C;

    A = teclado.nextInt();
    B = teclado.nextInt();
    C = teclado.nextInt();

    if (A <= B && B <= C) {
        System.out.println(A);
        System.out.println(B);
        System.out.println(C + "\n");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    } else if (B <= A && A <= C) {
        System.out.println(B);
        System.out.println(A);
        System.out.println(C + "\n");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    } else if (C <= A && A <= B) {
        System.out.println(C);
        System.out.println(A);
        System.out.println(B + "\n");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    } else if (B <= C && C <= A) {
        System.out.println(B);
        System.out.println(C);
        System.out.println(A + "\n");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    } else if (C <= B && B <= A) {
        System.out.println(C);
        System.out.println(B);
        System.out.println(A + "\n");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }else if (A <= C && C <= B) {
        System.out.println(A);
        System.out.println(C);
        System.out.println(B + "\n");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
 
    }
 
}
