import java.util.Scanner;
 
/*
 * Beecrowd 1046 - Tempo de Jogo
 * Linguagem: Java
 * Data: 29/07/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
   Scanner teclado = new Scanner(System.in);
    int HI, HF, HMD, HMDS, HC;

    HI = teclado.nextInt();
    HF = teclado.nextInt();
    HMDS = (24 - HI) + HF;
    HMD = HF - HI;
    HC = 24;

    if (HI > HF) {
        System.out.println("O JOGO DUROU " + HMDS + " HORA(S)");
    }else if (HI < HF) {
        System.out.println("O JOGO DUROU " + HMD + " HORA(S)");
    }else if (HI == HF) {
        System.out.println("O JOGO DUROU " + HC + " HORA(S)");
    }

}
 
    }
