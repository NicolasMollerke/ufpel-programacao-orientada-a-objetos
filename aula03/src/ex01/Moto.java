/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01;

/**
 *
 * @author nicol
 */
public class Moto extends Automovel {
    
    private boolean partidaEletrica;
    
    public Moto(String marca, int qtdRodas, String modelo, double potenciaDoMotor, boolean partidaEletrica){
        super(marca, qtdRodas, modelo, potenciaDoMotor);
        
        this.partidaEletrica = partidaEletrica;
    }
    
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Partida Eletrica: " + (partidaEletrica? "Sim" : "Não"));
    }
    
}
