/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author HJS Informatica
 */
public class AhorcadoSv {

    Scanner sc = new Scanner(System.in) ;

    public Ahorcado crearAhorcado() {
        System.out.println("ingrese la palabra que se deberá adivinar");
        String palabra = sc.next();
        System.out.println("ingrese la cantidad de jugadas máximas");
        int jugMax = sc.nextInt();
        String[] pal = new String[palabra.length()];
        String[] enc = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            pal[i] = String.valueOf((palabra.charAt(i)));
            enc[i] = "_ ";
        }
        return new Ahorcado(pal, enc, jugMax, 0);

    }

    public boolean encontrarYSumar(Ahorcado a, String l, String[] enc) {
        boolean encontrada = false;
        for (int i = 0; i < a.getPalabra().length; i++) {
            if (a.getPalabra()[i].equalsIgnoreCase(l)) {
                encontrada = true;
                enc[i] = a.getPalabra()[i].toUpperCase();
            }
        }
        SumarEncontradas(a);
        a.setEncontrada(enc);
        return encontrada;
    }

    public void SumarEncontradas( Ahorcado a) {
        int cont = 0;
        
        for (int i = 0; i < a.getEncontrada().length; i++) {
            if (a.getEncontrada()[i].equalsIgnoreCase(a.getPalabra()[i])) {
                cont++;

            }
        }
        a.setCantE(cont);
    }

    public void RestarJug(Ahorcado a, boolean enc) {
        if (enc == false) {
            a.setJugadas(a.getJugadas() - 1);
        }
    }

    public void Jugar(Ahorcado a) {
        String[] enc = new String[a.getPalabra().length];
        enc = a.getEncontrada();
        do {
            System.out.println("¿Qué letra pensas que está en la palabra?");
            RestarJug(a, encontrarYSumar(a, String.valueOf(sc.next().charAt(0)), enc));
            //llamo a todos los métodos del service
            enc = a.getEncontrada();
            for (int i = 0; i < enc.length; i++) {
                System.out.print(a.getEncontrada()[i]);
            }
            System.out.println("");
            System.out.println("Le quedan "+ a.getJugadas()+" intentos fallidos");
        } while (a.getJugadas() > 0 && a.getCantE() != a.getEncontrada().length);
        
        if (a.getJugadas() > 0) {
            System.out.println("Felicitaciones, encontró la palabra :):):)");
        } else {
            System.out.println("No encontraste la palabra, te recomiendo que leas el diccionario");
        }

    }
}
