/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01;

/**
 *
 * @author nicol
 */
public class Pessoa {
    private String nome;
    private double altura;
    private Data dataDeNascimento;
    
    public Pessoa(String nome, double altura, Data dataDeNascimento){
        this.nome = nome;
        this.altura = altura;
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public Data getDataDeNascimento(){
        return this.dataDeNascimento;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void imprimir(){
        System.out.println("###########################");
        System.out.println("Nome: " + nome);
        System.out.println("ALtura: " + altura);
        System.out.println("Data de Nascimento: " + dataDeNascimento.getData());
    }
    
    public int calculaIdade(Data dataDeNascimento){
        int idade = 2026 - dataDeNascimento.ano;
        
        return idade;
    }
}
