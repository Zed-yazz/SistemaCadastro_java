import java.util.Scanner;

public class app {
    public static void main(String []  args) {

        var scr =  new Scanner(System.in);
        int opcao = 0;

        Computador produto = null;
        Cliente cliente = null;

        System.out.println("=== INICIANDO SISTEMA ===");

        do {
            System.out.println("--- MENU INICIAL ---");
            System.out.println("Escolha uma da opções  a seguir");
            System.out.println("[1] - Cadastrar Cliente");
            System.out.println("[2] - Cadastrar Produto");
            System.out.println("[3] - Consultar Pedido");
            System.out.println("[4] - Sair");
            opcao = scr.nextInt();
            scr.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("--- INICIANDO CADASTRO DE CLIENTE ---");
                    cliente = new Cliente();
                    System.out.println("Escreva seu Nome");
                    String nome = scr.nextLine();
                    cliente.nome = nome;
                    System.out.println("Insira seu CPF");
                    String cpf = scr.nextLine();
                    cliente.cpf = cpf;
                    System.out.println("Coloque sua Idade");
                    int idade = scr.nextInt();
                    cliente.idade = idade;
                    cliente.estudante = cliente.verificarEstudante();
                    break;

                case 2:
                    System.out.println("--- INICIANDO CADASTRO DE PRODUTO ---");
                    produto = new Computador();

                    System.out.println("Fale o Modelo do computador?");
                    String modelo = scr.nextLine();
                    produto.modelo = modelo;

                    System.out.println("fale o Processador do computador?");
                    String modeloProcessador = scr.nextLine();
                    produto.processador = modeloProcessador;

                    System.out.println("Quanto de Memoria ram você deseja no seu Computador?");
                    int memoriaRam = scr.nextInt();

                    produto.quantidadeMemoriaRam = memoriaRam;
                    System.out.println("Quanto de Memoria terá no seu SSD");
                    int memoriaSSD = scr.nextInt();

                    produto.quantidadeSSD = memoriaSSD;

                    produto.placaDeVideoIntegrada = produto.verificarPlaca();
                    if (!produto.placaDeVideoIntegrada) {
                        System.out.println("Qual é o modelo da Placa de Video?");
                        String modeloPlaca = scr.nextLine();
                        produto.modeloPlacaDeVideo = modeloPlaca;
                    }

                    System.out.println("Fale o valor do Computador");
                    double valorComputador = scr.nextDouble();
                    produto.valor = valorComputador;

                    scr.nextLine();
                    produto.cliente = cliente;
                    break;

                case 3:
                    if (cliente == null || produto == null) {
                        System.out.println("Erro: você precisa cadastrar um cliente ou um produto para pdoer fazer uma consulta");
                    } else {
                        produto.cliente = cliente;

                        produto.valorTotal();
                    }
                    break;
            }
        } while ( opcao != 4);
        scr.close();
    }
}
