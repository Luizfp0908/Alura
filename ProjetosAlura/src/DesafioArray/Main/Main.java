package DesafioArray.Main;

import DesafioArray.Modelos.CartaoCredito;
import DesafioArray.Modelos.Compras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        int limite = sc.nextInt();

        CartaoCredito c = new CartaoCredito(limite, "Cartão Principal");

        int x;
        do {
            sc.nextLine();
            System.out.println("Digite a descrição do produto:");
            String descricao = sc.nextLine();
            System.out.println("Digite o valor da compra:");
            double valor = sc.nextDouble();
            Compras compra = new Compras(descricao,valor);
            c.saldo(compra);


            System.out.println("""
            
            Deseja realizar outra compra?
            1 - Sim (Continuar)
            0 - Não (Sair)
            """);
            x = sc.nextInt();

            if (x == 0){
                c.exibirInfo();
            }



        } while (x == 1);

        System.out.println("Sistema encerrado. Obrigado!");




    }

}

