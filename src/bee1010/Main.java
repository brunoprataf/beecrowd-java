import java.util.Scanner;
 
/*
 * Beecrowd 1010 - Cálculo Simples 
 * Linguagem: Java
 * Data: 21/07/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
     Scanner teclado = new Scanner(System.in);
     int codigoPeca1, codigoPeca2, numeroPecas1, numeroPecas2;
     double valorUnitarioPeca1, valorUnitarioPeca2, total;
     
     codigoPeca1 = teclado.nextInt();
     numeroPecas1 = teclado.nextInt();
     valorUnitarioPeca1 = teclado.nextDouble();
     
     codigoPeca2 = teclado.nextInt();
     numeroPecas2 = teclado.nextInt();
     valorUnitarioPeca2 = teclado.nextDouble();
     
     total = (numeroPecas1 * valorUnitarioPeca1) + (numeroPecas2 * valorUnitarioPeca2);
     
     
     System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
     
    }
 
}
