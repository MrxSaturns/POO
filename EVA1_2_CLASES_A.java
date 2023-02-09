/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_2_clases_a;

/**
 *
 * @author lalor
 */
public class EVA1_2_CLASES_A {

    public static void main(String[] args) {
        
        // Crear un objeto, es decir, instanciación
        // Instanciar -> Dar memoria RAM
        Persona ppl = new Persona(); // Persona() es el constructor
       
        /* ppl.apellidos = "Landa";
        ppl.nombre = "Lalo";
        System.out.println(ppl.nombre + " " + ppl.apellidos);        */
        ppl.setNombre("Lalo");
        ppl.setApellidos("Landa");
        ppl.setEdad(99);
        ppl.setGenero('H');
        
        System.out.println(ppl.getNombre());
        
        System.out.println(ppl.getApellidos());
        
        System.out.println(ppl.getEdad() + " y/o");
        
        System.out.println(ppl.getGenero());
        
        
        
        
        
    }
}
