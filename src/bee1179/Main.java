import java.util.Scanner;
 
/*
 * Beecrowd 1179 - Preenchimento de Vetor IV
 * Linguagem: Java
 * Data: 24/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int[] par = new int[5];
    int[] impar = new int[5];

    int contadorPar = 0;
    int contadorImpar = 0;

    for (int r = 0; r < 15; r++) {

        int X = teclado.nextInt();

        if (X % 2 == 0) {

            par[contadorPar] = X;
            contadorPar++;

            if (contadorPar == 5) {

                for (int i = 0; i < 5; i++) {
                    System.out.println("par[" + i + "] = " + par[i]);
                }

                contadorPar = 0;
            }

        } else {

            impar[contadorImpar] = X;
            contadorImpar++;

            if (contadorImpar == 5) {

                for (int i = 0; i < 5; i++) {
                    System.out.println("impar[" + i + "] = " + impar[i]);
                }

                contadorImpar = 0;
            }
        }
    }

    for (int i = 0; i < contadorImpar; i++) {
        System.out.println("impar[" + i + "] = " + impar[i]);
    }

    for (int i = 0; i < contadorPar; i++) {
        System.out.println("par[" + i + "] = " + par[i]);
    }
 
    }
 
}
