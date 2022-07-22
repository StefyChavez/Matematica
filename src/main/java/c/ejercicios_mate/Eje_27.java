/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c.ejercicios_mate;

/**
 *
 * @author admin
 */
public class Eje_27 {
    
    public static void main(String[] args) {
        
        int x;
        
        for (x=10;x<=30;x++){
            int area_rectangulo;
            int base = 100 - 2*x;
            int altura = x;
            area_rectangulo = base*altura;
            System.out.println("La altura: " + altura + " y base: " + base); 
            System.out.println("El area de un rectangulo es igual a: "+area_rectangulo);      
        }
    }
}
