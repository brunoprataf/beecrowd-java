import java.util.Scanner;
 
/*
 * Beecrowd 1009 - Salário com Bônus 
 * Linguagem: Java
 * Data: 21/07/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double salarioFixo, totalVendas, comissao, total;
      
        String nomeVendedor = teclado.nextLine();
        salarioFixo =  teclado.nextDouble();
        totalVendas = teclado.nextDouble();
        comissao = totalVendas * 0.15;
        total = salarioFixo + comissao;
        
        System.out.printf("TOTAL = R$ %.2f%n", total);
       
     
    }
 
}
