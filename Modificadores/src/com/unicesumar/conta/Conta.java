package com.unicesumar.conta;

import com.unicesumar.cliente.Pessoa;

public class Conta {
  private Pessoa titular;
  private float saldo;
  private int numeroConta;

  private final int VALOR_LIMITE_TRANSFERENCIA = 3000;

  public Pessoa getTitular() {
    return titular;
  }

  public void setTitular(Pessoa titular) {
    this.titular = titular;
  }

  public float getSaldo() {
    return saldo;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  public int getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
  }

  public int getVALOR_LIMITE_TRANSFERENCIA() {
    return VALOR_LIMITE_TRANSFERENCIA;
  }

  

}
