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
public class Eje_26 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int may=0,men=0,c=0;
     while(c!=8){
        System.out.println("Ingrese un numero: ");
        int N=sc.nextInt();
        int factorial = 1;
        for (int i=1; i<=N;i++){
            factorial = factorial *i;
        }
        if(N > factorial){
            may = factorial;
        }else{
            men = factorial;
        }
        c=c+1;
        System.out.println("El factorial de : " +N+ " es: " +factorial);
        
        }
    System.out.println("Los valores mayores son: " + may);
    System.out.println("Los valores menores son: " + men);
    }
}
