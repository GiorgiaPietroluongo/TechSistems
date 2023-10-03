package senac.java.Domain;

public class Users {

    private String nome;
    private String sobrenome;
    private int idade;
    private String endereco;
    private String email;
    private String cpf;
    private String senha;


    public Users(String nome, String sobrenome, int idade, String endereco, String email, String cpf, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.endereco = endereco;
        this.email = email;
        this.cpf = cpf;
        this.senha = senha;
    }


    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

}
