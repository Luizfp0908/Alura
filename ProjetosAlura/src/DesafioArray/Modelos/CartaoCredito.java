package DesafioArray.Modelos;

import java.util.ArrayList;
import java.util.Collections;

public class CartaoCredito {
    private int limite;
    private double valor;
    private String descricao;
    private ArrayList<String> lista = new ArrayList<>();

    public CartaoCredito(int limite, String descricao) {
        this.limite = limite;
        this.descricao = descricao;
        this.valor = limite;

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getLimite() {
        return limite;
    }

    public double getValor() {
        return valor;
    }

    public void exibirInfo(){
        Collections.sort(this.lista);
        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:");
        for (String l : lista) {
            System.out.println(l);
        }
        System.out.println("***********************");
        System.out.println("\nSaldo do cartão: R$ " + this.valor);
    }


    public void saldo(String descricao,double amount) {
        if (this.valor >= amount) {
            this.valor -= amount;
            this.lista.add(descricao + " - R$ " + amount);

        } else {
            System.out.println("""
                    Saldo insuficiente!
                    *******************
                    COMPRAS REALIZADAS
                    """);
            for (String l : lista) {
                System.out.println(l);
            }

            System.out.println("Saldo do cartao: " + getValor());

        }


    }



}
