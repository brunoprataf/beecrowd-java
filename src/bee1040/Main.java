import java.util.Scanner;
 
/*
 * Beecrowd 1040 - Média 3
 * Linguagem: Java
 * Data: 27/07/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);
    float N1, N2, N3, N4, notaExame, media, mediaFinal;

    N1 = teclado.nextFloat();
    N2 = teclado.nextFloat();
    N3 = teclado.nextFloat();
    N4 = teclado.nextFloat();
    media = (N1 * 2 + N2 * 3 + N3 * 4 + N4) / 10;


    if (media >= 7.0) {
        System.out.printf("Media: %.1f%n", media);
        System.out.println("Aluno aprovado.");
        return;
    } else if (media < 5.0) {
        System.out.printf("Media: %.1f%n", media);
        System.out.println("Aluno reprovado.");
        return;
    } else if (media >= 5.0 && media <= 6.9) {
        System.out.printf("Media: %.1f%n", media);
        System.out.println("Aluno em exame.");
    }

    notaExame = teclado.nextFloat();
    mediaFinal = (media + notaExame) / 2;

    if (mediaFinal >= 5.0) {
        System.out.printf("Nota do exame: %.1f%n", notaExame);
        System.out.println("Aluno aprovado.");
        System.out.printf("Media final: %.1f%n", (media + notaExame) / 2);
    } else if (mediaFinal <= 4.9) {
        System.out.printf("Nota do exame: %.1f%n", notaExame);
        System.out.println("Aluno reprovado.");
        System.out.printf("Media final: %.1f%n", (media + notaExame) / 2);

    }
    }
 
}
