package modelo.usuario;

import modelo.util.Cpf;

public class Usuario {
    private String nome;
    private Cpf cpf;

    public Usuario(String nome, Cpf cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public Cpf getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nCPF: " + this.cpf;
    }
}
