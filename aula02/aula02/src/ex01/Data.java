/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01;

/**
 *
 * @author nicol
 */
public class Data {
    private final int dia;
    private final int mes;
    private final int ano;
    
    public Data(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
    }
    
    public Data(){
        /*
        dia = 1;
        mes = 1;
        ano = 2000;
        */
        this(1, 1, 2000);
    }
    
    public String getData(){
        String data = new String(dia + "/" + mes + "/" + ano);
        
        return data;
    }
    
    public int calcularDiferenca(Data atual){
        int diferenca = atual.ano - this.ano;
        if(atual.mes > this.mes)
            diferenca --;
        else if (atual.mes == this.mes && atual.dia > this.dia)
            diferenca --;
        
        return diferenca;
    }
}
