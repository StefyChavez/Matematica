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
public class Eje_28 {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num,i;
        String cad="";
        System.out.println("Cuantos numeros desea ingresar: ");
        int n = sc.nextInt();
        for(i=0;i<n;i++){
             System.out.println("Ingresa Numero: ");
             num=sc.nextInt();
             if(num<=25){
              cad=cad+" "+num;
             }
        }        
        System.out.println("Valores menores e iguales a 25: "+cad);
    }
    
}
