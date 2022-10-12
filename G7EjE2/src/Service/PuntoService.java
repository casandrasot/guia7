/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Punto;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author HJS Informatica
 */
public class PuntoService {
    /*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:*/
    Scanner sc= new Scanner(System.in);
    DecimalFormat df= new DecimalFormat("0.##");
    public Punto crearPunto(int i){
        System.out.println("ingrese la x del punto "+i);
    double x=sc.nextDouble();
        System.out.println("ingrese la y del punto "+i);
    double y=sc.nextDouble();
    return new Punto(x,y);}
    public void CalcDistancia(Punto p1, Punto p2){
    double difx= p1.getX()-p2.getX();
    double dify= p1.getY()-p2.getY();
        System.out.println("la distancia que existe entre los dos puntos es de "+df.format(Math.sqrt(Math.pow(difx, 2)+Math.pow(dify, 2))));}
}
