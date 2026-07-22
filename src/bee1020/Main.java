import java.util.Scanner;
 
/*
 * Beecrowd 1020 - Idade em Dias
 * Linguagem: Java
 * Data: 22/07/2026
 * Status: Accepted
 */  
 
public class Main {
 
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
 
       int entrada, ano, restoAno, mes, restoMes, dia;
       
       entrada = teclado.nextInt();
       ano = entrada / 365;
       restoAno = entrada % 365;
       mes = restoAno / 30;
       restoMes = restoAno % 30;
       dia = restoMes;
       
       
      System.out.println(ano + " ano(s)");
      System.out.println(mes + " mes(es)");
      System.out.println(dia + " dia(s)");
 
    }
 
}
