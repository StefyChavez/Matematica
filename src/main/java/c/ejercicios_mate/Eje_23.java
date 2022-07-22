/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c.ejercicios_mate;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Eje_23 {
    
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int n;
        float resultado = 0;
        System.out.println("Introducir el valor de n: ");
        n = sc.nextInt();
        
        if (n > 0){
            for(int i=1; i<=n; i++){
                resultado = resultado + (5/(float)i);
            }
            System.out.println("El resultado es: " + resultado);
        }
        else {
            System.out.println("El numero ingresado no es correcto");
        }
        
    }
}
