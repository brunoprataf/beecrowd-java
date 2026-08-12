import java.util.Scanner;
 
/*
 * Beecrowd 1114 - Senha Fixa
 * Linguagem: Java
 * Data: 12/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args){
 
    Scanner teclado = new Scanner(System.in);

    int X = teclado.nextInt();

    while (X != 2002){

        System.out.println("Senha Invalida");

        X = teclado.nextInt();

    }

    System.out.println("Acesso Permitido");
 
    }
 
}
