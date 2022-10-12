/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author HJS Informatica
 */
public class NIFSv {

    /*Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número
de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en
un array (vector) de caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente. La tabla de caracteres es la siguiente:*/
    Scanner sc = new Scanner(System.in);
    NIF n = new NIF();

    public NIF crearNif() {
        System.out.println("ingrese su DNI");
        long DNI = sc.nextLong();
        char[] vector = new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C',
            'K', 'E'};
        int mod = (int) (DNI % 23);
        return new NIF(DNI, vector[mod]);
    }

    public void mostrar(NIF per) {
        int[] dni = new int[8];
     
            String FORMATO = String.format("%08", per.getDNI());
            System.out.println("El NIF es: "+ FORMATO+"-"+per.getNIF());
       

        // int dni = (int) (per.getDNI());
        //int long = per.getDNI().length();
//Long.toString(per.getDNI());
        //    for(int=0, Long.toString(per.getDNI().length() ))<8,i++){}

        /*POSICIÓN LETRA
0 T
1 R
2 W
3 A
4 G
5 M
6 Y
7 F
8 P
9 D
10 X
11 B
12 N
13 J
14 Z
15 S
16 Q
17 V
18 H
19 L
20 C
21 K
22 E*/
 /* public char calcularNif(long dni) {
        char[] vector = new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C',
            'K', 'E'};
        int mod = (int) (dni % 23);
        return vector[mod];
    }*/
    }
}
