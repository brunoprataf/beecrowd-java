import java.util.Scanner;
 
/*
 * Beecrowd 1011 - Esfera
 * Linguagem: Java
 * Data: 21/07/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
       
        double r, pi, volume;
        
        r = teclado.nextDouble();
        pi = 3.14159;
        volume = (4.0/3) * pi * (r * r * r);
     
 System.out.printf("VOLUME = %.3f%n", volume);
 
    }
 
}
