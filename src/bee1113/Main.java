import java.util.Scanner;
 
/*
 * Beecrowd 1113 - Crescente e Decrescente
 * Linguagem: Java
 * Data: 12/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args){
 
    Scanner teclado = new Scanner(System.in);

    int X = teclado.nextInt();
    int Y = teclado.nextInt();
    String resultado;

    while (X != Y) {

        if (X > Y) {
            resultado = "Decrescente";
        }else{
            resultado = "Crescente";
        }

        System.out.println(resultado);

        X = teclado.nextInt();
        Y = teclado.nextInt();

    }
 
    }
 
}
