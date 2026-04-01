/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01;

/**
 *
 * @author nicol
 */
public class Lampada {
    boolean estado;
    
    void ligar(){
        estado = true;
    }
    
    void desligar(){
        estado = false;
    }
    
    void mostrar(){
        if (estado)
            System.out.println("Lampada ligada");
        else
            System.out.println("Lampada desligada");
    }
    
}
