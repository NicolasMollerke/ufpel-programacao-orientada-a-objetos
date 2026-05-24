/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01;

/**
 *
 * @author nicol
 */
public class CadastroDeVeiculos {
    private Veiculo[] veiculos;
    private int numeroDeVeiculos;
    
    public CadastroDeVeiculos(int tamanho) {
        this.veiculos = new Veiculo[tamanho];
        this.numeroDeVeiculos = 0;
    }
    
    public CadastroDeVeiculos() {
        this(10);
    }
            
    
    public void inserir (Veiculo v) {
        if (numeroDeVeiculos == veiculos.length){
            Veiculo[] novoArray = new Veiculo[veiculos.length * 2];
            
            for(int i=0; i < veiculos.length; i++) {
                novoArray[i] = veiculos[i];
            }
            veiculos = novoArray;
        }
        veiculos[numeroDeVeiculos++] = v;

    }
    
    public Veiculo remover(int pos) {
        Veiculo v = null;
        if (pos >= 0 && pos < numeroDeVeiculos) {
            v = veiculos[pos];
            for (int i=pos; i < numeroDeVeiculos-1; i++){
               veiculos[i] = veiculos[i+1];
            }
            numeroDeVeiculos--;
        } 
        return v;
    }
    
    public Veiculo retornaItem (int pos){
        if(pos >= 0 && pos < numeroDeVeiculos) {
            return veiculos[pos];
        } else {
            return null;
        }
    }
    
    public int tamanho() {
        return numeroDeVeiculos;
    }
    
    public void imprimir() {
        for (int i=0;i < numeroDeVeiculos; i++) {
            System.out.println(veiculos[i]);
        }
    }
}
