import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
 
/*
 * Beecrowd 1015 - Distância Entre Dois Ponto
 * Linguagem: Java
 * Data: 22/07/2026
 * Status: Accepted
 */  
 
public class Main {
 
    public static void main(String[] args)  {
        
        Scanner teclado = new Scanner(System.in);
        
        double x1, y1, x2, y2, resultado;
        
    x1 = teclado.nextDouble();
    y1 = teclado.nextDouble();
    x2 = teclado.nextDouble();
    y2 = teclado.nextDouble();
    
    resultado = sqrt(pow((x2 - x1),2) + pow((y2 - y1),2));
    
    System.out.printf("%.4f%n", resultado);
    
    
 
    }
 
}
