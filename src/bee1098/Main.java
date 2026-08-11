import java.util.Scanner;
 
/*
 * Beecrowd 1098 - Sequencia IJ 4
 * Linguagem: Java
 * Data: 11/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args){
 
       for (int contador = 0; contador <= 10; contador++) {

        double I = contador * 0.2;

        for (int j = 1; j <= 3; j++) {

            double J = j + I;

            if (contador == 0 || contador == 5 || contador == 10) {
                System.out.printf("I=%.0f J=%.0f%n", I, J);
            } else {
                System.out.printf("I=%.1f J=%.1f%n", I, J);
            }
        }
    }
 
    }
 
}
