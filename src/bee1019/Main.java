import java.util.Scanner;
 
/*
 * Beecrowd 1019 - Conversão de Tempo
 * Linguagem: Java
 * Data: 22/07/2026
 * Status: Accepted
 */  
 
public class Main {
 
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int N, horas, restohoras , minutos, restominutos, segundos;
        
        N = teclado.nextInt();
        horas = N / 3600;
        restohoras = N % 3600;
        minutos = restohoras / 60;
        restominutos = restohoras % 60;
        segundos = restominutos;
        
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
 
}
