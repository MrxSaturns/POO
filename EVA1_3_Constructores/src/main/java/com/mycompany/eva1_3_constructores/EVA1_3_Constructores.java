/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_3_constructores;

/**
 *
 * @author lalor
 */
public class EVA1_3_Constructores {

    public static void main(String[] args) {
     
    
    CuentaBancaria cuenta1  = new CuentaBancaria();    
        
    cuenta1.setNombre("Mr Burns");
    cuenta1.setNumCuenta("999");
    cuenta1.setSaldo(999999999);
    
    
    
        System.out.println("Datos del Cliente");
        System.out.println(cuenta1.getNombre());
        System.out.println(cuenta1.getNumCuenta());
        System.out.println(cuenta1.getSaldo());
        
        
        
    }

    private EVA1_3_Constructores() {
    }
    
    
    
    
    
    
    
}
