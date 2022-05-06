/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_01_01;

/**
 *
 * @author HP
 */
public class Ejercicio_01_01 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        var perro1= new Perro();
        perro1.nombre="Jorge";
        perro1.raza="Mestizo";
        perro1.edad=3;
        perro1.peso=30; 
        perro1.duenio="Richard";
        
        var perro2= new Perro();
        perro2.nombre="Orejo";
        perro2.raza="Bassed Hount";
        perro2.edad=10;
        perro2.peso=50; 
        perro2.duenio="David";
        
        System.out.println("La mascota de: "+perro1.duenio+" se llama: "+perro1.nombre);
        System.out.println("La mascota de: "+perro2.duenio+" se llama: "+perro2.nombre);
        
        var gato1= new Gato();
        gato1.nombre="Theo";
        gato1.raza="Mestizo";
        gato1.edad=1;
        gato1.peso=15; 
        gato1.duenio="Kathy";
        
        var gato2= new Perro();
        gato2.nombre="Tommy";
        gato2.raza="Mestizo";
        gato2.edad=3;
        gato2.peso=20; 
        gato2.duenio="Kary";
        
        System.out.println("La mascota de: "+gato1.duenio+" se llama: "+gato1.nombre);
        System.out.println("La mascota de: "+gato2.duenio+" se llama: "+gato2.nombre);
        
                
                
                
        
    }
}
