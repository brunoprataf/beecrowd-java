import java.util.Scanner;
 
/*
 * Beecrowd 1061 - Tempo de um Evento
 * Linguagem: Java
 * Data: 05/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner teclado = new Scanner(System.in);

    int DI, DF, HI, HF, MI, MF, SI, SF,totalInicio, totalFim, duracao, dias, horas, minutos, segundos;


    teclado.next();
    DI = teclado.nextInt();

    HI = teclado.nextInt();
    teclado.next();
    MI = teclado.nextInt();
    teclado.next();
    SI = teclado.nextInt();

    teclado.next();
    DF = teclado.nextInt();

    HF = teclado.nextInt();
    teclado.next();
    MF = teclado.nextInt();
    teclado.next();
    SF = teclado.nextInt();

    totalInicio = (DI * 86400) + (HI * 3600) + (MI * 60) + SI;
    totalFim = (DF * 86400) + (HF * 3600) + (MF * 60) + SF;

    duracao = totalFim - totalInicio;


    dias = duracao / 86400;
    duracao %= 86400;

    horas = duracao  / 3600;
    duracao %= 3600;

    minutos = duracao / 60;
    segundos = duracao % 60;


    System.out.println(dias + " dia(s)");
    System.out.println(horas + " hora(s)");
    System.out.println(minutos + " minuto(s)");
    System.out.println(segundos + " segundo(s)");

 
    }
 
}
