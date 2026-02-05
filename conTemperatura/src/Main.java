import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor para transformar Celsius para Fahrenheit: ");
        int temperatura = sc.nextInt();

        temperatura = (int) ((temperatura * 1.8) + 32);

        System.out.println(temperatura);



    }
}