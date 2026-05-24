/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02;

import ex01.Data;
import ex01.Pessoa;

/**
 *
 * @author nicol
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Data hoje = new Data(14, 4, 2026);
        Data d1 = new Data();
        Pessoa p1 = new Pessoa("João", 1.73, d1);
        p1.imprimir();
        System.out.println("Idade: " + p1.calcularIdade(hoje));
        
        Pessoa p2 = new Pessoa("Maria", 1.75, new Data(20, 5, 2001));
        p2.imprimir();
        System.out.println("Idade: " + p2.calcularIdade(hoje));

        
        
        
    }
    
}
