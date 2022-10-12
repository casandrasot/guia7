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
public class Fecha {

    private int dia, Mes, año;
    private int[] meses = new int[]{31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String[] Smeses = new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
        "Octubre", "Noviembre", "Diciembre"};

    public Fecha() {
    }

    public Fecha(int dia, int Mes, int año) {
        this.dia = dia;
        this.Mes = Mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int[] getMeses() {
        return meses;
    }

    public void setMeses(int posicion, int valor) {
        meses[posicion] = valor;
    }

    public int getMes() {
        return Mes;
    }

    public void setMes(int Mes) {
        this.Mes = Mes;
    }

    public String[] getSmeses() {
        return Smeses;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

}
