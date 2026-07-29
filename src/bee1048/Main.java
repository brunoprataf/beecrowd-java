import java.util.Scanner;
 
/*
 * Beecrowd 1048 - Aumento de Salário
 * Linguagem: Java
 * Data: 29/07/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    double S, PR15, PR12, PR10, PR7, PR4;

    S = teclado.nextDouble();
    PR15 = 15.00 / 100;
    PR12 = 12.00 / 100;
    PR10 = 10.00 / 100;
    PR7 = 7.00 / 100;
    PR4 = 4.00 / 100;


    if (S >= 0.00 && S <= 400.00) {
        System.out.printf("Novo salario: %.2f%n", S + (S * PR15));
        System.out.printf("Reajuste ganho: %.2f%n", S * PR15);
        System.out.printf("Em percentual: %.0f %%%n", PR15 * 100);
    } else if (S <= 800.00) {
        System.out.printf("Novo salario: %.2f%n", S + (S * PR12));
        System.out.printf("Reajuste ganho: %.2f%n", S * PR12);
        System.out.printf("Em percentual: %.0f %%%n", PR12 * 100);
    } else if (S <= 1200.00) {
        System.out.printf("Novo salario: %.2f%n", S + (S * PR10));
        System.out.printf("Reajuste ganho: %.2f%n", S * PR10);
        System.out.printf("Em percentual: %.0f %%%n", PR10 * 100);
    } else if (S <= 2000.00) {
        System.out.printf("Novo salario: %.2f%n", S + (S * PR7));
        System.out.printf("Reajuste ganho: %.2f%n", S * PR7);
        System.out.printf("Em percentual: %.0f %%%n", PR7 * 100);
    } else if (S > 2000.00) {
        System.out.printf("Novo salario: %.2f%n", S + (S * PR4));
        System.out.printf("Reajuste ganho: %.2f%n", S * PR4);
        System.out.printf("Em percentual: %.0f %%%n", PR4 * 100);

    }
    }
 
}
