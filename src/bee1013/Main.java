import java.util.Scanner;
import static java.lang.Math.abs;
 
/*
 * Beecrowd 1013 - O Maior
 * Linguagem: Java
 * Data: 22/07/2026
 * Status: Accepted
 */ 
 
public class Main {
 
    public static void main(String[] args) {
 
 Scanner teclado = new Scanner(System.in);
 
 int a, b, c, d, maiorAb, resultado;
 
 a = teclado.nextInt();
 b = teclado.nextInt();
 c = teclado.nextInt();
 
 maiorAb = (a + b + abs(a - b)) / 2; 
 d = (maiorAb + c + abs(maiorAb - c)) / 2;
 resultado = d;
 
 System.out.println(resultado + " eh o maior");
  
    }
 
}
