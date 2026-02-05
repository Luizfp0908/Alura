public class Carro {
    String modelo;
    String cor;
    int ano;


    public String fichaTecnica() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                '}';
    }

    public void idadeCarro(){
        int idadeCarro = 2026 - ano;
        if (ano == 2026){
            System.out.println("O carro é novo");
        } else if (ano > 2026) {
            System.out.println("Erro, carro nunca produzido");

        } else{
            System.out.println("Esse carro tem : " + idadeCarro + " de uso.");
        }

    }
}
