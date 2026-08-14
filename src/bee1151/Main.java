import java.util.Scanner;
 
/*
 * Beecrowd 1151 - Fibonacci Fácil
 * Linguagem: Java
 * Data: 14/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int N = teclado.nextInt();

    int primeiro = 0;
    int segundo = 1;
    int proximo;

    StringBuilder linha = new StringBuilder();

    for (int i = 0; i < N; i++) {

        if (i == N - 1) {
            linha.append(primeiro);
        } else {
            linha.append(primeiro).append(" ");
        }

        proximo = primeiro + segundo;
        primeiro = segundo;
        segundo = proximo;
    }

    System.out.println(linha);

 
    }
 
}
