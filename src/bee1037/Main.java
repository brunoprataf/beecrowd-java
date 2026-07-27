import java.util.Scanner;
 
/*
 * Beecrowd 1037 - Intervalo
 * Linguagem: Java
 * Data: 27/07/2026
 * Status: Accepted
 */ 
 
public class Main {
 
    public static void main(String[] args) {
 
 Scanner teclado = new Scanner(System.in);
    double valorEntrada;

    valorEntrada = teclado.nextDouble();

    if (valorEntrada < 0.00) {
        System.out.println("Fora de intervalo");

    } else if (valorEntrada <= 25.00)  {
        System.out.println("Intervalo [0,25]");

    } else if (valorEntrada <= 50.00)  {
        System.out.println("Intervalo (25,50]");

    } else if (valorEntrada <= 75.00)  {
        System.out.println("Intervalo (50,75]");

    } else if (valorEntrada <= 100.00)  {
        System.out.println("Intervalo (75,100]");

    }else if (valorEntrada >= 100.00)  {
        System.out.println("Fora de intervalo");

    }
    
    }
 
}
