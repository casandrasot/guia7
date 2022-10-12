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
public class Triangulo {
    private double b,h,area,perim;

    public Triangulo() {
    }

    public Triangulo(double b, double h, double area, double perim) {
        this.b = b;
        this.h = h;
        this.area = area;
        this.perim=perim;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerim() {
        return perim;
    }

    public void setPerim(double perim) {
        this.perim = perim;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "b=" + b + ", h=" + h + ", area=" + area + ", perim=" + perim + '}';
    }
    
    
}
