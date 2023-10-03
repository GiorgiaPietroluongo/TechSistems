package senac.java.Services;

import java.util.Scanner;
public class CadastroCliente {


    private String nome = "";
    private int idade = 0;
    private String email = "";
    private String numeroTelefone = "";

    public CadastroCliente(String nome, int idade, String email, String numeroTelefone) {
        nome = nome;
        idade = idade;
        email = email;
        numeroTelefone = numeroTelefone;
    }

    public void exibirInformacoes() {
        System.out.println("Nome completo do usuário: " + nome);
        System.out.println("Idade do usuário: " + idade);
        System.out.println("E-mail do usuário: " + email);
        System.out.println("Número de telefone do usuário: " + numeroTelefone);
    }

    public static CadastroCliente obterDadosDoUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o nome completo do usuário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do usuário: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o e-mail do usuário: ");
        String email = scanner.nextLine();

        System.out.print("Digite o número de telefone do usuário: ");
        String numeroTelefone = scanner.nextLine();

        return new CadastroCliente(nome, idade, email, numeroTelefone);
    }

    public static void main(String[] args) {
        CadastroCliente cliente = obterDadosDoUsuario();
        cliente.exibirInformacoes();
    }
}