/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * Realizar una clase llamada Persona que tenga los siguientes atributos:
 * nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el
 * alumno desea añadir algún otro atributo, puede hacerlo. Los métodos que se
 * implementarán son: • Un constructor por defecto. • Un constructor con todos
 * los atributos como parámetro. • Métodos getters y setters de cada atributo. •
 * Metodo crearPersona(): el método crear persona, le pide los valores de los
 * atributos al usuario y después se le asignan a sus respectivos atributos para
 * llenar el objeto Persona. Además, comprueba que el sexo introducido sea
 * correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
 * • Método calcularIMC(): calculara si la persona está en su peso ideal (peso
 * en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
 * 20, significa que la persona está por debajo de su peso ideal y la función
 * devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
 * (incluidos), significa que la persona está en su peso ideal y la función
 * devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor
 * que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 * • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano. A continuación, en la clase main hacer lo siguiente:
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación,
 * llamaremos todos los métodos para cada objeto, deberá comprobar si la persona
 * está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e
 * indicar para cada objeto si la persona es mayor de edad. Por último,
 * guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
 * distintas variables, para después en el main, calcular un porcentaje de esas
 * 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y
 * cuantos, por encima, y también calcularemos un porcentaje de cuantos son
 * mayores de edad y cuantos menores.
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona llenarPersona() {
        System.out.println("ingrese el nombre");
        String nombre = leer.next();
        System.out.println("ingrese la edad");
        int edad = leer.nextInt();
        String sexo = "";
        do {
            System.out.println("ingrese el sexo (M/H/O)");
            sexo = leer.next().toUpperCase();
        } while (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("O"));
        System.out.println("Ingrese el peso");
        double peso = leer.nextDouble();
        System.out.println("Ingrese la altura");
        double h = leer.nextDouble();

        return new Persona(edad, peso, h, sexo, nombre);
    }

    /*Método calcularIMC(): calculara si la persona está en su peso ideal (peso
 * en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
 * 20, significa que la persona está por debajo de su peso ideal y la función
 * devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
 * (incluidos), significa que la persona está en su peso ideal y la función
 * devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor
 * que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.*/
    public int calcularIMC(Persona P) {
        double IMC = (P.getPeso() / (Math.pow(P.getAltura(), 2)));
        int w=0;
        if (IMC < 20) {
            w = -1;

        } else if (IMC >= 20 && IMC <= 25) {
            w = 0;
        } else if (IMC > 25) {
            w = 1;
        }
        
        return w;
        
    }
    /* Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano.*/
    public boolean esMayorDeEdad(Persona P){
    return (P.getEdad()>=18);}

}
