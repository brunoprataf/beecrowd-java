import java.util.Scanner;
 
/*
 * Beecrowd 1017 - Gasto de Combustível
 * Linguagem: Java
 * Data: 22/07/2026
 * Status: Accepted
 */  
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);
    
    int tempoViagem, velocidadeMedia;
    double consumoCombustivel, resultado;
    
    tempoViagem = teclado.nextInt();
    velocidadeMedia = teclado.nextInt();
    consumoCombustivel = 12;
    resultado = (tempoViagem * velocidadeMedia) / consumoCombustivel;
    
    
    System.out.printf("%.3f%n", resultado);
 
    }
 
}
