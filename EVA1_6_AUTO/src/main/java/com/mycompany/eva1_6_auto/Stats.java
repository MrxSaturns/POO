/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_6_auto;

/**
 *
 * @author lalor
 */
public class Stats {
    
    private String marca;
    private String modelo;
    private String placas;
    private int año;
    private String dueño;
    private int adeudo;
    
    public String getMarca(){
        return marca;}
       
    public void setMarca(String valor){
        marca = valor; }
    
    
    public String getModelo(){
        return modelo;}
       
    public void setModelo(String valor){
        modelo = valor; }
    
    
    public String getPlacas(){
        return placas;}
       
    public void setPlacas(String valor){
        placas = valor; }
    
    
    public int getAño(){
        return año;}
       
    public void setAño(int valor){
        año = valor; }
    
    
    public String getDueño(){
        return dueño;}
       
    public void setDueño(String valor){
        dueño = valor; }
    
    
    public int getAdeudo(){
      
        return adeudo;} 
       
    public void setAdeudo(int valor){
        adeudo = valor; }
    
    
    public void adeudo(){
        if (año <= 2000)
            adeudo = 1500;
        if (año >= 2000 && año < 2006)
            adeudo = 2000;
        if (año >= 2006 && año <= 2010)
            adeudo = 2500;
        if (año > 2010 && año < 2016)
            adeudo = 3000;
        if (año >= 2016)
            adeudo = 4000;
        
                    
        
        {
    
}
    
    
    }
    
    


    
    
    public void imprimirDatos () {
            System.out.println("Nombre: " + dueño);
            System.out.println("Automovil: " + modelo + "marca " + marca);
            System.out.println("Año: " + año);
            System.out.println("Con placas: " + placas);
            System.out.println("Y con un adeudo de: $" + adeudo);
            
            
            
            
            
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
