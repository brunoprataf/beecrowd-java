import java.util.Scanner;
import static java.lang.Math.round; 

/*
 * Beecrowd 1021 - Notas e Moedas
 * Linguagem: Java
 * Data: 23/07/2026
 * Status: Accepted
 */ 
 
public class Main {
 
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

    double entrada;
    entrada = teclado.nextDouble();
    if (entrada >= 0 || entrada <= 1000000.00){

        int valorCentavos, nota100, resto100, nota50, resto50, nota20, resto20, nota10, resto10, nota5, resto5, nota2, resto2, moeda1, resto1, moeda050, resto050, moeda025, resto025, moeda010, resto010, moeda005, resto005, moeda001;

        valorCentavos = (int) round (entrada * 100);
        nota100 = valorCentavos / 10000;
        resto100 = valorCentavos % 10000;
        nota50 = resto100 / 5000;
        resto50 = resto100 % 5000;
        nota20 = resto50 / 2000;
        resto20 = resto50 % 2000;
        nota10 = resto20 / 1000;
        resto10 = resto20 % 1000;
        nota5 = resto10 / 500;
        resto5 = resto10 % 500;
        nota2 = resto5 / 200;
        resto2 = resto5 % 200;
        moeda1 = resto2 / 100;
        resto1 = resto2 % 100;
        moeda050 = resto1 / 50;
        resto050 = resto1 % 50;
        moeda025 = resto050 / 25;
        resto025 = resto050 % 25;
        moeda010 = resto025 / 10;
        resto010 = resto025 % 10;
        moeda005 = resto010 / 5;
        resto005 = resto010 % 5;
        moeda001 = resto005;

        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda050 + " moeda(s) de R$ 0.50");
        System.out.println(moeda025 + " moeda(s) de R$ 0.25");
        System.out.println(moeda010 + " moeda(s) de R$ 0.10");
        System.out.println(moeda005 + " moeda(s) de R$ 0.05");
        System.out.println(moeda001 + " moeda(s) de R$ 0.01");
      
      
        }
    }
 
}
