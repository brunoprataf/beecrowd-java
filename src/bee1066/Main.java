import java.util.Scanner;
 
/*
 * Beecrowd 1066 - Pares, Ímpares, Positivos e Negativos
 * Linguagem: Java
 * Data: 05/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int A, B, C, D, E, pares, impares, positivos, negativos;

    A = teclado.nextInt();
    B = teclado.nextInt();
    C = teclado.nextInt();
    D = teclado.nextInt();
    E = teclado.nextInt();
    pares =  0;
    impares = 0;
    positivos = 0;
    negativos = 0;


    if (A % 2 == 0) {
        pares++;
    } else if (A % 2 != 0) {
        impares++;
    }
    if (A > 0) {
        positivos++;
    } else if (A < 0) {
        negativos++;
    }
    if (B % 2 == 0) {
        pares++;
    } else if (B % 2 != 0) {
        impares++;
    }
    if (B > 0) {
        positivos++;
    } else if (B < 0) {
        negativos++;
    }
    if (C % 2 == 0) {
        pares++;
    } else if (C % 2 != 0) {
        impares++;
    }
    if (C > 0) {
        positivos++;
    } else if (C < 0) {
        negativos++;
    }
    if (D % 2 == 0) {
        pares++;
    } else if (D % 2 != 0) {
        impares++;
    }
    if (D > 0) {
        positivos++;
    } else if (D < 0) {
        negativos++;
    }
    if (E % 2 == 0) {
        pares++;
    } else if (E % 2 != 0) {
        impares++;
    }
    if (E > 0) {
        positivos++;
    } else if (E < 0) {
        negativos++;
    }

    System.out.println(pares + " valor(es) par(es)");
    System.out.println(impares + " valor(es) impar(es)");
    System.out.println(positivos + " valor(es) positivo(s)");
    System.out.println(negativos + " valor(es) negativo(s)");
    }
 
}
