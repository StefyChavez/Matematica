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
public class Eje_25 {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int iguales=0,may=0,men=0,c=0;
     float media=0;
     while(c!=10){
         System.out.println("Ingrese un numero: ");
         int N=sc.nextInt();
         c=c+1;
         if(N==7){
             iguales++;
         }else{
             if(N>7){
                may++;
             }else{
                 men++;
             }
         }
         media = media + N;
     }
         System.out.println("El valor de la media es: " + (media / 10));
         System.out.println("Los valores igales a 7 son: " + iguales);
         System.out.println("Los valores mayores a 7 son: " + may);
         System.out.println("Los valores menores a 7 son: " + men);
     }
}