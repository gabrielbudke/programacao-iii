package com.unicesumar.caixaeletronico;

import com.unicesumar.cliente.Fisica;
import com.unicesumar.conta.Conta;

public class CaixaEletronico {
  public static void main(String[] args) {

    // Usando construtor sem argumentos
    Fisica pessoa = new Fisica();
    pessoa.cadastrar();
    System.out.println("Nome da pessoa: " + pessoa.getNome());

    Conta contaPessoa = new Conta();
    contaPessoa.setTitular(pessoa);
    System.out.println("Titular da conta: " + contaPessoa.getTitular().getNome());
    System.out.println("Valor limite da conta da pessoa: R$" + contaPessoa.getVALOR_LIMITE_TRANSFERENCIA());

    // Usando o construtor com argumentos
    Fisica outraPessoa = new Fisica("Carlos Henrique");
    System.out.println("Nome da outra pessoa: " + outraPessoa.getNome());

    Conta contaOutraPessoa = new Conta();
    contaOutraPessoa.setTitular(outraPessoa);
    System.out.println("Titular da outra conta: " + contaOutraPessoa.getTitular().getNome());
    System.out.println("Valor limite da conta da outra pessoa: R$" + contaOutraPessoa.getVALOR_LIMITE_TRANSFERENCIA());

  }

}
