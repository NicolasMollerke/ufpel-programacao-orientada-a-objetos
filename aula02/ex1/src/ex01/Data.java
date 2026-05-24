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
    public final int dia;
    public final int mes;
    public final int ano;
    
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
}
