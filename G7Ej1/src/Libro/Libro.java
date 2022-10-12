/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

import java.util.Scanner;

/**
 *
 * @author HJS Informatica
 */
public class Libro {
    /*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/
    public String autor;
    public String titulo;
    public String ISBN;
    public int np;

    public Libro(String autor, String titulo, String ISBN, int np) {
        this.autor = autor;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.np = np;
    }

    public Libro() {
    }
    public void cargarLibro(){
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el título del libro");
    titulo=leer.next();
    System.out.println("ingrese el autor del libro");
    autor=leer.next();
    System.out.println("ingrese el número de páginas del libro");
    np=leer.nextInt();
    System.out.println("ingrese el ISBN del libro");
    ISBN=leer.next();
    
    }

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", titulo=" + titulo + ", ISBN=" + ISBN + ", np=" + np + '}';
    }
    
    
}
