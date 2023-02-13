/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_3_constructores;

/**
 *
 * @author lalor
 */
class CuentaBancaria {
    
    private double saldo;
    private String numCuenta;
    private String nombre;
    
    public String getNombre () {
    
        return nombre;
    
    }
    
    public void setNombre (String valor) {
        
        nombre = valor;
        
    }
    
    public String getNumCuenta () {
        
        return numCuenta;
                
    }
    
    public void setNumCuenta (String valor) {
        
        numCuenta = valor;
        
    }
    
    public double getSaldo () {
        
        return saldo;
        
    }
    
    public void setSaldo (int valor) {
        
        saldo = valor;
        
    }
    
}
