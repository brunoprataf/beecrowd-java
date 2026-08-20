import java.util.Scanner;
 
/*
 * Beecrowd 1160 - Crescimento Populacional
 * Linguagem: Java
 * Data: 20/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int T = teclado.nextInt();

    for (int i = 1; i <= T; i++) {

        int PA = teclado.nextInt();
        int PB = teclado.nextInt();

        double G1 = teclado.nextDouble();
        double G2 = teclado.nextDouble();

        int anos = 0;

        while (PA <= PB && anos <= 100) {

            PA = (int) (PA + (PA * (G1 / 100)));
            PB = (int) (PB + (PB * (G2 / 100)));
            anos++;

        }

        if (anos <= 100) {
            System.out.println(anos + " anos.");
        } else {
            System.out.println("Mais de 1 seculo.");
        }

    }
 
    }
 
}
