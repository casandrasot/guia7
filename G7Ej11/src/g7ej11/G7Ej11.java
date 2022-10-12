/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7ej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author HJS Informatica
 */
public class G7Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();*/
        
        Scanner leer= new Scanner(System.in).useDelimiter("/");
        

        //Pedimos fecha al usuario
        System.out.println("Ingrese un año");
        int anio = leer.nextInt() - 1900;
        System.out.println("Ingrese un mes");
        int mes = leer.nextInt() - 1;
        System.out.println("Ingrese un día");
        int dia = leer.nextInt();

        //Instanciamos la fechas y mostramos
        Date fechaUsuario = new Date(anio, mes, dia);
        System.out.println(fechaUsuario.toString());
        Date fechaActual = new Date();
        System.out.println(fechaActual.toString());


        }public static int diferencia(Date fechaUsuario, Date fechaActual) {
        int dif = Math.abs(fechaUsuario.getYear() - fechaActual.getYear());
        switch (fechaUsuario.compareTo(fechaActual)) {
            case -1:
                if (fechaUsuario.getMonth() > fechaActual.getMonth()) {
                   
                    dif--;
                } else if (fechaUsuario.getMonth() == fechaActual.getMonth() && fechaUsuario.getDate() > fechaActual.getDate()) {
                    dif--;
                }
                break;
            case 1:
                if (fechaUsuario.getMonth() < fechaActual.getMonth()) {
                    dif--;
                } else if (fechaUsuario.getMonth() == fechaActual.getMonth() && fechaUsuario.getDate() < fechaActual.getDate()) {
                    dif--;
                }
                break;
        }
        return dif;
    }   

    
}
