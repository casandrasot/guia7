/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7ej4.Service;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author HJS Informatica
 */
/*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
*/
public class Service {

    public Rectangulo crearRect() {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese la base del rectángulo "); 
        int n1=leer.nextInt();
        System.out.println("ingrese la altura del rectángulo");
        int n2=leer.nextInt();
        Rectangulo h= new Rectangulo(n1,n2);
        return h;
    }
  
}
