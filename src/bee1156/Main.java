/*
 * Beecrowd 1156 - Sequência S II
 * Linguagem: Java
 * Data: 17/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    double S = 0;
    int numerador = 1;
    double denominador = 1;

    while (numerador <= 39) {

    S += numerador / denominador;

    numerador += 2;
    denominador *= 2;
    
    }

        System.out.printf("%.2f%n", S);
        
    }
 
}
