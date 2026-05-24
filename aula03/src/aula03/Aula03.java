/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03;

import ex01.Bicicleta;
import ex01.CadastroDeVeiculos;
import ex01.Veiculo;

/**
 *
 * @author nicol
 */
public class Aula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadastroDeVeiculos lista = new CadastroDeVeiculos(2);
        lista.inserir(new Veiculo("VW", "Fusca", 4));
        lista.inserir(new Bicicleta("Caloi", "Barra Forte", 2));
        
    }
    
}
