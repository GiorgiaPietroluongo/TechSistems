package senac.java.Views;

import senac.java.Domain.Users;
import senac.java.Domain.Horarios;
import java.util.Scanner;

public class TelasCadastro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Cadastro de Usuário");
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Digite o email: ");
        String email = scanner.nextLine();

        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();


        Users usuario = new Users(nome, sobrenome, idade, endereco, email, cpf, senha);


        System.out.println("\nUsuário cadastrado com sucesso!");
        System.out.println("Informações do usuário:");
        System.out.println("Nome: " + usuario.getNome() + " " + usuario.getSobrenome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Endereço: " + usuario.getEndereco());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("Senha: " + usuario.getSenha());

        Horarios horarios = Horarios.obterHorariosDoFuncionario();
        horarios.exibirHorarios();

        scanner.close();
    }

}
