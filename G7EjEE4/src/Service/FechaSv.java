/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Fecha;
import java.util.Scanner;

/**
 *
 * @author HJS Informatica
 */
public class FechaSv {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Fecha crearFecha() {

        Fecha f = new Fecha();
        do {
            System.out.println("ingrese día, mes y año");
            boolean vf;
            f.setDia(sc.nextInt());
            f.setMes(sc.nextInt() - 1);
            f.setAño(sc.nextInt());

            if (f.getAño() % 4 == 0 && ((f.getAño() % 100 != 0) || (f.getAño() % 400 == 0))) {
                f.setMeses(1, 29);
            } else {
                f.setMeses(1, 28);
            }

        } while (probar(f) == false);
        estAño(f);
        return f;

    }

    public boolean probar(Fecha f) {
        return (f.getMeses()[f.getMes()] - f.getDia() >= 0 && f.getDia() > 0);
    }

    public void estAño(Fecha f) {
        if (f.getAño() > 2021 || f.getAño() < 1900) {
            f.setAño(1900);
        }
    }

    public void mostrarMes(Fecha f) {
        System.out.println("Usted ingresó mes " + (f.getMes() + 1) + " (" + f.getSmeses()[f.getMes()]
                + ") que tiene " + f.getMeses()[f.getMes()] + " días");
    }

    public void mostrar(Fecha f) {
        mostrarMes(f);
        if (f.getDia() == 1) {
            if (f.getMes() != 0) {
                System.out.println("El día anterior es " + f.getMeses()[f.getMes() - 1]
                        + "de " + f.getSmeses()[f.getMes() - 1] + " del " + f.getAño());
            } else {
                System.out.println("El día anterior es " + f.getMeses()[11]
                        + "de " + f.getSmeses()[11] + " del " + (f.getAño() - 1));
            }

        } else {
            System.out.println("El día anterior es " + (f.getDia() - 1)
                    + "de " + f.getSmeses()[f.getMes()] + " del " + f.getAño());
        }
        if (f.getDia() == f.getMeses()[f.getMes()]) {
            if (f.getMes() != 11) {
                System.out.println("El día posterior es 1 de " + f.getSmeses()[f.getMes() + 1]
                        + " del " + f.getAño());
            } else {
                System.out.println("El día posterior es 1 de " + f.getSmeses()[0] + " del " + (f.getAño() + 1));
            }

        } else {
            System.out.println("El día posterior es " + (f.getDia() + 1)
                    + "de " + f.getSmeses()[f.getMes()] + " del " + f.getAño());
        }
    }
}
