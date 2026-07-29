import java.util.Scanner;
 
/*
 * Beecrowd 1047 - Tempo de Jogo com Minutos
 * Linguagem: Java
 * Data: 29/07/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
      Scanner teclado = new Scanner(System.in);

    int HI, MI, HF, MF, inicioEmMinutos, fimEmMinutos, duracao, horas, minutos;

    HI = teclado.nextInt();
    MI = teclado.nextInt();
    HF = teclado.nextInt();
    MF = teclado.nextInt();

    inicioEmMinutos = HI * 60 + MI;
    fimEmMinutos = HF * 60 + MF;

    duracao = fimEmMinutos - inicioEmMinutos;

    if (duracao <= 0) {
        duracao += 24 * 60;
    }

    horas = duracao / 60;
    minutos = duracao % 60;

    System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");
 
    }
 
}
