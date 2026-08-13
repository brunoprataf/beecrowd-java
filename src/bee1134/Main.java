import java.util.Scanner;
 
/*
 * Beecrowd 1134 - Tipo de Combustível
 * Linguagem: Java
 * Data: 13/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;
    int opcao = teclado.nextInt();

    while (opcao != 4) {

        if (opcao == 1) {
            alcool++;
        } else if (opcao == 2) {
            gasolina++;
        } else if (opcao == 3) {
            diesel++;
        }

        opcao = teclado.nextInt();

    }

    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: " + alcool);
    System.out.println("Gasolina: " + gasolina);
    System.out.println("Diesel: " + diesel);
 
    }
 
}
