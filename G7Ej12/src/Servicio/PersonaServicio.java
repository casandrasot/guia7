/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author HJS Informatica
 */
public class PersonaServicio {

    /*Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.*/
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Date actual = new Date();

    public Persona CrearPersona() {
        System.out.println("ingrese el nombre de la persona");
        String nom = leer.next();
        Date nac = new Date(0, 0, 0);

        do {
            System.out.println("ingrese el dia de nacimiento");
            int dia = leer.nextInt();
            System.out.println("ingrese el mes de nacimiento");
            int mes = leer.nextInt();
            System.out.println("ingrese el año de nacimiento");
            int ano = leer.nextInt();
            nac.setDate(dia);
            nac.setMonth(mes-1);
            nac.setYear(ano-1900);
        } while (nac.compareTo(actual) == 1);
        return new Persona(nom, nac);
    }

    public void calcularEdad(Persona p1) {
        /*04-2-2000//27-1-2001
        ya cumpli
        29-2-2000
        no cumpli
         */
        int ano;
        if (actual.getMonth() - p1.getNac().getMonth() > 0) {
            ano = actual.getYear() - p1.getNac().getYear();
        } else if (actual.getMonth() - p1.getNac().getMonth() == 0) {
            if (actual.getDay() >= p1.getNac().getDay()) {
                ano = actual.getYear() - p1.getNac().getYear();
            } else {
                ano = actual.getYear() - p1.getNac().getYear() - 1;
            }
        } else {
            ano = actual.getYear() - p1.getNac().getYear() - 1;
        }
        p1.setEdad(ano+1900);

    }

    public boolean MenorQue(Date d2, Persona p1) {
        return (p1.getNac().before(d2));
    }

}
