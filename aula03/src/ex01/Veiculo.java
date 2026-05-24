/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01;

/**
 *
 * @author nicol
 */
public class Veiculo {
    private String marca;
    private int qtdRodas;
    private String modelo;
    private int velocidade;
    
    public Veiculo(String marca, String modelo, int qtdRodas){
        this.marca = marca;
        this.qtdRodas = qtdRodas;
        this.modelo = modelo;
        this.velocidade = 0;
    }
    
    public void acelerar(int valor){
        this.velocidade += valor;
    }
    
    public void frear(int valor) {
        this.velocidade -= valor;
    }
    
    public void imprimirInformacoes() {
        System.out.println("+===============================+");
        System.out.println("Marca: " + marca);
        System.out.println("Quantidade de Rodas: " + qtdRodas);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade: " + velocidade);
    }
    
}
