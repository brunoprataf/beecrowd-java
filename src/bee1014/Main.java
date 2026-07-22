import java.util.Scanner;
 
/*
 * Beecrowd 1014 - Consumo
 * Linguagem: Java
 * Data: 22/07/2026
 * Status: Accepted
 */  
 
public class Main {
 
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int x;
        double y, resultado;
        
        x = teclado.nextInt();
        y = teclado.nextDouble();
        resultado = x / y;
        
        
        System.out.printf("%.3f km/l%n", resultado);
 
    
    }
 
}
