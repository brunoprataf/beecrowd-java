import java.util.Scanner;
import java.util.Objects;
 
/*
 * Beecrowd 1049 - Animal
 * Linguagem: Java
 * Data: 30/07/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    String A, B,C;
    A = teclado.nextLine();
    B = teclado.nextLine();
    C = teclado.nextLine();


    if (Objects.equals(A, "vertebrado") && Objects.equals(B, "ave") && Objects.equals(C, "carnivoro")) {
        System.out.println("aguia");
    }else if (Objects.equals(A, "vertebrado") && Objects.equals(B, "ave") && Objects.equals(C, "onivoro")) {
        System.out.println("pomba");
    }else if (Objects.equals(A, "vertebrado") && Objects.equals(B, "mamifero") && Objects.equals(C, "onivoro")) {
        System.out.println("homem");
    }else if (Objects.equals(A, "vertebrado") && Objects.equals(B, "mamifero") && Objects.equals(C, "herbivoro")) {
        System.out.println("vaca");
    }else if (Objects.equals(A, "invertebrado") && Objects.equals(B, "inseto") && Objects.equals(C, "hematofago")) {
        System.out.println("pulga");
    }else if (Objects.equals(A, "invertebrado") && Objects.equals(B, "inseto") && Objects.equals(C, "herbivoro")) {
        System.out.println("lagarta");
    }else if (Objects.equals(A, "invertebrado") && Objects.equals(B, "anelideo") && Objects.equals(C, "hematofago")) {
        System.out.println("sanguessuga");
    }else if (Objects.equals(A, "invertebrado") && Objects.equals(B, "anelideo") && Objects.equals(C, "onivoro")) {
        System.out.println("minhoca");
        }
 
    }
 
}
