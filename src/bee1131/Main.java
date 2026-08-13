import java.util.Scanner;
 
/*
 * Beecrowd 1131 - Grenais
 * Linguagem: Java
 * Data: 13/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args) {
 
    Scanner teclado = new Scanner(System.in);

    int opcao = 1;
    int vitoriaInter = 0;
    int vitoriaGremio = 0;
    int empate = 0;
    int jogos = 0;

    while (opcao == 1) {

        int golInter = teclado.nextInt();
        int golGremio = teclado.nextInt();


        if (golInter > golGremio) {
            vitoriaInter++;
            jogos++;
        } else if (golInter < golGremio) {
            vitoriaGremio++;
            jogos++;
        } else {
            empate++;
            jogos++;
        }

        System.out.println("Novo grenal (1-sim 2-nao)");
        opcao = teclado.nextInt();

        while (opcao != 1 && opcao != 2) {
            System.out.println("Novo grenal (1-sim 2-nao)");
            opcao = teclado.nextInt();
        }
    }

    System.out.println(jogos + " grenais");
    System.out.println("Inter:" + vitoriaInter);
    System.out.println("Gremio:" + vitoriaGremio);
    System.out.println("Empates:" + empate);

    if (vitoriaInter > vitoriaGremio) {
        System.out.println("Inter venceu mais");
    } else if (vitoriaInter < vitoriaGremio) {
        System.out.println("Gremio venceu mais");
    } else {
        System.out.println("Nao houve vencedor");
    }
 
    }
 
}
