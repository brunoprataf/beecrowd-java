import java.util.Scanner;
 
/*
 * Beecrowd 1116 - Dividindo X por Y
 * Linguagem: Java
 * Data: 12/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args){
 
    Scanner teclado = new Scanner(System.in);

    int N = teclado.nextInt();

    for (int i = 1; i <= N; i++) {

        double X = teclado.nextDouble();
        double Y = teclado.nextDouble();

        if (Y != 0) {
            System.out.printf("%.1f%n", X / Y);
        } else {
            System.out.println("divisao impossivel");
        }

    }
 
    }
 
}
