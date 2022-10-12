/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7eje2;

import Entidades.Punto;
import Service.PuntoService;

/**
 *
 * @author HJS Informatica
 */
public class G7EjE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:*/
        PuntoService ps= new PuntoService();
        Punto p1= ps.crearPunto(1);
        Punto p2 = ps.crearPunto(2);
        ps.CalcDistancia(p1, p2);
    }
    
}
