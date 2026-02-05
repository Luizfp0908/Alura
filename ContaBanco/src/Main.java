import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o tipo da conta: ");
        String conta = sc.nextLine();
        System.out.println("Digite o valor inicial: ");
        double valor = sc.nextDouble();


        int x = 1;
        while (x == 1) {
            System.out.println("""
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    """);

            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    consultar(valor);
                    break;
                case 2:
                    transferincia(valor,sc);
                    break;
                case 3:
                    receber(valor, sc);
                    break;
                case 4:
                    System.out.println("Saindo do sistema. Até logo, " + nome + "!");
                    x = 0;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");


            }

        }
    }


    static void consultar(double valor) {
        System.out.printf("Saldo atual: R$ %.2f%n", valor);
        if (valor >= 0) {
            System.out.println("Status: Saldo Positivo");
        } else {
            System.out.println("Status: Saldo Negativo");
        }
    }

    static double receber(double saldoAtual, Scanner sc) {
        System.out.println("Digite o valor do deposito:");
        double deposito = sc.nextDouble();

        double novoSaldo = saldoAtual + deposito;
        System.out.printf("Depósito realizado! Novo saldo: R$ %.2f%n", novoSaldo);

        return novoSaldo;
    }

    static double transferincia(double saldoAtual, Scanner sc) {
        System.out.println("Digite o valor que deseja transferir:");
        double transferir = sc.nextDouble();

        if (transferir > saldoAtual) {
            System.out.println("Saldo insuficiente para transferência.");
            return saldoAtual;
        } else {
            double novoSaldo = saldoAtual - transferir;
            System.out.println("Transferência concluída!");
            return novoSaldo;
        }
    }


}