/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7ejee5;

import Entidades.Triangulo;
import Service.TrianguloSv;

/**
 *
 * @author HJS Informatica
 */
public class G7EjEE5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TrianguloSv sv = new TrianguloSv();
        Triangulo[] trgls = new Triangulo[4];
        int max=0;
        for (int i = 0; i < 4; i++) {
            trgls[i] = sv.crearTriangulo(i);
            sv.mostrar(trgls[i+1]);
            if (i == 0) {
                max = 0;
            } else {
                sv.maximo(max, trgls, i);
            }
        }
        System.out.println("El triangulo con mayor area es el número "+ (max+1));
        System.out.println("sus caract son: "+trgls[max]);
    }
    
}
