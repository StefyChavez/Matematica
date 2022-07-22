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
public class Eje_21 {
    
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("Introducir el valor de n: ");
        n = sc.nextInt();
        System.out.println("\n Numeros del 0 al " + n +  ":");
        for (int i = 0; i<=n; i++){
            System.out.println(i);
        }
    }
    
}
