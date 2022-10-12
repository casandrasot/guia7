/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7ej2.Circunfferencia;

import java.util.Scanner;

/**
 *
 * @author HJS Informatica
 */
public class Circunferencia {
    /*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).*/
    private double radio;

    public Circunferencia() {
    }
    

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    public double crearCircunferencia() {
      Scanner leer= new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el radio de la circunferencia");
        radio= leer.nextInt();
        return radio;  
    }
    public void area(double radio){
        System.out.println("el área es "+(3.14*radio*radio));
    }
    public void perim(double radio){
        System.out.println("el perímetro es de "+(2*3.14*radio));}
    

   
    
}
