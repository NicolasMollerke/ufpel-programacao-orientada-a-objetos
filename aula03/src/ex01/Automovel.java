/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01;

/**
 *
 * @author nicol
 */
public class Automovel extends Veiculo{
    private double potenciaDoMotor;
    
    public Automovel (String marca, int qtdRodas, String modelo, double potenciaDoMotor){
        super(marca, qtdRodas, modelo);
        
        this.potenciaDoMotor = potenciaDoMotor;
    }
    
    public void imprimirInformacoes (){
        super.imprimirInformacoes();
        System.out.println("Potencia do Motor: " + potenciaDoMotor);
    }
    
}
