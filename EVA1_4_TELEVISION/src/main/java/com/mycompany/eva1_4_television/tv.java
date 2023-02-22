/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_4_television;

/**
 *
 * @author lalor
 */
public class tv {
   
    //atributos: estado
    
    private boolean power;
    private int vol;
    private int chn;
    
    // métodos: tienen comportamiento
    
    // constructor: inicializar
    
    public tv (){
        
        power = false; // tv apagada
        vol = 1;
        chn = 0;
      
    }
    
    public void cambiarPower () {
        
        if (power == false){// apagado
            power = true;// encender la tv
            System.out.println("TV encendida");
            
        }else{
            power = false;
            System.out.println("TV apagada");
        } 
    }
    
    public void subirVol(){
        
        if(power == true)
            if (vol < 100)
        vol = vol + 1;
          System.out.println("Volmen: " + vol);
    }
        
    
    
    public void bajarVol(){
        
        if (power == true){
            if (vol > 0)
        vol = vol - 1;
    
            System.out.println("Volmen: " + vol);
        
        } 
    }
    
    public void subirChn(){
        
        if (power == true){
            
            if (chn < 100)
            
            chn = chn + 1;
            
            else 
            chn = 0;
        }
        
        System.out.println("Canal: " + chn);
        
    }
    
    public void bajarChn(){
        
        if (power == true){
            
            if (chn > 0)
            
            chn = chn - 1;
               
        else 
            chn = 100;
        }
        
        System.out.println("Canal: " + chn);
        
    }
    
    
    
}
