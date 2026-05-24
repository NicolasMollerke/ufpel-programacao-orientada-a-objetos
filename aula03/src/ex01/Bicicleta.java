/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01;

/**
 *
 * @author nicol
 */
public class Bicicleta extends Veiculo {
    private int numMarchas;
    private boolean bagageiro;
    
    public Bicicleta (String marca, String modelo, int qtdRodas, int numMarchas, boolean bagageiro){
        super(marca, qtdRodas, modelo);
        
        this.numMarchas = numMarchas;
        this.bagageiro = bagageiro;
    }
    
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Numero de Marchas: " + numMarchas);
        System.out.println("Bagageiro: " + (bagageiro ?" Sim" : "Não"));

    }
    public String toString() {
        return super.toString() + "\n" +
                "Numero de Marchas: " + numMarchas + "\n" +
                "Tem bagageiro? "   + (bagageiro ? "Sim": "Não");
    }
}
