import java.util.Scanner;
 
/*
 * Beecrowd 1044 - Múltiplos
 * Linguagem: Java
 * Data: 28/07/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);
    int A, B;
    A = teclado.nextInt();
    B= teclado.nextInt();

    if ((B != 0 && A % B == 0) || (A != 0 && B % A == 0)) {
        System.out.println("Sao Multiplos");
    }else{
        System.out.println("Nao sao Multiplos");
    }
 
    }
 
}
