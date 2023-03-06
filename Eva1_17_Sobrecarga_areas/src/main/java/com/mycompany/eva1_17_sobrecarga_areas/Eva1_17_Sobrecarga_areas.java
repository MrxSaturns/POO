/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_17_sobrecarga_areas;

/**
 *
 * @author lalor
 */
public class Eva1_17_Sobrecarga_areas {

    public static void main(String[] args) {
        
        System.out.println("El area del circulo es: " + area(5.5));
        System.out.println("El area del triangulo es: " + area(5.5,22));
        System.out.println("El area del trapecio es: " + area(5.5,22,41));
        
    
    
    
    
    
    }
    
    public static double area(double num1){
            
       return Math.PI * (num1 * num1);     
            
       }
    
    public static double area(double num1, double num2){
        
        return (num1 * num2)/2;
        
    }
    
    
    public static double area(double num1, double num2, double num3){
        
        return num3 * (num1 + num2)/2;
        
    }
    
    
    
    
}
