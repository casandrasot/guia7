/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author HJS Informatica
 */
public class Persona {
    private String nombre;
    private Date nac; private int edad;
    

    public Persona() {
    }

    public Persona(String nombre, Date nac) {
        this.nombre = nombre;
        this.nac = nac;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getNac() {
        return nac;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNac(Date nac) {
        this.nac = nac;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fecha de nacimiento=" + nac + ", edad="+edad+" años"+'}';
    }
    
    
}
