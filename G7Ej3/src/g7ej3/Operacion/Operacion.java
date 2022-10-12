/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7ej3.Operacion;

/**
 *
 * @author HJS Informatica
 */
public class Operacion {

    /*Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.*/
    private int n1, n2;

    public Operacion() 
    {
    }

    public Operacion(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    

    public int sumar(int n1, int n2) {

        return n1 + n2;
    }

    public int restar(int n1, int n2) {
        return n1 - n2;
    }

    public int multiplicar(int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
            return 0;
        } else {
            return n1 * n2;
        }
    }

    public double dividir(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("La división no se puede hacer ");
            return 0;
        } else {
            
            return ((double) n1/(double) n2);
        }
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

}
