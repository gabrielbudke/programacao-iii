package com.unicesumar.cliente;

public abstract class Pessoa {
  private String nome;
  private String telefone;

  public Pessoa() {
    System.out.println("[Pessoa]: Executando construtor...");
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public abstract void cadastrar();

}
