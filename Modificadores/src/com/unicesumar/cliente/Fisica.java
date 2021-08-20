package com.unicesumar.cliente;

import java.util.Scanner;

public class Fisica extends Pessoa {
  private String cpf;

  public Fisica() {
    System.out.println("[Fisica]: Executando o construtor...");
  }

  public Fisica(String nome) {
    this.setNome(nome);
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  @Override
  public void cadastrar() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Informe o nome do cliente: ");
    this.setNome(scanner.nextLine());
  }

}
