/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7ejee4;

import Entidades.Fecha;
import Service.FechaSv;

/**
 *
 * @author HJS Informatica
 */
public class G7EjEE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaSv sv = new FechaSv();
        Fecha f = sv.crearFecha();
        sv.mostrar(f);
    }
    
}
