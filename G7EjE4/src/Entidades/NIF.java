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
public class NIF {

    private long DNI;
    private char NIF;

    public NIF() {
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public char getNIF() {
        return NIF;
    }

    public void setNIF(char NIF) {
        this.NIF = NIF;
    }

    public NIF(long DNI, char NIF) {
        this.DNI = DNI;
        this.NIF = NIF;
    }

}
