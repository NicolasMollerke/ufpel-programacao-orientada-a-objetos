/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01;

/**
 *
 * @author nicol
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lampada l1, l2;
        
        l1 = new Lampada();
        l2 = new Lampada();
        
        System.out.println("L1: ");
        l1.mostrar();
        
        l1.ligar();
        
        System.out.println("L1: ");
        l1.mostrar();
        
        System.out.println("L2: ");
        l2.mostrar();
    }
    
}
