package br.ulbra.sistemasdecadastros;

public class Registro
{
    private String nome;
    private String endereco;
    private String telefone;


    // Construtor: usado para criar um novo objeto Registro com os dados iniciais
    public Registro(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }


    // Métodos "get": usados para acessar os dados armazenados no objeto
    public String getNome() {
        return nome;
    }


    public String getEndereco() {
        return endereco;
    }


    public String getTelefone() {
        return telefone;
    }
    }
