import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int sorte = r.nextInt(10);
        int jogadas = 5;


        for (int i = 0; i <= jogadas; i++) {
            System.out.println("----jogo de adivinhação----");
            System.out.println("----Digite um numero de 0 a 10:----");
            int num = sc.nextInt();

            if (num == sorte) {
                System.out.println("Voce adivinhou o numero");
                System.out.println("----Fim do Jogo----");
                break;

            } else {
                System.out.println("Errou.../ vc tem mais " + (jogadas - i) + " tentativas");

            }

            if (i == jogadas) {
                System.out.println("Acabaram as tentativas");
                System.out.println("Numero certo era o" + sorte);
            }
        }
    }
}