import java.util.Scanner;


public class Cliente {
    String nome;
    String cpf;
    int idade;
    Boolean estudante;



    public boolean verificarEstudante() {
        var scr = new Scanner(System.in);

        System.out.println("Boa tarde gostaria de saber se o senhor é um estudante? (S/N)");
        String opcao = scr.nextLine();

        if (opcao.equalsIgnoreCase("S")) {
            return true;
        } else {
            return false;
        }

    }

}
