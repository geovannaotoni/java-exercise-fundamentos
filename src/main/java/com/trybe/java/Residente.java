package com.trybe.java;

/**
 * Classe.
 **/
public class Residente {

  /**
   * Atributos da classe.
   */
  private String nome;
  private int idade;
  private double peso;
  private double altura;

  /**
   * Método Construtor.
   */
  public Residente(String nome, int idade, double peso, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
  }

  public double calculaImc() {
    return this.peso / (this.altura * this.altura);
  }
}
