/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Triangulo;
import java.util.Scanner;

/**
 *
 * @author HJS Informatica
 */
public class TrianguloSv {

    Scanner sc = new Scanner(System.in);

    public Triangulo crearTriangulo(int i) {
        System.out.println("ingrese la longitud de los lados iguales del triangulo "+i);
        double LI = sc.nextDouble();
        System.out.println("ingrese la longitud del otro lado");
        double LD = sc.nextDouble();
        double area = (LD * Math.sqrt(Math.pow(LD, 2) + Math.pow(LI / 2, 2))) / 2;
        return new Triangulo(LD, Math.sqrt(Math.pow(LD, 2) + Math.pow(LI / 2, 2)), area, LI * 2 + LD);
    }

    public void mostrar(Triangulo t) {
        System.out.println("El área del triángulo es de " + t.getArea());
        System.out.println("El perímetro del triángulo es de " + t.getPerim());
    }
/*posicion de triangulo con mayor area guardar en main*/
    public int maximo(int m, Triangulo[] t, int i) {
        if (t[m].getArea() == Math.max(t[m].getArea(), (t[i].getArea()))) {
            return m;
        } else {
            return i;
        }

    }

   
}
