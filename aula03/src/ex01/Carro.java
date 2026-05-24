/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01;

/**
 *
 * @author nicol
 */
public class Carro extends Automovel {
    private int qtdPortas;
    
    public Carro(String marca, int qtdRodas, String modelo, double potenciaDoMotor, int qtdPortas){
        super(marca, qtdRodas, modelo, potenciaDoMotor);
        
        this.qtdPortas = qtdPortas;
    }
    
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Partida Eletrica: " + qtdPortas);
    }
}
