package com.poo.projeto.escola;

import java.util.Scanner;

public abstract class Pessoas {
    //atributos -> são privados
    private int id;
    private String nome;
    private int cpf;
    private String dataNascimento;
    private String endereco;
    private String telefone;

   //construtor -> recebe novas informações no Application
   public Pessoas(int id, String nome, int cpf, String dataNascimento, String endereco, String telefone){
    this.id = id;
    this.nome = nome;
    this.cpf = cpf;
    this.dataNascimento = dataNascimento;
    this.endereco = endereco;
    this.telefone = telefone;

   }

   public String getNome() {
    return nome;
    }

    public void setNome(String nome) {
    this.nome = nome;
    }

    public int getCpf() {
    return cpf;
    }

    public void setCpf(int cpf) {
    this.cpf = cpf;
    }

    public String getDataNascimento() {
    return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}