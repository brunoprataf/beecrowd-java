import java.util.Scanner;
 
/*
 * Beecrowd 1045 - Tipos de Triângulos
 * Linguagem: Java
 * Data: 29/07/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
      Scanner teclado = new Scanner(System.in);

  double A, B, C, auxiliar;
  A = teclado.nextDouble();
  B = teclado.nextDouble();
  C = teclado.nextDouble();

  if (A < B) {
    auxiliar = A;
    A = B;
    B = auxiliar;
  }if (A < C) {
    auxiliar = A;
    A = C;
    C = auxiliar;
  }if (B < C) {
    auxiliar = B;
    B = C;
    C = auxiliar;
  }

  if (A >= (B + C)) {
    System.out.println("NAO FORMA TRIANGULO");
  }else if (Math.pow(A,2) == Math.pow(B,2) + Math.pow(C,2)) {
    System.out.println("TRIANGULO RETANGULO");
  }else if (Math.pow(A,2) > Math.pow(B,2) + Math.pow(C,2)) {
    System.out.println("TRIANGULO OBTUSANGULO");
  }else if (Math.pow(A,2) < Math.pow(B,2) + Math.pow(C,2)) {
    System.out.println("TRIANGULO ACUTANGULO");
  }if (A == B && B == C) {
    System.out.println("TRIANGULO EQUILATERO");
  }else if (A == B && B != C || A != B && B == C || C == A && B!= C) {
    System.out.println("TRIANGULO ISOSCELES");

}
 
    }
 
}
