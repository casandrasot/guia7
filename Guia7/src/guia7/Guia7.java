/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import guia7.entidades.Mascota;
import java.util.Scanner;



/**
 *
 * @author HJS Informatica
 */
public class Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Mascota m1= new Mascota(leer.next(), leer.next());
        m1.nombre="Fernando";
        m1.tipo="perro";
        m1.color="tricolor";
        m1.edad=3;
        m1.cola=true;
              
            //public String nombre;  public String tipo;  public String color;
    // public int edad;  public boolean cola; 
            
    }
    
}
