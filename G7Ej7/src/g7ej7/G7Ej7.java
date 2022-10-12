/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7ej7;

import entidades.Persona;
import java.util.Scanner;
import servicio.PersonaServicio;

/**
 *
 * @author HJS Informatica
 */
public class G7Ej7 {

    /**
     * Realizar una clase llamada Persona que tenga los siguientes atributos:
     * nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si
     * el alumno desea añadir algún otro atributo, puede hacerlo. Los métodos
     * que se implementarán son: • Un constructor por defecto. • Un constructor
     * con todos los atributos como parámetro. • Métodos getters y setters de
     * cada atributo. • Metodo crearPersona(): el método crear persona, le pide
     * los valores de los atributos al usuario y después se le asignan a sus
     * respectivos atributos para llenar el objeto Persona. Además, comprueba
     * que el sexo introducido sea correcto, es decir, H, M o O. Si no es
     * correcto se deberá mostrar un mensaje • Método calcularIMC(): calculara
     * si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si
     * esta fórmula da por resultado un valor menor que 20, significa que la
     * persona está por debajo de su peso ideal y la función devuelve un -1. Si
     * la fórmula da por resultado un número entre 20 y 25 (incluidos),
     * significa que la persona está en su peso ideal y la función devuelve un
     * 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
     * significa que la persona tiene sobrepeso, y la función devuelve un 1. •
     * Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
     * devuelve un booleano. A continuación, en la clase main hacer lo
     * siguiente: Crear 4 objetos de tipo Persona con distintos valores, a
     * continuación, llamaremos todos los métodos para cada objeto, deberá
     * comprobar si la persona está en su peso ideal, tiene sobrepeso o está por
     * debajo de su peso ideal e indicar para cada objeto si la persona es mayor
     * de edad. Por último, guardaremos los resultados de los métodos
     * calcularIMC y esMayorDeEdad en distintas variables, para después en el
     * main, calcular un porcentaje de esas 4 personas cuantas están por debajo
     * de su peso, cuantas en su peso ideal y cuantos, por encima, y también
     * calcularemos un porcentaje de cuantos son mayores de edad y cuantos
     * menores.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese la cantidad de alumnos");
        int n = leer.nextInt();
        Persona vector[] = new Persona[n];
        PersonaServicio c = new PersonaServicio();
        int cont11 = 0;
        int cont0 = 0;
        int cont1 = 0;
        int Me = 0;
        for (int i = 0; i < n; i++) {

            vector[i] = c.llenarPersona();
            switch (c.calcularIMC(vector[i])) {
                case -1:
                    cont11++;

                    break;
                case 0:
                    cont0++;
                    break;
                case 1:
                    cont1++;
            }

            if (c.esMayorDeEdad(vector[i])) {
                Me++;
            }
        }
        System.out.println("el porcentaje de personas debajo de su peso ideal es de "+cont11*100/n+"%");
System.out.println("el porcentaje de personas en su peso ideal es de "+cont0*100/n+"%");
System.out.println("el porcentaje de personas arriba de su peso ideal es de "+cont1*100/n+"%");
        System.out.println("el porcentaje de personas mayores de edad es de "+Me*100/n+"%");
        System.out.println("el porcentaje de personas menores de edad es de "+(n-Me)*100/n+"%");
        
    }
    
}
