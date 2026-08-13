import java.util.Scanner;
 
/*
 * Beecrowd 1118 - Várias Notas Com Validação
 * Linguagem: Java
 * Data: 13/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args){
 
    Scanner teclado = new Scanner(System.in);

    int opcao = 1;

    while (opcao == 1) {

        double soma = 0;
        int quantidadeValidos = 0;

        while (quantidadeValidos < 2) {

            double nota = teclado.nextDouble();

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                quantidadeValidos++;
            }else{
                System.out.println("nota invalida");
            }
        }

        double media = soma / quantidadeValidos;

        System.out.printf("media = %.2f%n", media);

        System.out.println("novo calculo (1-sim 2-nao)");
        opcao = teclado.nextInt();

        while (opcao != 1 && opcao != 2) {
            System.out.println("novo calculo (1-sim 2-nao)");
            opcao = teclado.nextInt();
        }
    }
 
    }
 
}
