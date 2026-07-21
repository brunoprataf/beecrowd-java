import java.util.Scanner;
 
/*
 * Beecrowd 1008 - Salário 
 * Linguagem: Java
 * Data: 21/07/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner (System.in);
    int employeeNumber, hoursWorked;
    double hourlyRate, salary;
    
    employeeNumber = teclado.nextInt();
    hoursWorked = teclado.nextInt();
    hourlyRate = teclado.nextDouble();
    salary = hoursWorked * hourlyRate;
    
    System.out.println("NUMBER = " + employeeNumber);
    System.out.printf("SALARY = U$ %.2f%n", salary);
    
    
    
    }
 
}
