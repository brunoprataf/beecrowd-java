import java.util.Scanner;
 
/*
 * Beecrowd 1016 - Distância
 * Linguagem: Java
 * Data: 22/07/2026
 * Status: Accepted
 */  
 
public class Main {
 
    public static void main(String[] args) {
 
     Scanner teclado = new Scanner(System.in);
     int km, minutos, total;
     km = teclado.nextInt();
     minutos = 2;
     total = km * minutos;
     
     System.out.println(total + " minutos");

 
    }
 
}
