package com.trybe.java;

/**
 * Classe.
 */
public class SmartHouse {
  private boolean lampada = false;

  /**
   * Ligar lampada.
   */
  public void ligarLampada() {
    lampada = true;
  }

  /**
   * Desligar lampada.
   */
  public void desligarLampada() {
    lampada = false;
  }

  /**
   * Is lampada ligada boolean.
   *
   * @return the boolean
   */
  public boolean isLampadaLigada() {
    return lampada;
  }
}
