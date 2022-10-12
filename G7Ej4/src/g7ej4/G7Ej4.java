/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7ej4;

import Entidades.Rectangulo;
import g7ej4.Service.Service;

/**
 *
 * @author HJS Informatica
 */
public class G7Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
        
*/
        Service gt = new Service();
        Rectangulo R1 = gt.crearRect();
        R1.Sup();
        R1.Perim();
        R1.DibRect();
        Service g = new Service();
        Rectangulo R2 = g.crearRect();
        R2.Sup();
        R2.Perim();
        R2.DibRect();
        
    }
    
}
