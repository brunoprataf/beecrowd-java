import java.util.Scanner;
 
/*
 * Beecrowd 1115 - Quadrante
 * Linguagem: Java
 * Data: 12/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int X = teclado.nextInt();
    int Y = teclado.nextInt();
    String resultado = "";

    while (X != 0 && Y != 0){

        if (X > 0 && Y > 0){
            resultado = "primeiro";
        }else if (X < 0 && Y > 0){
            resultado = "segundo";
        }else if (X < 0 && Y < 0) {
            resultado = "terceiro";
        }else{
            resultado = "quarto";
        }
        
        System.out.println(resultado);
        
        X = teclado.nextInt();
        Y = teclado.nextInt();

    }
 
    }
 
}
