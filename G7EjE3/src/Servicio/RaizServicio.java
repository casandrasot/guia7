/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Raiz;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author HJS Informatica
 */
public class RaizServicio {

    /*Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
• Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b*/
    DecimalFormat df= new DecimalFormat("0.##");
    public Raiz CrearRaiz() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el valor de a,b y c");
        return new Raiz(leer.nextInt(), leer.nextInt(), leer.nextInt());
    }

    public void getDiscriminante(Raiz r) {
        r.setDisc(Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC());
    }

    public boolean tieneRaices(Raiz r) {
        return (r.getDisc() > 0);
    }

    public boolean tieneRaiz(Raiz r) {
        return (r.getDisc() == 0);
    }

    public void obtenerRaiz(Raiz r) {

        System.out.println("la raiz es: " + df.format((-1) * r.getB() / (2 * r.getA())));
    }

    public void obtenerRaices(Raiz r) {

        System.out.println("las raices de la funcion son: "
                + df.format(((-1) * r.getB() + Math.sqrt(r.getDisc()) / (2 * r.getA())))
                +" y "
                + df.format(((-1) * r.getB() - Math.sqrt(r.getDisc()) / (2 * r.getA()))));
    }

    /*Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.*/
    public void calcular(Raiz r) {
        if (tieneRaices(r)) {
            obtenerRaices(r);
        } else if (tieneRaiz(r)) {
            obtenerRaiz(r);
        } else {
            System.out.println("no existen raices en el cuadro de los reales para su función");
        }
    }
}
