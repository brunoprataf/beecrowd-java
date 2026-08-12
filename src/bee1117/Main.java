import java.util.Scanner;
 
/*
 * Beecrowd 1117 - Validação de Nota
 * Linguagem: Java
 * Data: 12/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args){
 
    Scanner teclado = new Scanner(System.in);

        double soma = 0;
        int quantidadeValidos = 0;

        while (quantidadeValidos < 2) {

            double nota = teclado.nextDouble();

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                quantidadeValidos++;
            } else {
                System.out.println("nota invalida");
            }
        }

        double media = soma / quantidadeValidos;

        System.out.printf("media = %.2f%n", media);
 
    }
 
}
