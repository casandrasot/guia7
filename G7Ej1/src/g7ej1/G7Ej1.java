/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7ej1;

import Libro.Libro;
import java.util.Scanner;

/**
 *
 * @author HJS Informatica
 */
public class G7Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/
       Libro l1= new Libro();
        l1.cargarLibro();
        System.out.println(l1);
    }
    
}
