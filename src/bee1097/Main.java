import java.util.Scanner;
 
/*
 * Beecrowd 1097 - Sequencia IJ 3
 * Linguagem: Java
 * Data: 11/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
        for (int I = 1; I <= 9; I += 2) {

        for (int J = I + 6; J >= I + 4; J--) {

            System.out.println("I=" + I + " J=" + J);
        }
    }
 
    }
 
}
