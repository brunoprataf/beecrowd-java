import java.util.Scanner;
 
/*
 * Beecrowd 1101 - Sequência de Números e Soma
 * Linguagem: Java
 * Data: 12/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int M = teclado.nextInt();
    int N = teclado.nextInt();
    int menor;
    int maior;

    while (M > 0 && N > 0) {

        if (M < N) {
            menor = M;
            maior = N;
        } else {
            menor = N;
            maior = M;
        }

        int soma = 0;

        for (int i = menor; i <= maior; i++) {

            soma += i;
            System.out.print(i + " ");

        }
        System.out.println("Sum=" + soma);

        M = teclado.nextInt();
        N = teclado.nextInt();
    }
 
    }
 
}
