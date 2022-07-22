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
public class Eje_24 {
    
    public static void main (String[] args){
        
        float notas = 0;
        float cont = 1;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresar la cantidad de notas: ");
        float cn = sc.nextFloat();
        
        while (cont <= cn){
            System.out.println("Ingrese la nota: " + cont);
            float n = sc.nextFloat();
            notas += n;
            cont++;
                      
        }
        
        float promedio = notas / cn;
        System.out.println("El promedio es: " + promedio);
        
            int rep = 0;
            int apr = 0;
            if (promedio < 7){
                rep = rep + 1;
                System.out.println("Reprobado" + rep);
            }
            else{
                apr = apr + 1;                
                System.out.println("Aprobado" + apr);
            }
    }
}
