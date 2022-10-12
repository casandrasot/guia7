/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g7ej10;


import java.util.Arrays;

/**
 *
 * @author HJS Informatica
 */
public class G7Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.*/
        double[] A = new double[50];
        double[] B = new double[20];
        for (int i = 0; i < 50; i++) {
            double num = (Math.random() * 50);
            A[i] = ((Math.round(num * 100.0) / 100.0));

        }
        for (double i : A) {
            System.out.print("[" + i + "]");
        }
        Arrays.sort(A);
        
        System.out.println("\n"+"el vector ordenado es: ");
        for (double i : A) {
            System.out.print("[" + i + "]");
        }
        for (int i = 0; i < 10; i++) {
            B[i]=A[i];
        }
        for (int i = 10; i < 20; i++) {
            B[i]=0.5;
        }
        
        System.out.println("\n"+"el vector B es:");
        for(double i:B){
            System.out.print("["+i+"]");}

    }

}
