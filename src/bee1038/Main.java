import java.util.Scanner;
 
/*
 * Beecrowd 1038 - Lanche
 * Linguagem: Java
 * Data: 27/07/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner teclado = new Scanner(System.in);

    int codigo, quantidade;
    double cachorroQuente, xSalada, xBacon, torradaSimples, refrigerante;

    codigo = teclado.nextInt();
    quantidade = teclado.nextInt();
    cachorroQuente = 4.00;
    xSalada = 4.50;
    xBacon = 5.00;
    torradaSimples = 2.00;
    refrigerante = 1.50;

    if (codigo == 1) {
        System.out.printf("Total: R$ %.2f%n", quantidade * cachorroQuente);
    } else if (codigo == 2) {
        System.out.printf("Total: R$ %.2f%n", quantidade * xSalada);
    } else if (codigo == 3) {
        System.out.printf("Total: R$ %.2f%n", quantidade * xBacon);
    } else if (codigo == 4) {
        System.out.printf("Total: R$ %.2f%n", quantidade * torradaSimples);
    } else if (codigo == 5) {
        System.out.printf("Total: R$ %.2f%n", quantidade * refrigerante);
        
    }
 
    }
 
}
