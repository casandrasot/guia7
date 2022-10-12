/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author HJS Informatica
 */
public class Ahorcado {
    private String[] palabra,encontrada;
    private int jugadas,cantE;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, String[] encontrada, int jugadas, int cantE) {
        this.palabra = palabra;
        this.encontrada = encontrada;
        this.jugadas = jugadas;
        this.cantE = cantE;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public String[] getEncontrada() {
        return encontrada;
    }

    public void setEncontrada(String[] encontrada) {
        this.encontrada = encontrada;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    public int getCantE() {
        return cantE;
    }

    public void setCantE(int cantE) {
        this.cantE = cantE;
    }
    
}
