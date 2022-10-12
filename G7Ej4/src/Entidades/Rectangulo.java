/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

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
public class Rectangulo {

    private int b;
    private int h;

    public Rectangulo(int b, int h) {
        this.b = b;
        this.h = h;
    }

    public void Sup() {
        System.out.println("la superficie es de " + (b * h));
    }

    public void Perim() {
        System.out.println("el perimetro es de " + (b + h) * 2);
    }

    public void DibRect() {
       
         
for (int i = 0; i < h; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == (h - 1) || j == 0 || j == (b - 1)) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
                
            }System.out.println("");

        }
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getB() {
        return b;
    }

    public int getH() {
        return h;
    }
    
}
