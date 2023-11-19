package com.trybe.java;

/**
 * Classe.
 */
public class SmartHouse {
  private boolean lampada = false;

  public void ligarLampada() {
    this.lampada = true;
  }

  public void desligarLampada() {
    this.lampada = false;
  }

  public boolean isLampadaLigada() {
    return this.lampada;
  }

  public boolean conectarInternet(double successRate) {
    return successRate > 0.5;
  }
}
