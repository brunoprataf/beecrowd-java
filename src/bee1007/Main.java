import java.util.Scanner;
 
/*
 * Beecrowd 1007 - Diferença 
 * Linguagem: Java
 * Data: 20/07/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args){
 
 Scanner teclado = new Scanner (System.in);
 
 int A, B, C, D, diferenca;
 A = teclado.nextInt();
 B = teclado.nextInt();
 C = teclado.nextInt();
 D = teclado.nextInt();
 diferenca = (A * B - C * D);
 
 
 System.out.println("DIFERENCA = " + diferenca);

    }
 
}
