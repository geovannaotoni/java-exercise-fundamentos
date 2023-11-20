package com.trybe.java;

public class Principal {

  public static void main(String[] args) {
    Residente residente = new Residente("João", 22, 72, 1.75);

    System.out.println("Nome: " + residente.nome + "\nIdade: " + residente.idade + "\nPeso: " + residente.peso
        + "\nAltura: " + residente.altura);

    double h = residente.calculaImc();
    System.out.println(h);

    SmartHouse casa = new SmartHouse();
    boolean conectado = casa.conectarInternet(0.7);
    System.out.println(conectado ? "Conectado à Internet" : "Falha na conexão à Internet");
  }
}
