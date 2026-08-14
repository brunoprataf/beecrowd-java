import java.util.Scanner;
 
/*
 * Beecrowd 1142 - PUM
 * Linguagem: Java
 * Data: 14/08/2026
 * Status: Accepted
 */
 
public class Main {
 
    public static void main(String[] args){
 
    Scanner teclado = new Scanner(System.in);

    int N = teclado.nextInt();

    for (int i = 1; i <= N; i++) {

        int primeiro = i * 4 - 3;
        int segundo = primeiro + 1;
        int terceiro = primeiro + 2;

        System.out.println(primeiro + " " + segundo + " " + terceiro + " PUM");
    }
 
    }
 
}
