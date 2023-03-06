/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_16_sobrecarga;

/**
 *
 * @author lalor
 */
public class Eva1_16_sobrecarga {

    public static void main(String[] args) {
        
        System.out.println("Suma: " + suma (4.9999,9.0001));
        System.out.println("Suma: " + suma (82,38));
        System.out.println("Suma: " + suma (82.1,38.9));
        System.out.println("Suma: " + suma ("Me gusta la ","música electronica"));
        System.out.println("Suma: " + suma ("Me gustan los ","videojuegos"));
        suma();
        
        
        
    }
    
    public static int suma(int num1, int num2){
            
       return num1 + num2;     
            
       }
    
    
    
    public static double suma(double num1, double num2){
            
       return num1 + num2;     
            
       }
    
    
    
    public static String suma(String num1, String num2){
            
       return num1 + num2;     
            
       }
    
    
    public static void suma(){
            
        System.out.println("Suma: sin argumentos");   
            
       }
    
    
}
