import java.util.Scanner;
 
/*
 * Beecrowd 1146 - Sequências Crescentes
 * Linguagem: Java
 * Data: 14/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args){
 
    Scanner teclado = new Scanner(System.in);

int X = teclado.nextInt();

while (X != 0) {

    StringBuilder linha = new StringBuilder();

    for (int i = 1; i <= X; i++) {

        if (i == X) {
            linha.append(i);
        } else {
            linha.append(i).append(" ");
        }
    }

    System.out.println(linha);

    X = teclado.nextInt();
}
 
    }
 
}
