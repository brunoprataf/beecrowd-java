import java.util.Scanner;
 
/*
 * Beecrowd 1132 - Múltiplos de 13
 * Linguagem: Java
 * Data: 13/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args){
 
    Scanner teclado = new Scanner(System.in);

    int X = teclado.nextInt();
    int Y = teclado.nextInt();
    int soma = 0;

    int menor;
    int maior;

    if (X < Y) {
        menor = X;
        maior = Y;
    } else {
        menor = Y;
        maior = X;
    }

    for (int i = menor; i <= maior; i++) {

        if (i % 13 != 0) {
            soma += i;
        }
    }
    
    System.out.println(soma);
}
 
    }
 
