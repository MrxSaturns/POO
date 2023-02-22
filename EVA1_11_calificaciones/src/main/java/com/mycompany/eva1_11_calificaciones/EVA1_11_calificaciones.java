/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_11_calificaciones;

import java.util.Scanner;

/**
 *
 * @author lalor
 */
public class EVA1_11_calificaciones {

    public static void main(String[] args) {
       
        System.out.println("Ingresa la calificacion: ");
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        if(num > 100)
            System.out.println("Numero no valido");
        if(num <= 100 && num >= 91)
            System.out.println("La calificacion es A");
        if(num <= 90 && num >= 81)
            System.out.println("La calificacion es B");
        if(num <=80 && num >= 71)
            System.out.println("La calificación es C");
        if(num <= 70)
            System.out.println("La calificacion es D");
        
                
    }
    
    public static String calificar(int num){
        
        
        
        
        
        
    }
    
    
    
}
