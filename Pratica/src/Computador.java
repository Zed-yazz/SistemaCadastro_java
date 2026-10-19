import java.util.Scanner;

public class Computador {
    Cliente cliente;
    String modelo;
    String processador;
    int quantidadeMemoriaRam;
    int quantidadeSSD;
    boolean placaDeVideoIntegrada;
    String modeloPlacaDeVideo;
    double valor;



    public double valorTotal() {

        double total = valor * (quantidadeMemoriaRam * 50.0) * (quantidadeSSD * 2.0);

        if (cliente != null && cliente.estudante != false) {
            System.out.println("O Senhor tem um pequeno desconto de 50% por ser estudante");
            double valorDesconto = total * 0.5;
            System.out.println("Seu valor com desconto será: R$" + valorDesconto);
            return valorDesconto;
        }
        else {
            System.out.println("Desculpe mas infelizmente você não tem acesso ao desconto!");
            System.out.println("O valor total ficara: R$" + total);
            return total;
        }

    }

    public boolean verificarPlaca() {
        var scr = new Scanner(System.in);

        System.out.println("A placa de Video é Integrada? (S/N)");
        String opcao = scr.nextLine();
        if (opcao.equalsIgnoreCase("S")){
            return true;
        } else{
            return false;
        }
    }



}


