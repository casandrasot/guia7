/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7.entidades;

/**
 *
 * @author HJS Informatica
 */
public class Mascota {

    public String nombre;
    public String tipo;
    public String color;
    public int edad;
    public boolean cola;

    public Mascota() {
    }//constructor

    public Mascota(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo=tipo;
    }
}
